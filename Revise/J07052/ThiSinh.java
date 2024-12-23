package J07052;

public class ThiSinh {
    private String id, ten, status;
    private double toan, ly, hoa, uuTien, total;

    public ThiSinh(String id, String ten, double toan, double ly, double hoa) {
        this.id = id;
        this.ten = formatName(ten);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        this.uuTien = calculatePriority();
        this.total = toan * 2 + ly + hoa + uuTien;
    }

    public String getId() {
        return id;
    }

    public Double getTotal() {
        return total;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private double calculatePriority() {
        switch (id.charAt(2)) {
            case '1':
                return 0.5;
            case '2':
                return 1.0;
            case '3':
                return 2.5;
        }
        return 0.0;
    }

    private String formatName(String name) {
        String[] words = name.trim().split("\\s+");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
        }
        return String.join(" ", words);
    }

    @Override
    public String toString() {
        return id + " " + ten + " "
                + (uuTien == (int) uuTien ? (int) uuTien : String.format("%.1f", uuTien)) + " "
                + (total == (int) total ? (int) total : String.format("%.1f", total)) + " " + status;
    }
}
