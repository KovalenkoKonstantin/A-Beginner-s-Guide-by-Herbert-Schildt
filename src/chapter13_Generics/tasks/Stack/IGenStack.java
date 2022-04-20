package chapter13_Generics.tasks.Stack;
/**Видоизмените свой ответ на вопрос 10 в упражнении для самопроверки из главы
 9 таким образом, чтобы сделать класс обобщенным. Для этого создайте интерфейс
 стека IGenStack, объявив в нем обобщенные методы push () и рор ()*/
public interface IGenStack <T>{
    void put(T obj) throws StackFullException;
    T take() throws StackEmptyException;
}
