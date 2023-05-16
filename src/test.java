import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int n = 512;
        int total = 0;
        // code here
        if (n > 0) {
            while (n / 10 != 0) {
                total += (n % 10);
                n = n / 10;
            }
            total += n;
        }
        System.out.println(total);
    }

    public static<E> void remove_third_element(java.util.ArrayList<E> arrayList) {
        //Your code here
        arrayList.remove(2);
    }
}
