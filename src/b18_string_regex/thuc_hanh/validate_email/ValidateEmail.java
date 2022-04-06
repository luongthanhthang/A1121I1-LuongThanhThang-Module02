package b18_string_regex.thuc_hanh.validate_email;

import java.util.Scanner;
import java.util.regex.Pattern;

/* Một email hợp lệ cần đạt các yêu cầu sau:
Bắt đầu bằng một ký tự
Không chứa các ký tự đặc biệt
Có một ký tự @ ngăn cách tên email và domain
Domain phải hợp lệ */
public class ValidateEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER String input: ");
        String input = scanner.nextLine();
        String pattern = "^[A-Za-z0-9]@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

        if(Pattern.matches(pattern, input)) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}
