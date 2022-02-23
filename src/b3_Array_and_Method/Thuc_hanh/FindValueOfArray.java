// tìm giá trị trong mảng
package b3_Array_and_Method.Thuc_hanh;

import java.util.Scanner;

public class FindValueOfArray {
    public static void main(String[] args) {
        String[] students={"Lương","Thanh","Thắng"};
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a name's stundent: ");
        String input_name=scanner.nextLine();
        boolean isExist=false;
        for(int i=0; i<students.length;i++) {
            if(students[i].equals(input_name)) {
                System.out.println("Position of the student in the list "+input_name+" is "+(i+1));
                isExist=true;
                break;
            }
        }
        if(!isExist) {
            System.out.println("Not found "+input_name+" in the list");
        }
    }
}
