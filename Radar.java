/**
 * File: Radar.java
 * Mô tả: lớp (class) Radar phân tích tín hiệu với mẫu tín hiệu rời rạc
 * 
 * Tác giả: Trần Thị Lan
 * Ngày tạo: 10/9/2024
 * Phiên bản: 1.0
 * Email: 22010135@st.phenikaa-uni.edu.vn
 * 
 * Ghi chú: Lớp này phân tích tín hiệu với mẫu tín hiệu không rời rạc
 */
package btgk;
class Radar {
    // Tín hiệu rời rạc mẫu
    public double[] sampleSignal() {
        double[] X = new double[16]; // Tín hiệu mẫu từ 0 đến 15
        for (int i = 0; i <= 15; i++) {
            X[i] = 1 - (i / 15.0); // Công thức mẫu: 1 - n/15 với 0 <= n <= 15
        }
        return X;
    }

    // Hàm phân tích tín hiệu với n = 4
    public void analyzeSignal(int n) {
        double[] X = sampleSignal(); // Lấy chuỗi tín hiệu mẫu
        System.out.println("Tín hiệu rời rạc tại n = " + n + ": " + X[n]);
    }



    public static void main(String[] args) {
        Radar radar = new Radar();
        radar.analyzeSignal(4);  // Đưa đầu ra của chuỗi tín hiệu rời rạc tại n = 4
    }
}



