package beginners_guide_schildt.chapter14_Lambda.listing11_1;

/**
 * Статические методы
 * имя_класса::имя_метода
 * MyIntPredicates::isPrime
 * <p>
 * Ссылки на методы эксземпляров
 * ссылка_на_объект::имя_метода
 * myNum::isFactor
 * <p>
 * имя_класса::имя_метода_экземпляра
 * MyIntNum::isFactor
 */
public class MyGenClassDemo {
    public static void main(String[] args) {
        boolean result;
        MyGenClass myClass = new MyGenClass();
/**Если в качестве ссылки на метод задается обобщенный метод,
 * то тип его аргумента указывается вслед за символами : :
 * перед именем метода.*/
        SomeTest<Integer> mRef = MyGenClass::<Integer>meGenMeth;
/**В тех случаях, когда задается обобщенный класс,
 * тип аргумента указывается за именем класса и предшествует символам : : .*/
        System.out.println(mRef.test(12,6));
    }
}
