package chapter9_Exceptions.listing12;

class FinallyDemo {
    public static void main(String args[]) {

        for(int i=0; i < 5; i++) {
            UseFinally.genException(i);
            System.out.println();
        }
    }
}
