/**
 * File: ContinuousSignal.java
 * Mô tả: Lớp này đại diện cho tín hiệu liên tục và chứa các phương thức liên quan đến xử lý tín hiệu liên tục.
 * 
 * Tác giả: Trần Thị Lan
 * Ngày tạo: 10/9/2024
 * Phiên bản: 1.0
 * Email: 22010135@st.phenikaa-uni.edu.vn
 * 
 * Ghi chú: Lớp này là một phần của hệ thống xử lý tín hiệu liên tục.
 */
package btgk;

// Lớp ContinuousSignal kế thừa từ interface Signal
class ContinuousSignal implements Signal {
    private double amplitude;
    private double frequency;
    private double phase;  

    public ContinuousSignal(double amplitude, double frequency, double phase) {
        this.amplitude = amplitude;
        this.frequency = frequency;
        this.phase = phase;
    }
    // hàm setter, getter
    public void setAmplitude(double amplitude){
        this.amplitude = amplitude;
    }
    public double getAmplitude(){
        return amplitude;
    }
    public void setFrequency(double frequency){
        this.frequency = frequency;
    }
    public double getFrequency(){
        return frequency;
    }
    public void setPhase(double phase){
        this.phase =phase;
    }
    public double getPhase(){
        return phase;
    }


    @Override
    public void showSignalInfo() {
        System.out.println("Continuous Signal with Amplitude: " + amplitude 
                           + ", Frequency: " + frequency 
                           + ", Phase: " + phase);
    }

    
    public double calculateSignal(double time) {
        return amplitude * Math.sin(2 * Math.PI * frequency * time + phase);
    }
}
