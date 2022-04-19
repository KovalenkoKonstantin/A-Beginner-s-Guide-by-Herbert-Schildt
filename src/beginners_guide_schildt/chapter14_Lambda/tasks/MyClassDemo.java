package beginners_guide_schildt.chapter14_Lambda.tasks;
/**Предположим, имеется класс MyClass , содержащий статический метод
 myStaticMethod(). Продемонстрируйте, каким образом можно указать ссылку на
 метод myStaticMethod().*/
import java.util.function.Predicate;

public class MyClassDemo {
    public static void main(String[] args) {
        Predicate<Integer> predicate = MyClass::myStaticMethod;
        predicate.test(55);

        MyClassv1 myClassv1 = new MyClassv1();

        ObjectInterface objectInterface = MyClassv1::myinstMethod;

        MyClassv1 localObj = myClassv1.mcObj;
        objectInterface.test(localObj, 5);
    }
}
