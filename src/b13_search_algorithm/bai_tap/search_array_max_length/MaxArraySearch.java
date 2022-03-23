package b13_search_algorithm.bai_tap.search_array_max_length;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Viết chương trình cho phép người dùng nhập vào một chuỗi
// bất kỳ và sau khi nhập xong chương trình sẽ hiển thị một
// chuỗi kí tự con được sắp xếp theo thứ tự từ bé đến lớn.

// Welcome thì chuỗi tăng dần lớn nhất sẽ là Welo.
// Vì theo bảng ASCII thì chữ W sẽ nhỏ hơn e, e nhỏ hơn l,
// l nhỏ hơn o vậy nên chuỗi chúng ta thu được là Welo.
public class MaxArraySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Character> listChar = new ArrayList<>();
        System.out.print("Enter the String : ");
        String string = scanner.nextLine();
        char[] chars = string.toCharArray();
        //thêm phần từ vảo list
        for (char charList : chars) {
            listChar.add(charList);
        }

        for (int i = 0; i < listChar.size(); i++) {
            if (listChar.get(i-1) < listChar.get(i + 1)) {
                listChar.remove(i);
            }
        }
        // xuất mảng sau khi sắp xếp
        for (char charElement : listChar
        ) {
            System.out.print(charElement);
        }
    }
}
