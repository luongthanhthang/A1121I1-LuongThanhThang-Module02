package b18_string_regex.bai_tap.validate_number_phone;

import java.util.Scanner;
import java.util.regex.Pattern;

/*Viết phương thức để kiểm tra tính hợp lệ của số điên thoại.
Số điện thoại hợp lệ cần đạt theo mẫu sau: (xx)-(0xxxxxxxxx)
x là ký tự số
Không chứa các ký tự đặc biệt
Ví dụ số điện thoại hợp lệ: (84)-(0978489648)
Ví dụ tên lớp không hợp lệ: (a8)-(22222222)
 */
public class ValidateClassName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER String input: ");
        String input = scanner.nextLine();
        String pattern = "^\\([\\d]{2}\\)-\\([\\d]{10}\\)$";
        if (Pattern.matches(pattern, input)) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}
