//Ứng dụng chuyển đổi tiền tệ
package b1_Introduction_to_Java.Bai_tap;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        System.out.println("Application Currency conversion");
        System.out.print("Enter rate USD to VND: \n");
        Scanner scanner=new Scanner(System.in);
        float rate=scanner.nextFloat();
        System.out.print("Enter USD: ");
        float USD=scanner.nextFloat();
        float VND=USD*rate;
        System.out.printf("%.2f USD into %.2f VND",USD,VND);
    }
}
