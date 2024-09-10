/**
 * File: DiscreteSignal.java
 * Mô tả: Lớp này đại diện cho tín hiệu không liên tục và chứa các phương thức liên quan đến xử lý tín hiệu không liên tục.
 * 
 * Tác giả: Trần Thị Lan
 * Ngày tạo: 10/9/2024
 * Phiên bản: 1.0
 * Email: 22010135@st.phenikaa-uni.edu.vn
 * 
 * Ghi chú: Lớp này là một phần của hệ thống xử lý tín hiệu không liên tục.
 */
package btgk;

class DiscreteSignal implements Signal {
    private double[] values;  // Mảng lưu trữ các giá trị của tín hiệu rời rạc

    public DiscreteSignal(double[] values) {
        this.values = values;
    }
    public int delta(int n) {
        return (n == 0) ? 1 : 0;
    }

    // Hàm x(n) theo công thức
    public double calculateXn(int n, int k, double[] x) {
        return x[k] * delta(n - k);
    }

    @Override
    public void showSignalInfo() {
        System.out.println("Discrete Signal:");
        for (double value : values) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
   
}

