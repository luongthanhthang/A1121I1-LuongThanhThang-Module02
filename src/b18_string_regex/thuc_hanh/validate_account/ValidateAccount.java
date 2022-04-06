package b18_string_regex.thuc_hanh.validate_account;

import java.util.Scanner;
import java.util.regex.Pattern;

/*Một tài khoản hợp lệ cần đạt các yêu cầu sau:
Không chứa các ký tự đặc biệt
Ít nhất là 6 ký tự
Không chứa các ký tự viết hoa
Cho phép dấu gạch dưới (_)
 */
public class ValidateAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER String input: ");
        String input = scanner.nextLine();
        String pattern = "^[a-z0-9_]{6,}$";
        if(Pattern.matches(pattern, input)) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}
