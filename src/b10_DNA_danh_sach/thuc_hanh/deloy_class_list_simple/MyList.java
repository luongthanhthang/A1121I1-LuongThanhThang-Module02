package b10_DNA_danh_sach.thuc_hanh.deloy_class_list_simple;

import java.util.Arrays;
//Lớp MyList gồm
//Các thuộc tính
//size xác định số phần tử trong danh sách, mặc định gán là 0.
//DEFAULT_CAPACITY lưu số phần tử đối đa trong danh sách mặc định là 10.
//Mảng đối tượng elements chứa các phần tử trong danh sách
//Các phương thức:
//Phương thức khởi tạo không tham số
//Phương thức thêm một phần tử mới vào danh sách: add()
//Phương thức thay đổi số phần tử tối đa trong danh sách: ensureCapa()
//Phương thức truy cập một phần tử trong danh sách: get()
//Lớp MyListTest chứa phương thức main() để thực thi ứng dụng
public class MyList<E> {
    private int size=0;
    private static final int DEFAULT_CAPACITY=10;
    private Object elements[];

    public MyList() {
        elements=new Object[DEFAULT_CAPACITY];
    }

    //method
    //tăng đôi kích thước mảng chứa các phần tử
    private void ensureCapa() {
        int newSize=elements.length*2;
        //sao chép mảng    copyOf(tên mảng cần sao chép, kích thước mảng mới)
        elements= Arrays.copyOf(elements, newSize);
    }

    //cài đặt phương thức add()
    //thêm một phần từ vào cuối của danh sách
    public void add(E e) {
        if(size==elements.length) {
            ensureCapa();
        }
        elements[size]=e;
        size++;
    }

    //Bước 4: Cài đặt phương thức get()
    //Mục đích: Phương thức get() trả về phần tử vừa ở vị trí thứ i trong danh sách.
    //Tham số đầu vào: số nguyên chứa vị trí cần truy cập đến phần tử trong danh sách

    public E get(int i) {
        if(i>=size||i<0) {
            // xuất ra lỗi khi lấy phần từ ngoài size
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }
}
