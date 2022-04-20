package chapter13_Generics.tasks.Stack;

// Demonstrate the Stack class.
class SDemo {
    public static void main(String args[]){
        int x = 2, y = 4, n;
        String str;
        // construct 2-element Integer stack
        Integer array [] = new Integer[x];
        Stack <Integer> stk1 = new Stack<>(array);

        // Construct stack from Character array.
        String name[] = {"One", "Two", "Three"};
        String strStore[] = new String[y];
        Stack<String> stk2 = new Stack<>(strStore, name);

        // Construct stack from another stack.
        String strStore2[] = new String[3];
        Stack<String> stk3 = new Stack<>(strStore2, stk2);

        try {// Put some values into stk1.
        for(int i=0; i <= x; i++){
            System.out.print("Attempting to put : " +
                    ('A' + i));
            stk1.put(('A' + i));
            System.out.println(" -- OK");
            }
        }
        catch (StackFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try { // Show the stacks.
        for(int i=0; i <= x; i++)
        {
            System.out.print("Taking next: ");
            n = stk1.take();
            System.out.print(n + "\n");
            }
        }
        catch (StackEmptyException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try {// Put some values into stk2.
                System.out.print("Attempting to put: ");
                stk2.put("Раз");
                System.out.println(" -- OK");
        }
        catch (StackFullException exc) {
            System.out.println(exc);
        }
        System.out.println();

        try { // Show the stacks.
            for(int i=0; i <= x+1; i++)
            {
                System.out.print("Taking next: ");
                str = stk2.take();
                System.out.print(str + "\n");
            }
        }
        catch (StackEmptyException exc) {
            System.out.println(exc);
        }
    }
}
