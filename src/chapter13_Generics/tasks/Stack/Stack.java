package chapter13_Generics.tasks.Stack;

/**
 * Видоизмените свой ответ на вопрос 10 в упражнении для самопроверки из главы
 * 9 таким образом, чтобы сделать класс обобщенным. Для этого создайте интерфейс
 * стека IGenStack, объявив в нем обобщенные методы push () и рор ()
 */

// A stack class for characters.
class Stack<T> implements IGenStack<T> {
    private T stck[]; // this array holds the stack
    private int tos;  // top of stack

    // Construct an empty Stack given its size.
    Stack(T[] stckArray) {
        stck = stckArray; // allocate memory for stack
        tos = 0;
    }

    // Construct a Stack from a Stack.
    Stack(T[] stckArray, Stack<T> ob) {

        tos = ob.tos;
        stck = stckArray;

        try {
            if (stck.length < ob.stck.length)
                throw new StackFullException(stck.length);
        } catch (StackFullException exc) {
            System.out.println(exc);
        }

        // Copy elements.
        for (int i = 0; i < tos; i++)
            stck[i] = ob.stck[i];
    }

    // Construct a stack with initial values.
    Stack(T[] stckArray, T[] a) {
        stck = stckArray;

        for (int i = 0; i < a.length; i++) {
            try {
                put(a[i]);
            } catch (StackFullException exc) {
                System.out.println(exc);
            }
        }
    }

    // Push characters onto the stack.
    public void put(T obj)
            throws StackFullException {
        if (tos == stck.length)
            throw new StackFullException(stck.length);
        stck[tos] = obj;
        tos++;
    }

    // Pop a character from the stack.
    public T take()
            throws StackEmptyException {
        if (tos == 0) {
            throw new StackEmptyException();
        }
        tos--;
        return stck[tos];
    }
}

