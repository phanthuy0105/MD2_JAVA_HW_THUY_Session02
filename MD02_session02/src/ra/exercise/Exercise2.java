// [Bài tập] Chuyển đổi số thành chữ
// 1. Mục tiêu:
// Luyện tập sử dụng cú pháp switch case
// 2. Mô tả:
// Xây dựng một ứng dụng cho phép người dùng nhập vào 1 số từ 0 => 9
// và hiển thị cách đọc của số đó trên màn hình
// VD: người dùng nhập vào 1 thì hiển thị “Số Một”

package ra.exercise;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        // B1: Nhập vào 1 số 0-9
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số nguyên (0-9):");
        int number = Integer.parseInt(scanner.nextLine());
        //B2: Sử dụng switch...case phiên âm số đó
        switch (number){
            case 0:
                System.out.println("Không");
                break;
            case 1:
                System.out.println("Số Một");
                break;
            case 2:
                System.out.println("Số Hai");
                break;
            case 3:
                System.out.println("Số Ba");
                break;
            case 4:
                System.out.println("Số Bốn");
                break;
            case 5:
                System.out.println("Số Năm");
                break;
            case 6:
                System.out.println("Số Sáu");
                break;
            case 7:
                System.out.println("Số Bảy");
                break;
            case 8:
                System.out.println("Số Tám");
                break;
            default:
                System.out.println("Số Chín");
        }
    }
}
