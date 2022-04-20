package chapter13_Generics.tasks;
/**Допустим, обобщенный интерфейс объявлен так:
 interface IGenIF<T, V extends Т> { // ...
 Напишите объявление класса MyClass, который реализует интерфейс IGenIF.*/
public class MyClass <T,V extends T> implements IGenIf<T,V>{
    @Override
    public boolean contains(T o, V o1) {
        return false;
    }
}
