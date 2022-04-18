package CaseStudy.util;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexData {
    static Scanner scanner = new Scanner(System.in);

    //phương thức chuyển hoá dữ liệu gồm:
    // - chuỗi người dùng nhập vào
    // - chuỗi regex để chuẩn hoá dữ liệu
    // - tin nhắn lỗi khi người dùng nhập sai chuẩn hoá
    public static String regexStr(String temp, String regex, String error) {
        boolean check = true;
        // nếu người dùng nhập sai thì phải nhập lại
        do {
            if (temp.matches(regex)) {
                check = false;
            } else {
                System.err.println(error);
                //cho người dùng nhập lại
                temp = scanner.nextLine();
            }
        } while (check);
        return temp;
    }


    //-	Ngày sinh phải nhỏ hơn ngày hiện tại 18 năm,
    // người dùng không được quá 100 tuổi và phải đúng định dạng dd/mm/YYYY (sử dụng User Exception)
    //kiểm tra người dùng có trên 18 tuổi không
    public static String regexAge(String temp, String regex) {
        boolean check = true;
        while (check) {
            try {
                if (Pattern.matches(regex, temp)) {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate age = LocalDate.parse(temp, formatter);
                    //lấy thời gian hiện tại để kiểm tra trên 18 tuổi chưa
                    LocalDate now = LocalDate.now();
                    //lấy số năm chênh lệch giữa now và age
                    int current = Period.between(age, now).getYears();
                    if (current < 100 && current > 10) {
                        check = false;
                    } else {
                        throw new AgeException("Age > 18 and Age <100");
                    }
                } else {
                    throw new AgeException("Định dạng không đúng");
                }
            } catch (AgeException e) {
                System.out.println(e.getMessage());
//                e.printStackTrace();
                //cho người dùng nhập lại
                System.out.print("Re-input: ");
                temp = scanner.nextLine();
            }
        }
        return temp;
    }
}
