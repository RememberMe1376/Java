import java.util.concurrent.Semaphore;

public class OrderedForkPickupDining {
    private static final int NUM_PHILOSOPHERS = 5;
    private static final Semaphore[] forks = new Semaphore[NUM_PHILOSOPHERS];

    public static void main(String[] args) {
        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            forks[i] = new Semaphore(1);
        }

        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            int id = i;
            new Thread(() -> philosopher(id)).start();
        }
    }

    private static void philosopher(int id) {
        int leftFork = id;
        int rightFork = (id + 1) % NUM_PHILOSOPHERS;

        try {
            while (true) {
                System.out.println("Triết gia " + id + " đang suy nghĩ.");
                Thread.sleep((int) (Math.random() * 1000));

                System.out.println("Triết gia " + id + " đang đói.");
                if (id % 2 == 0) {
                    forks[leftFork].acquire();
                    forks[rightFork].acquire();
                } else {
                    forks[rightFork].acquire();
                    forks[leftFork].acquire();
                }

                System.out.println("Triết gia " + id + " đang ăn.");
                Thread.sleep((int) (Math.random() * 1000));

                forks[leftFork].release();
                forks[rightFork].release();
                System.out.println("Triết gia " + id + " đặt đũa xuống.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}