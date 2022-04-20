package chapter13_Generics.tasks;
/**Допустим, обобщенный интерфейс объявлен так:
 interface IGenIF<T, V extends Т> { // ...
 Напишите объявление класса MyClass, который реализует интерфейс IGenIF.*/
public interface IGenIf <T, V extends T>{
    boolean contains (T o, V o1);
}
