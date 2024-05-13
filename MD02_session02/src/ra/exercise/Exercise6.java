// [Bài tập] Hiển thị 20 số nguyên tố đầu tiên
// 1. Mục tiêu:
// Luyện tập sử dụng biến, kiểu dữ liệu và các toán tử
// 2. Mô tả:
// Trong phần này, chúng ta sẽ phát triển một ứng dụng cho phép hiển thị 20 số nguyên tố đầu tiên

package ra.exercise;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào n số nguyên tố đầu tiên: ");
        int n = Integer.parseInt(scanner.nextLine());
        int i = 2;
        int count = 1;
        while(count <= n) {
            if(checkPrime(i)) {
                System.out.println(i + "");
                count++;
            }
            i+=count;
        }
    }
    public static boolean checkPrime(int number) {
        if(number < 2) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
