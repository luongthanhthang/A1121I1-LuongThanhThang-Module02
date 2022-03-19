//Chương trình đếm các lần xuất hiện của từ trong một văn bản
// và hiển thị các từ và sự xuất hiện của chúng theo thứ tự
// trong bảng chữ cái của các từ.

package b11_DSA_Stack_Queue.bai_tap.use_map_treemap;

import java.util.Map;
import java.util.Scanner;

public class TreeMap {
    public static void main(String[] args) {
        //TreeMap có sắp xếp theo abc,  còn HashMap thì không
        Map<String, Integer> stringIntegerMap= new java.util.TreeMap<>();
        Scanner scanner=new Scanner(System.in);
        System.out.print("input String: ");
        // nhập chuỗi và chuyển chuỗi về thường
        String input=scanner.nextLine();
        String inputLowerCase=input.toLowerCase();
        //chuyển chuỗi thành mảng
        String [] stringArray=inputLowerCase.split("");
        //Kiểm tra xem trong map có key này hay chưa. Nếu có đẩy key này vào map và tăng value (số lượng từ) lên
        // 1 Nếu key này chưa có trong map thì đẩy key vào map mặc định gán value là 1.
        for(int i=0; i<stringArray.length; i++) {
            if(stringIntegerMap.containsKey(stringArray[i])) {
                //cộng giá trị value thêm 1
                stringIntegerMap.put(stringArray[i], stringIntegerMap.get(stringArray[i])+1);
            } else {
                stringIntegerMap.put(stringArray[i], 1);
            }
        }
        //xuất kết quả
        for (String key: stringIntegerMap.keySet()
             ) {
            System.out.print(key+": ");
            System.out.println(stringIntegerMap.get(key));
        }
    }
}
