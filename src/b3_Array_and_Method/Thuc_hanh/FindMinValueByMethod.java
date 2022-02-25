//phát triển một chương trình cho phép tìm kiếm giá trị nhỏ nhất trong một mảng cho trước.
package b3_Array_and_Method.Thuc_hanh;

public class FindMinValueByMethod {
    public static void main(String[] args) {
        int[] arr={4,12,7,8,1,6,9};
        // xuất mảng
        System.out.print("element in array:");
        for (int n: arr
             ) {
            System.out.print("  "+n);
        }
        int minIndex=minValue(arr);
        System.out.println("\nThe smallest element in the array is: "+arr[minIndex]);
    }

    public static int minValue(int[] array) {
        int index=0;
        for(int i=0; i<array.length; i++) {
            if(array[i]<array[index]) {
                index=i;
            }
        }
        return index;
    }
}
