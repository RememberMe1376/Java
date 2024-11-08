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

    private JTextField xField, yField, widthField, heightField, radiusField;

    public ShapeDrawer() {
        setTitle("Basic Shape Drawer");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        shapeComboBox = new JComboBox<>(new String[] { "Square", "Rectangle", "Circle", "Polygon" });
        controlPanel.add(new JLabel("Shape:"));
        controlPanel.add(shapeComboBox);

        filledCheckBox = new JCheckBox("Filled");
        controlPanel.add(filledCheckBox);

        colorButton = new JButton("Choose Color");
        colorButton.addActionListener(e -> {
            Color selectedColor = JColorChooser.showDialog(null, "Choose a color", chosenColor);
            if (selectedColor != null) {
                chosenColor = selectedColor;
                colorButton.setBackground(chosenColor);
            }
        });
        controlPanel.add(colorButton);

        xField = new JTextField("100", 5);
        yField = new JTextField("100", 5);
        widthField = new JTextField("100", 5);
        heightField = new JTextField("100", 5);
        radiusField = new JTextField("50", 5);

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

        drawingPanel = new DrawingPanel();
        add(drawingPanel, BorderLayout.CENTER);

        JButton drawButton = new JButton("Draw Shape");
        drawButton.addActionListener(new DrawButtonListener());
        controlPanel.add(drawButton);

        setVisible(true);
    }

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

    private class DrawButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedShape = (String) shapeComboBox.getSelectedItem();
            Shape shape = null;

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
