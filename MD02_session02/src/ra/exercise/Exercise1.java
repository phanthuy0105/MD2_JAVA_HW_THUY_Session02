// [Bài tập] Kiểm tra 1 số có chia hết cho 3 và 5
// 1. Mục tiêu:
// Luyện tập khai báo biến, toán tử và sử dụng cú pháp câu lệnh điều kiện if else
// 2. Mô tả:
// Xây dựng một ứng dụng cho phép người dùng nhập vào 1 số tự nhiên
// và kiểm tra xem số đó có chia hết cho 3 và 5 hay không


package ra.exercise;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        // 1. Khai báo Scanner
        Scanner scanner = new Scanner(System.in);
        // 2. Thông báo nhập vào số nguyên
        System.out.println("Nhập vào một số nguyên:");
        // 3. Lưu giá trị nhập vào biến số nguyên
        int number = Integer.parseInt(scanner.nextLine());
        // 4. Kiểm tra và in ra số có chia hết cho 3 và 5 không
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.printf("%d chia hết cho 3 và 5\n", number);
        } else {
            System.out.printf("%d không chia hết cho 3 và 5\n", number);
        }
    }
}
