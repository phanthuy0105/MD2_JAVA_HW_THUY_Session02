// [Bài tập] Tính tổng các số chẵn trong khoảng cho trước
// 1. Mục tiêu:
// Luyện tập sử dụng cấu trúc vòng lặp for
// 2. Mô tả:
// Trong phần này, chúng ta sẽ phát triển một ứng dụng cho phép người dùng nhập vào 1 khoảng số tự nhiên
// và yêu cầu tính tổng các số chẵn nằm trong khoảng đó

package ra.exercise;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số: ");
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= number; ++i) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Tổng các số chẵn trong các số vừa nhập là: " + sum);
    }
}
