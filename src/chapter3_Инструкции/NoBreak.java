package chapter3_Инструкции;

// Demonstrate the switch without break statements.
// Демонстрация использования оператора switch без оператора break.
class NoBreak {
    public static void main(String args[]) {
        int i;

        for(i=0; i<=5; i++) {
            switch(i) {
                case 0:
                    System.out.println("i is less than one");
                case 1:
                    System.out.println("i is less than two");
                case 2:
                    System.out.println("i is less than three");
                case 3:
                    System.out.println("i is less than four");
                case 4:
                    System.out.println("i is less than five");
            }
            System.out.println();//добавляется пустая строка после каждого прохождения цикла оператора for
        }
    }
}
