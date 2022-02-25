//Đếm số lần xuất hiện của ký tự trong chuỗi
package b3_Array_and_Method.Bai_tap;

import java.util.Scanner;

public class CountCharacterIntoString {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Khai báo một chuỗi và gán cho nó một giá trị
        System.out.print("enter string: ");
        String string=scanner.nextLine();

        // xuất chuỗi
        System.out.print("String: "+string);

        //nhập và đếm số ký tự đó trong chuỗi
        System.out.print("\nEnter the character: ");
        int count=0;
        char character=scanner.nextLine().charAt(0);
        for(int i=0; i<string.length(); i++) {
            if(character==string.charAt(i)){
                count++;
            }
        }
        System.out.print("Total character in string: "+count);
    }
}
