package chapter5_Операторы.Tasks;
/*Измените программу, написанную в упражнении 5.1, таким образом, чтобы она
  сортировала массив символьных строк. Продемонстрируйте ее работоспособность.*/
//Покажите два способа объявления одномерного массива, состоящего из 12 элементов типа double.
public class StringSortExercise {
    public static void main(String[] args) {

        String array [] = {"a", "aa", "aaa", "aaaa", "ffffffffff", "ggggggg"};
        System.out.print("Изначальный массив:\n");
        for(String i : array)
            System.out.print(i + " ");
        System.out.println();
        //System.out.println("\nКоличество слов в массиве: \n" + array.length + "\n");
        //for (int a = 0; a < array.length; a++){
            //int b = array [a].length();
            //System.out.print("позиция: " + a + "\t");
            //System.out.print("значение: "+ array[a]+ "\t");
                //int c = a + 1;
            //System.out.println("количество букв в " + c + " слове: "+ array [a].length());
        //}

            int a, b, c = array.length;
            //String t;

            for(a = 1; a < c; a++)
                for(b = c-1; b >= a; b--) {
                    if(array[b-1].compareTo(array[b]) > 0) {
                        String t = array [b-1];
                        array [b-1] = array [b];
                        array [b] = t;
                    }
                }
            System.out.println("Отсортированный массив: ");
            for(String i : array)
                System.out.print(i + " ");
    }
}
