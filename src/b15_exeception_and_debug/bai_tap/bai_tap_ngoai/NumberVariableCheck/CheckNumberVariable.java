package b15_exeception_and_debug.bai_tap.bai_tap_ngoai.NumberVariableCheck;

//Viết chương trình nhập vào 1 số thực. Bắt ngoại lệ để khi nhập vào không phải là số.
// Cài đặt hàm chia, trong đó bắt ngoại lệ nếu số chia là 0 thì thông báo phép chia không hợp lệ và kết thúc chương trình*/

import java.util.Scanner;

public class CheckNumberVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER INPUT: ");
        String input = scanner.nextLine();
        try {
            numberCheck(input);
            System.out.println("OUTPUT: " + input);
            System.out.println("TOTAL: "+ (Integer.parseInt(input)+4));
        } catch (NumberVariableException e) {
            System.out.print(e.getMessage());
            e.getStackTrace();
        }

    }

    //hàm nhập và báo lỗi
    public static void numberCheck(String input) throws NumberVariableException {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) > '9') {
                throw new NumberVariableException("ERROR NUMBER!");
            }
        }
    }
}
