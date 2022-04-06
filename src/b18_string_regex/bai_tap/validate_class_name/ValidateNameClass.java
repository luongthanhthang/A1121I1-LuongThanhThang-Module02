package b18_string_regex.bai_tap.validate_class_name;

import java.util.Scanner;
import java.util.regex.Pattern;

/*Tên một lớp học hợp lệ cần đạt các yêu cầu sau:
Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P
Không chứa các ký tự đặc biệt
Theo sau ký tự bắt đầu là 4 ký tự số
Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K, L, M
Ví dụ tên lớp hợp lệ: C0318G
Ví dụ tên lớp không hợp lệ: M0318G, P0323A
 */
public class ValidateNameClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER String input: ");
        String input = scanner.nextLine();
        String pattern = "^(C|A|P)[\\d]{4}(G|H|I|K|L|M)$";
        if(Pattern.matches(pattern, input)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
