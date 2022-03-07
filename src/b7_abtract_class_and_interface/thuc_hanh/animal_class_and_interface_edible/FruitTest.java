package b7_abtract_class_and_interface.thuc_hanh.animal_class_and_interface_edible;

import b7_abtract_class_and_interface.thuc_hanh.animal_class_and_interface_edible.fruit.Apple;
import b7_abtract_class_and_interface.thuc_hanh.animal_class_and_interface_edible.fruit.Fruit;
import b7_abtract_class_and_interface.thuc_hanh.animal_class_and_interface_edible.fruit.Orange;

public class FruitTest {
    public static void main(String[] args) {
        Fruit[] fruits=new Fruit[2];
        fruits[0]=new Orange();
        fruits[1]=new Apple();
        for (Fruit fruit: fruits
             ) {
            System.out.println(fruit.howToEat());
        }
    }
}
