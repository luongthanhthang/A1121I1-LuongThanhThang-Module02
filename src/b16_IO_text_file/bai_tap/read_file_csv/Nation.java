package b16_IO_text_file.bai_tap.read_file_csv;

//Cho một file csv lưu danh sách các quốc gia gồm các thuộc tính id, code, name. Trong đó CSV là một tập tin văn bản bình thường,
// nó lưu trữ dữ liệu theo từng cột, và chia nó bằng dấu phân cách (thường là dấu phẩy “,“).
//Hãy thực hiện đọc file và hiển thị danh sách các quốc gia.
//1,"AU","Australia"
//2,"CN","China"
//3,"AU","Australia"
//4,"CN","China"
//5,"JP","Japan"
//6,"CN","China"
//7,"JP","Japan"
//8,"TH","Thailand"
public class Nation {
    private int id;
    private String code;
    private String name;

    public Nation() {
    }

    public Nation(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    //getter setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //toString

    @Override
    public String toString() {
        return "Nation{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
