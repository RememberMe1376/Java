import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class ShapeDrawer extends JFrame {
    private JPanel controlPanel;
    private DrawingPanel drawingPanel;
    private JComboBox<String> shapeComboBox;
    private JCheckBox filledCheckBox;
    private JButton colorButton;
    private Color chosenColor = Color.BLACK;

    // Thêm các JTextField để nhập tham số
    private JTextField xField, yField, widthField, heightField, radiusField;

    public ShapeDrawer() {
        setTitle("Basic Shape Drawer");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel điều khiển
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        // ComboBox chọn loại hình
        shapeComboBox = new JComboBox<>(new String[] { "Square", "Rectangle", "Circle", "Polygon" });
        controlPanel.add(new JLabel("Shape:"));
        controlPanel.add(shapeComboBox);

        // Checkbox chọn kiểu rỗng/đặc
        filledCheckBox = new JCheckBox("Filled");
        controlPanel.add(filledCheckBox);

        // Nút chọn màu
        colorButton = new JButton("Choose Color");
        colorButton.addActionListener(e -> {
            Color selectedColor = JColorChooser.showDialog(null, "Choose a color", chosenColor);
            if (selectedColor != null) {
                chosenColor = selectedColor;
                colorButton.setBackground(chosenColor);
            }
        });
        controlPanel.add(colorButton);

        // Các trường nhập liệu cho toạ độ và kích thước
        xField = new JTextField("100", 5);
        yField = new JTextField("100", 5);
        widthField = new JTextField("100", 5);
        heightField = new JTextField("100", 5);
        radiusField = new JTextField("50", 5); // Chỉ sử dụng cho hình tròn

        controlPanel.add(new JLabel("X:"));
        controlPanel.add(xField);
        controlPanel.add(new JLabel("Y:"));
        controlPanel.add(yField);
        controlPanel.add(new JLabel("Width:"));
        controlPanel.add(widthField);
        controlPanel.add(new JLabel("Height:"));
        controlPanel.add(heightField);
        controlPanel.add(new JLabel("Radius:"));
        controlPanel.add(radiusField);

        add(controlPanel, BorderLayout.NORTH);

        // Panel vẽ
        drawingPanel = new DrawingPanel();
        add(drawingPanel, BorderLayout.CENTER);

        // Nút vẽ hình
        JButton drawButton = new JButton("Draw Shape");
        drawButton.addActionListener(new DrawButtonListener());
        controlPanel.add(drawButton);

        setVisible(true);
    }

    // Lớp để vẽ các hình
    private class DrawingPanel extends JPanel {
        private Shape shape;

        public void setShape(Shape shape) {
            this.shape = shape;
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (shape != null) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setColor(chosenColor);
                if (filledCheckBox.isSelected()) {
                    g2d.fill(shape);
                } else {
                    g2d.draw(shape);
                }
            }
        }
    }

    // ActionListener cho nút "Draw Shape"
    private class DrawButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedShape = (String) shapeComboBox.getSelectedItem();
            Shape shape = null;

            // Đọc các tham số từ JTextField
            int x = Integer.parseInt(xField.getText());
            int y = Integer.parseInt(yField.getText());
            int width = Integer.parseInt(widthField.getText());
            int height = Integer.parseInt(heightField.getText());
            int radius = Integer.parseInt(radiusField.getText());

            switch (selectedShape) {
                case "Square":
                    shape = new Rectangle2D.Double(x, y, width, width);
                    break;
                case "Rectangle":
                    shape = new Rectangle2D.Double(x, y, width, height);
                    break;
                case "Circle":
                    shape = new Ellipse2D.Double(x, y, radius * 2, radius * 2);
                    break;
                case "Polygon":
                    int[] xPoints = { x, x + width, x + width / 2, x - width / 2 };
                    int[] yPoints = { y, y, y + height, y + height };
                    shape = new Polygon(xPoints, yPoints, xPoints.length);
                    break;
            }

            drawingPanel.setShape(shape);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ShapeDrawer::new);
    }
}
