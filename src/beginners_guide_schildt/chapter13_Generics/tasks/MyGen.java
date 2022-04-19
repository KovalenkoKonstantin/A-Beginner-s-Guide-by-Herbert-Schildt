package beginners_guide_schildt.chapter13_Generics.tasks;
/**У обобщенною метода MyGen () имеется один параметр типа, определяющий тип
 передаваемого ему аргумента. Этот метод возвращает также объект, тип которого
 соответствует параметру типа. Как должен быть объявлен метод MyGen ()?*/
public class MyGen <T>{
    public T method (T object){
        System.out.println("deal");
        System.out.println(object+"\n");
        return object;
    }
}
