package beginners_guide_schildt.chapter3_Инструкции;

// Demonstrate an if-else-if ladder.
// Демонстрация многоступенчатой конструкции if-else-if.
class Ladder {
    public static void main(String args[]) {
        int x;

        for(x=1; x<6; x++) {
            if(x==1)
                System.out.println("x is one");
            else if(x==2)
                System.out.println("x is two");
            else if(x==3)
                System.out.println("x is three");
            else if(x==4)
                System.out.println("x is four");
            else
                System.out.println("x is not between 1 and 4");
        }
    }
}

