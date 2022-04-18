package bai_thi_module2.utils;

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


    public static String[] regexNgay(String ngayVao, String ngayRa, String regex) {
        boolean check = true;
        while (check) {
            try {
                if (Pattern.matches(regex, ngayVao) && Pattern.matches(regex, ngayRa)) {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate ngayVao1 = LocalDate.parse(ngayVao, formatter);
                    LocalDate ngayRa1 = LocalDate.parse(ngayRa, formatter);
                    int current = Period.between(ngayVao1, ngayRa1).getDays();
                    if (current > 0) {
                        check = false;
                    } else {
                        throw new NgayNhapRaException("Ngày nhập viện <= Ngày ra viện");
                    }
                } else {
                    throw new NgayNhapRaException("Định dạng không đúng");
                }
            } catch (NgayNhapRaException e) {
                System.out.println(e.getMessage());
//                e.printStackTrace();
                //cho người dùng nhập lại
                System.out.print("Re-input: ");
                System.out.print("Nhập ngày vào: ");
                ngayVao = scanner.nextLine();
                System.out.print("Nhập ngày ra: ");
                ngayRa = scanner.nextLine();
            }
        }
        return new String[]{ngayVao, ngayRa};
    }
}
