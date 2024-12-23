package Contest;

import java.util.Scanner;
import java.util.Stack;

class Pair {
    int fi, se;

    Pair(int fi, int se) {
        this.fi = fi;
        this.se = se;
    }

    public int getFi() {
        return fi;
    }

    public int getSe() {
        return se;
    }

    public void incCount() {
        se++;
    }
}

public class B9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Pair> st = new Stack<>();
        long res = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            while (!st.empty() && st.peek().getFi() < a) {
                res += st.peek().getSe();
                st.pop();
            }
            if (!st.empty()) {
                if (st.peek().getFi() == a) {
                    res += st.peek().getSe();
                    st.peek().incCount();
                    if (st.size() > 1) {
                        res++;
                    }
                } else {
                    res++;
                    st.push(new Pair(a, 1));
                }
            } else {
                st.push(new Pair(a, 1));
            }
        }
        System.out.println(res);
    }
}
