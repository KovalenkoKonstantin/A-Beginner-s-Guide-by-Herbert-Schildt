package beginners_guide_schildt.chapter8_Interfaces.interfaces;

public class Test {
    public static void main(String[] args) {
        animal animal = new animal(1);
        person person1 = new person("bob");

        person1.sayhello();
        animal.sleep();

        animal.showinfo();
        person1.showinfo();

        interfaces info1 = new animal(2);
        interfaces info2 = new person("stive");

        info1.showinfo();
        info2.showinfo();

        ((animal) info1).sleep();
        ((person) info2).sayhello();

    }
}
