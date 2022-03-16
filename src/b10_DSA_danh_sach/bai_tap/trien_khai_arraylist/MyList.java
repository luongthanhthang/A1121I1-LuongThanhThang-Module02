package b10_DSA_danh_sach.bai_tap.trien_khai_arraylist;

import java.util.Arrays;

public class MyList<E> {
    //số lượng phần tử có trong MyArrayList
    private int size = 0;
    //Sức chứa của ArrayList
    private static final int DEFAULT_CAPACTITY = 10;
    //Mảng chứa phần tử
    Object elements[];

    //Constructor không tham số, sức chứa mặc định là 10
    public MyList() {
        elements = new Object[DEFAULT_CAPACTITY];
    }

    //Constructor có sức chứa truyền vào là capacity >=0
    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            //thông báo lỗi
            throw new IllegalArgumentException("capacity " + capacity + " ERROR");
        }
    }


    //PHƯƠNG THỨC:
    //phương thức trả về size của mảng
    public int size() {
        return this.size;
    }

    //phương thức xoá hết các phần từ trong mảng
    public void clear() {
        //gán size của mảng thành 0
        this.size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    //thêm phần tử vào mảng tại vị trí cuối của mảng
    public boolean add(E element) {
        if (this.elements.length == this.size) {
            this.ensureCapacity(5);
        }
        this.elements[size] = element;
        size++;
        return true;
    }

    //phương thức tăng kích thước của mảng MyArrayList
    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            //tăng kích thước mảng
            int newSize = this.elements.length + minCapacity;
            //tạo mảng mới bằng các copy mảng cũ
            this.elements = Arrays.copyOf(this.elements, newSize);
        } else {
            //thông báo lỗi khi tăng số lượng mảng không phù hợp
            throw new IllegalArgumentException("minCapacity " + minCapacity + " ERROR");
        }
    }

    //phương thức thêm phần tử tại vị trí BẤT KÌ
    public void add(int index, E element) {
        //kiểm tra index có phù hợp hay không
        if (index >= this.elements.length) {
            throw new IllegalArgumentException("index " + index + " ERROR");
        }

        //kiểm tra mảng còn sức chứa không
        if (this.size == this.elements.length) {
            this.ensureCapacity(5);
        }

        //kiểm tra biến chỗ đó null không, nếu không thì phải dời biến
        if (this.elements[index] == null) {
            this.elements[index] = element;
        } else {
            //dời các element của mảng
            for (int i = size - 1; i >= index; i--) {
                this.elements[i + 1] = this.elements[i];
            }
            this.elements[index] = element;
        }
        this.size++;
    }

    //xuất 1 phần tử tại index bất kì
    public E get(int index) {
       //kiểm tra index có trong mảng hay không, nếu không thì báo lỗi
        if(index<0||index>this.size) {
            throw new IllegalArgumentException("Index"+index+" ERROR");
        } else {
            return (E) this.elements[index];
        }
    }

    // truyền vào 1 đối tượng trong mảng, xuất index của đối tượng đó
    public int indexOf(E element) {
        int index = -1;
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i].equals(element)) {
                index = i;
            }
        }
        return index;
    }

    // kiểm tra phần tử cho vào có tồn tại trong mảng không
    public boolean contains(E element) {
        return this.indexOf(element) != -1;
    }

    // phương thức tạo ra bản sao của ArrayList hiện tại
    public MyList<E> clone() {
        MyList<E> copyList = new MyList<>();
        //thuộc tính elements của mảng
        copyList.elements = Arrays.copyOf(this.elements, this.size);
        copyList.size = this.size;
        return copyList;
    }

    //phương thức xoá phần từ tại vị trí bất kì
    public E remove(int index) {
        // điều kiện index phải nằm trong mảng, nếu không thì báo lỗi
        if (index < 0 || index > this.elements.length) {
            throw new IllegalArgumentException("ERROR index: " + index);
        } else {
            //phần từ bị xoá
            E removeElement= (E) this.elements[index];
            for (int i = index; i < this.size; i++) {
                this.elements[i] = this.elements[i + 1];
            }

            //gắn phần tử cuối mảng =null
            this.elements[size - 1] = null;
            size--;
            return removeElement;
        }
    }
}
