import java.util.Scanner;

class TienTrinh {
    int ma; // Ma tien trinh
    int thoiGianCPU; // Thoi gian CPU yeu cau
    int thoiGianCho; // Thoi gian cho
    int thoiGianQuayVong; // Thoi gian quay vong

    public TienTrinh(int ma, int thoiGianCPU) {
        this.ma = ma;
        this.thoiGianCPU = thoiGianCPU;
    }
}

public class SPF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai bao mang tien trinh
        TienTrinh[] tienTrinhList = new TienTrinh[5];

        // Nhap thong tin cho 5 tien trinh
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhap thoi gian CPU cho tien trinh " + (i + 1) + ": ");
            int thoiGianCPU = scanner.nextInt();
            tienTrinhList[i] = new TienTrinh(i + 1, thoiGianCPU);
        }

        // Sap xep cac tien trinh theo thoi gian CPU yeu cau (thoi gianCPU) theo thu tu
        // tang dan
        for (int i = 0; i < tienTrinhList.length - 1; i++) {
            for (int j = i + 1; j < tienTrinhList.length; j++) {
                if (tienTrinhList[i].thoiGianCPU > tienTrinhList[j].thoiGianCPU) {
                    // Hoan doi cac tien trinh
                    TienTrinh temp = tienTrinhList[i];
                    tienTrinhList[i] = tienTrinhList[j];
                    tienTrinhList[j] = temp;
                }
            }
        }

        // Tinh toan thoi gian cho va thoi gian quay vong cho moi tien trinh
        int tongThoiGianCho = 0;
        int tongThoiGianQuayVong = 0;
        for (int i = 0; i < tienTrinhList.length; i++) {
            if (i == 0) {
                tienTrinhList[i].thoiGianCho = 0; // Tien trinh dau tien khong cho
            } else {
                tienTrinhList[i].thoiGianCho = tienTrinhList[i - 1].thoiGianCho + tienTrinhList[i - 1].thoiGianCPU;
            }
            tienTrinhList[i].thoiGianQuayVong = tienTrinhList[i].thoiGianCho + tienTrinhList[i].thoiGianCPU;

            tongThoiGianCho += tienTrinhList[i].thoiGianCho;
            tongThoiGianQuayVong += tienTrinhList[i].thoiGianQuayVong;
        }

        // In ket qua
        System.out.println("\nKet qua sap xep va tinh toan:");
        System.out.println("Tien trinh | Thoi gian CPU | Thoi gian cho | Thoi gian quay vong");
        for (int i = 0; i < tienTrinhList.length; i++) {
            System.out.println("P" + tienTrinhList[i].ma + "\t\t" + tienTrinhList[i].thoiGianCPU + "\t\t"
                    + tienTrinhList[i].thoiGianCho + "\t\t" + tienTrinhList[i].thoiGianQuayVong);
        }

        // Tinh va in ra thoi gian cho trung binh va thoi gian quay vong trung binh
        double thoiGianChoTrungBinh = (double) tongThoiGianCho / tienTrinhList.length;
        double thoiGianQuayVongTrungBinh = (double) tongThoiGianQuayVong / tienTrinhList.length;

        System.out.println("\nThoi gian cho trung binh: " + thoiGianChoTrungBinh);
        System.out.println("Thoi gian quay vong trung binh: " + thoiGianQuayVongTrungBinh);

        scanner.close();
    }
}
