// [Bài tập] Hiển thị ra những số chia hết cho cả 3 và 5 trong khoảng từ 1 đến 100
// 1. Mục tiêu:
// Luyện tập vòng lặp cùng cấu trúc câu lệnh điều kiện if else
// 2. Mô tả:
// - Hệ thống sử dụng vòng lặp chạy từ 1 đến 100
// - Sẽ sử dụng câu lệnh điều kiện để hiển thị
// - Nếu có thì hiển thị ra số đó
// - Nếu không thì không hiển thị ra gì cả

package ra.exercise;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println("Các số chia hết cho 3 và 5 từ 1 đến 100 là:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf("%d \t", i);
            }
        }
    }
}
