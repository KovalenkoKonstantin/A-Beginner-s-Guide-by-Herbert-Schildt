package beginners_guide_schildt.chapter14_Lambda.listing12_1;

public class Demo {
    public static void main(String[] args) {
        MyClassArrayCreator myClassArrayCreator = MyClass[]::new;

        MyClass [] a = myClassArrayCreator.func(3);

        for (int i = 0; i < 3; i++){
            a[i] = new MyClass(i);
        System.out.println(a);
        }
    }
}
