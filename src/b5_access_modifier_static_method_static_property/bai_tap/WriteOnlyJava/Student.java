package b5_access_modifier_static_method_static_property.bai_tap.WriteOnlyJava;

public class Student {
    private String name="John";
    private String classes="C02";

    //constructor
    public Student(){};

    //Hai phương thức có access modifier là public: setName và setClasses.

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setClasses(String classes) {
//        this.classes = classes;
//    }

   protected void setName(String name) {
        this.name = name;
    }

   protected void setClasses(String classes) {
        this.classes = classes;
    }


}
