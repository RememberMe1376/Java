import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorComboBoxApp extends JFrame {
    private JPanel colorPanel;

    public ColorComboBoxApp() {
        setTitle("Color Chooser");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Tạo danh sách các màu
        String[] colors = { "Red", "Green", "Blue", "Yellow", "Cyan", "Magenta" };
        JComboBox<String> colorComboBox = new JComboBox<>(colors);

        // Panel hiển thị màu nền
        colorPanel = new JPanel();
        colorPanel.setBackground(Color.WHITE);

        // Thêm hành động khi chọn màu
        colorComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedColor = (String) colorComboBox.getSelectedItem();
                changeBackgroundColor(selectedColor);
            }
        });

        // Layout và thêm các thành phần vào frame
        setLayout(new BorderLayout());
        add(colorComboBox, BorderLayout.NORTH);
        add(colorPanel, BorderLayout.CENTER);
    }

    private void changeBackgroundColor(String colorName) {
        switch (colorName) {
            case "Red":
                colorPanel.setBackground(Color.RED);
                break;
            case "Green":
                colorPanel.setBackground(Color.GREEN);
                break;
            case "Blue":
                colorPanel.setBackground(Color.BLUE);
                break;
            case "Yellow":
                colorPanel.setBackground(Color.YELLOW);
                break;
            case "Cyan":
                colorPanel.setBackground(Color.CYAN);
                break;
            case "Magenta":
                colorPanel.setBackground(Color.MAGENTA);
                break;
            default:
                colorPanel.setBackground(Color.WHITE);
                break;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ColorComboBoxApp app = new ColorComboBoxApp();
            app.setVisible(true);
        });
    }
}
