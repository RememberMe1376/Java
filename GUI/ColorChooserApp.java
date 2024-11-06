import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChooserApp extends JFrame {
    private JPanel colorPanel;

    public ColorChooserApp() {
        setTitle("Color Chooser Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel hiển thị màu nền
        colorPanel = new JPanel();
        colorPanel.setBackground(Color.WHITE);

        // Nút chọn màu
        JButton chooseColorButton = new JButton("Choose Color");
        chooseColorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mở hộp thoại chọn màu
                Color selectedColor = JColorChooser.showDialog(null, "Select a Color", colorPanel.getBackground());
                if (selectedColor != null) { // Nếu người dùng chọn một màu (không nhấn Cancel)
                    colorPanel.setBackground(selectedColor); // Thay đổi màu nền
                }
            }
        });

        // Layout và thêm các thành phần vào frame
        setLayout(new BorderLayout());
        add(chooseColorButton, BorderLayout.NORTH);
        add(colorPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ColorChooserApp app = new ColorChooserApp();
            app.setVisible(true);
        });
    }
}
