package b13_search_algorithm.bai_tap.chuoi_lien_tiep_lon_nhat;

import java.util.LinkedList;
import java.util.Scanner;

// abcabcdgabxy  --> abcdg
// abcabcdgabmnsxy --> abmnsxy
public class ChuoiLienTiepLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input String: ");
        String string = scanner.nextLine();
        // khai báo 2 list, 1 list hiện tại và 1 list dài nhất
        LinkedList<Character> list = new LinkedList<>();
        LinkedList<Character> listMax = new LinkedList<>();
        //tìm ra chuỗi liên tiếp độ dài lớn nhất
        for (int i = 0; i < string.length(); i++) {
            // chuỗi có chiều dài > 1 và chữ tiếp theo nhỏ hơn chuỗi phía trước so sánh theo ASCII thì xoá list đó
            // tạo một list mới
            if (list.size() > 1 && string.charAt(i) <= list.getLast()) {
                list.clear();
            }

            list.add(string.charAt(i));
            //so sánh chuỗi dài nhất
            if (list.size() > listMax.size()) {
                listMax.clear();
                listMax.addAll(list);
            }
        }

        //xuất mảng
        listMax.forEach(System.out::print);
    }
}
