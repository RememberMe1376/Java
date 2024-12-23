import java.util.*;

public class J08012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] deg = new int[N + 1];

        for (int i = 0; i < N - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            deg[u]++;
            deg[v]++;
        }

        int centerCount = 0;
        int leafCount = 0;

        for (int i = 1; i <= N; i++) {
            if (deg[i] == N - 1) {
                centerCount++;
            } else if (deg[i] == 1) {
                leafCount++;
            } else if (deg[i] > 1) {
                System.out.println("No");
                return;
            }
        }

        if (centerCount == 1 && leafCount == N - 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
