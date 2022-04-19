package beginners_guide_schildt.chapter3_Инструкции.Tasks;

public class forint2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i ++){
            System.out.println(i + " ");
            if ((i%2) == 0) continue;
            //после срабатывания оператора continue выполнение остальных операторов прерывается
            //и цикл for начинается сначала без вывода пустой строки
            System.out.println();//будет выведена пустая строка после каждого нечётного числа
        }
    }
}
