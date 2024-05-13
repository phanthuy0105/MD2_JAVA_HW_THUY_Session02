// [Bài tập] Xác thực dữ liệu sử dụng vòng lặp
// 1. Mục tiêu:
// Luyện tập sử dụng vòng lặp while
// 2. Mô tả:
// Trong phần này, chúng ta sẽ phát triển một ứng dụng cho phép người dùng
// nhập vào 3 cạnh của một tam giác kiểm tra xem
// nếu 3 cạnh đấy thỏa mãn điều kiện trở thành 1 tam giác thì
// cho phép tính diện tích và chu vi nếu không thì bắt người dùng nhập lại

package ra.exercise;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào cạnh số 1: ");
        float edge1 = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập vào cạnh số 2: ");
        float edge2 = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập vào cạnh số 3: ");
        float edge3 = Float.parseFloat(scanner.nextLine());
        if (edge1 + edge2 > edge3 && edge2 + edge3 > edge1 && edge3 + edge1 > edge2) {
            float perimeter = edge1 + edge2 + edge3;
            System.out.println("Chu vi của tam giác bằng = " + perimeter);
            float halfPerimeter = perimeter/2;
            float acreage = (float) Math.sqrt(halfPerimeter*(halfPerimeter-edge1)*(halfPerimeter-edge2)*(halfPerimeter-edge3));
            System.out.println("Ba số trên là ba cạnh của tam giác");
            System.out.printf("Hình tam giác có chu vi là: %f - Diện tích là: %f\n",perimeter, acreage );
        } else {
            System.out.println("Ba số không phải là 3 cạnh của 1 tam giác");
        }
    }
    // BÀI NÀY EM KHÔNG BIẾT LÀM VÒNG LẶP WHILE NÊN E SỬ DỤNG IF ELSE KHÔNG BIẾT SAI KHÔNG Ạ
}
