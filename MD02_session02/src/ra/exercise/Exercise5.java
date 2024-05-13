// [Bài tập] Hiển thị các số nguyên tố nhỏ hơn 100
// 1. Mục tiêu:
//Luyện tập sử dụng cấu trúc lặp
// 2. Mô tả:
// Trong phần này chúng ta sẽ phát triển một ứng dụng cho phép hiển thị các số nguyên tố nhỏ hơn 100
// Số nguyên tố là một số nguyên dương chỉ chia hết cho 1 và chính nó

package ra.exercise;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100 là:");
        for(int i = 2; i <= 100; i++) {
            if(checkPrime(i)) {
                System.out.print(i + " ");
            }
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
