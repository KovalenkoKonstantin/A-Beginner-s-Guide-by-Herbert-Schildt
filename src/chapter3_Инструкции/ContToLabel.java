package chapter3_Инструкции;

// Применить оператор continue с меткой
class ContToLabel {
    public static void main(String args[]) {

        outerloop:
        for(int i=1; i < 10; i++) {
            System.out.print("\nВнешний цикл: проход: " + i +
                    ", внутренний цикл, проходы: ");
            for(int j = 1; j < 10; j++) {
                if(j == 5) continue outerloop; // продолжить внешний цикл
                System.out.print(j + ",");
                //второй цикл продолжает выполняться пока j не принимает значение 5,
                //после чего оператор continue пересылает по метке 'outerloop:' на начало цикла
                //при выполнении оператора continue управление передается внешнему циклу,
                //и оставшиеся итерации внутреннего цикла пропускаются
            }
        }
    }
}