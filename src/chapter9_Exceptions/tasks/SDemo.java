package chapter9_Exceptions.tasks;

// Demonstrate the Stack class.
class SDemo {
    public static void main(String args[]){
        // construct 10-element empty stack
        int size = 2;
        Stack stk1 = new Stack(size);

        try {
        for(int i=0; i < size+1; i++){
            System.out.print("Attempting to put : " +
                    (char) ('A' + i));
            stk1.put((char) ('A' + i));
            System.out.println(" -- OK");
            }
        }
        catch (StackFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {
        for(int i=0; i < size+1; i++)
        {
            System.out.print("Taking next char: ");
            char ch = stk1.take();
            System.out.print(ch + "\n");
            }
        }
        catch (StackEmptyException exc) {
            System.out.println(exc);
        }
    }
}
