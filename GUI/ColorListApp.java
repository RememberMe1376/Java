import javax.swing.*;
import java.awt.*;

public class ColorListApp extends JFrame {
    private JPanel colorPanel;

    public ColorListApp() {
        setTitle("Color List Chooser");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        String[] colors = { "Red", "Green", "Blue", "Yellow", "Cyan", "Magenta" };
        JList<String> colorList = new JList<>(colors);
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        colorPanel = new JPanel();
        colorPanel.setBackground(Color.WHITE);

        colorList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                String selectedColor = colorList.getSelectedValue();
                changeBackgroundColor(selectedColor);
            }
        });

        setLayout(new BorderLayout());
        add(new JScrollPane(colorList), BorderLayout.WEST);
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
            ColorListApp app = new ColorListApp();
            app.setVisible(true);
        });
    }
}