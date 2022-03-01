// chạy thử class dừng dồng hồ
package b4_OPP.Bai_tap.Stop_Watch;

import java.util.Arrays;

public class TestWatchStop {
    public static void main(String[] args) {

        StopWatch stopWatch=new StopWatch();
        stopWatch.start();
        System.out.println("Start time: "+stopWatch.getStartTime());
        //khởi tạo mảng 100000 phần từ
        int[] arr=new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= (int) Math.floor(Math.random()*10000);
        }

        // xuất mảng ban đầu
        System.out.println("arr: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("  "+arr[i]);
        }

        //sắp xếp lại mảng
        Arrays.sort(arr);

        //Xuất lại mảng sau khi sắp xếp
        System.out.println("\nnew arr: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("  "+arr[i]);
        }

        stopWatch.stop();
        System.out.println("\nEndtime time: "+stopWatch.getEndTime());

        System.out.println("\nElapsed time: "+stopWatch.getElapsedTime());
    }
}
