// [Bài tập] Tạo menu chức năng
// 1. Mục tiêu:
// Luyện tập sử dụng cấu trúc vòng lặp while
// 2. Mô tả:
// Trong phần này, chúng ta sẽ phát triển một ứng dụng nhiều chức năng
// cho phép người dùng chọn chức năng để sử dụng
// Menu gồm:
// Kiểm tra tính chẵn lẻ của 1 số
// Kiểm tra số nguyên tố
// Kiểm tra một số có chia hết cho 3 không
// Thoát


package ra.exercise;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập vào một số nguyên: ");
                    int number = Integer.parseInt(scanner.nextLine());
                    if (number % 2 == 0) {
                        System.out.printf("%d là số chẵn\n", number);
                    } else {
                        System.out.printf("%d là số lẻ\n", number);
                    }
                    break;
                case 2:
                    System.out.println("Nhập vào n: ");
                    int n = Integer.parseInt(scanner.nextLine());
                    boolean isPrime = true;
                    if (n < 2) {
                        System.out.printf(n + " không phải là số nguyên tố");
                    }

                    for (int i = 2; i <= Math.sqrt(n); i++) {
                        if (n % i == 0) {
                            isPrime = false;
                        }
                    }
                    if (isPrime) {
                        System.out.printf(n + " là số nguyên tố");
                    } else {
                        System.out.printf(n + " không phải là số nguyên tố");
                    }
                    break;
                case 3:
                    System.out.println("Nhập vào một số: ");
                    int number2 = Integer.parseInt(scanner.nextLine());
                    if (number2 % 3 == 0) {
                        System.out.printf("%d chia hết cho 3\n", number2);
                    } else if (number2 % 3 == 1) {
                        System.out.printf("%d chia 3 dư 1\n", number2);
                    } else {
                        System.out.printf("%d chia 3 dư 2\n", number2);
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng nhập từ 1-4");
            }
        } while (true);
    }
}
