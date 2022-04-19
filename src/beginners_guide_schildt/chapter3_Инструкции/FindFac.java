package beginners_guide_schildt.chapter3_Инструкции;

/*
   Использовать вложенные циклы для нахождения
делителей чисел о т 2 до 100
*/
class FindFac {
    public static void main(String args[]) {

        for(int i=2; i <= 100; i++) {
            System.out.print("Делители " + i + ": ");
            for(int j = 2; j < i; j++)
                if((i%j) == 0) System.out.print(j + "\t");
            System.out.println();
        }
    }
}