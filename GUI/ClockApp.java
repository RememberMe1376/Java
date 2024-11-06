import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ClockApp extends JPanel implements Runnable {
    private int hour, minute, second;

    public ClockApp() {
        Thread clockThread = new Thread(this);
        clockThread.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Vẽ mặt đồng hồ với các số 3, 6, 9, 12
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 3;
        int radius = Math.min(centerX, centerY) - 20;

        g.drawOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("3", centerX + radius - 20, centerY + 5);
        g.drawString("6", centerX - 5, centerY + radius - 10);
        g.drawString("9", centerX - radius + 10, centerY + 5);
        g.drawString("12", centerX - 10, centerY - radius + 20);

        // Lấy thời gian hiện tại
        Calendar calendar = new GregorianCalendar();
        hour = calendar.get(Calendar.HOUR_OF_DAY);
        minute = calendar.get(Calendar.MINUTE);
        second = calendar.get(Calendar.SECOND);

        // Vẽ kim giây
        double secondAngle = Math.toRadians(second * 6 - 90);
        int secondX = (int) (centerX + radius * 0.9 * Math.cos(secondAngle));
        int secondY = (int) (centerY + radius * 0.9 * Math.sin(secondAngle));
        g.setColor(Color.RED);
        g.drawLine(centerX, centerY, secondX, secondY);

        // Vẽ kim phút
        double minuteAngle = Math.toRadians(minute * 6 - 90);
        int minuteX = (int) (centerX + radius * 0.75 * Math.cos(minuteAngle));
        int minuteY = (int) (centerY + radius * 0.75 * Math.sin(minuteAngle));
        g.setColor(Color.BLUE);
        g.drawLine(centerX, centerY, minuteX, minuteY);

        // Vẽ kim giờ
        double hourAngle = Math.toRadians((hour % 12 + minute / 60.0) * 30 - 90);
        int hourX = (int) (centerX + radius * 0.5 * Math.cos(hourAngle));
        int hourY = (int) (centerY + radius * 0.5 * Math.sin(hourAngle));
        g.setColor(Color.BLACK);
        g.drawLine(centerX, centerY, hourX, hourY);

        // Hiển thị thời gian định dạng 24h bên dưới
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 18));
        String timeString = String.format("%02d:%02d:%02d", hour, minute, second);
        g.drawString("Time: " + timeString, centerX - 50, centerY + radius + 40);
    }

    @Override
    public void run() {
        while (true) {
            repaint();
            try {
                Thread.sleep(1000); // Cập nhật mỗi giây
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Analog Clock");
        ClockApp clock = new ClockApp();
        frame.add(clock);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
