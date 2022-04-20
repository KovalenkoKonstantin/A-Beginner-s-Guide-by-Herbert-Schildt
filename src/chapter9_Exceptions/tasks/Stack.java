package chapter9_Exceptions.tasks;

/**Добавьте в него специальные исключения, реагирующие на
 попытку поместить элемент в переполненный стек и извлечь элемент из пустого
 стека.*/

// A stack class for characters.
class Stack {
    private char stck[]; // this array holds the stack
    private int tos;  // top of stack
    // Construct an empty Stack given its size.
    Stack(int size) {
        stck = new char[size]; // allocate memory for stack
        tos = 0;
    }
    // Push characters onto the stack.
    void put(char ch)
            throws StackFullException{
        if(tos==stck.length)
            throw new StackFullException(stck.length);
        stck[tos] = ch;
        tos++;
    }
    // Pop a character from the stack.
    char take()
            throws StackEmptyException{
        if(tos==0) {
            throw new StackEmptyException();
        }
        tos--;
        return stck[tos];
    }
}

