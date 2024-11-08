import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class ImageDisplayApp extends JFrame {
    private ArrayList<BufferedImage> images = new ArrayList<>();
    private ArrayList<ImageIcon> imageIcons = new ArrayList<>();
    private JPanel imagePanel;
    private JTextField widthField, heightField;
    private JButton changeSizeButton;

    public ImageDisplayApp() {
        setTitle("Image Display App");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton openButton = new JButton("Open Images");
        openButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openImages();
            }
        });

        JPanel sizePanel = new JPanel();
        widthField = new JTextField(5);
        heightField = new JTextField(5);
        changeSizeButton = new JButton("Change Size");
        sizePanel.add(new JLabel("Width:"));
        sizePanel.add(widthField);
        sizePanel.add(new JLabel("Height:"));
        sizePanel.add(heightField);
        sizePanel.add(changeSizeButton);

        changeSizeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                changeWindowSize();
            }
        });

        imagePanel = new JPanel();
        imagePanel.setLayout(new FlowLayout());

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new BorderLayout());
        controlPanel.add(openButton, BorderLayout.NORTH);
        controlPanel.add(new JScrollPane(imagePanel), BorderLayout.CENTER);
        controlPanel.add(sizePanel, BorderLayout.SOUTH);

        add(controlPanel);

        setVisible(true);
    }

    private void openImages() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setMultiSelectionEnabled(true);
        fileChooser
                .setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Image Files", "jpg", "png", "gif"));

        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File[] selectedFiles = fileChooser.getSelectedFiles();
            for (File file : selectedFiles) {
                try {
                    BufferedImage image = ImageIO.read(file);
                    images.add(image);
                    imageIcons.add(new ImageIcon(image));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            updateImagePanel();
        }
    }

    private void updateImagePanel() {
        imagePanel.removeAll();
        for (ImageIcon icon : imageIcons) {
            JLabel label = new JLabel(icon);
            imagePanel.add(label);
        }
        revalidate();
        repaint();
    }

    private void changeWindowSize() {
        try {
            int width = Integer.parseInt(widthField.getText());
            int height = Integer.parseInt(heightField.getText());
            setSize(width, height);
            setLocationRelativeTo(null);
            revalidate();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid size input.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ImageDisplayApp();
            }
        });
    }
}
