package beginners_guide_schildt.chapter14_Lambda.listing6;
@FunctionalInterface
// Use a lambda expression as an argument to a method.
/**Данный интерфейс определяет метод func (), который принимает аргумент типа
 String и возвращает результат типа String*/
public abstract interface StringFunc {
    abstract String func(String str);
}
