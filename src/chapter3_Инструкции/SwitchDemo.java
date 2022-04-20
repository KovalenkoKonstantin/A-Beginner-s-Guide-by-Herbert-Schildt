package chapter3_Инструкции;

// Demonstrate the switch.
// Демонстрация использования оператора switch.
class SwitchDemo {
    public static void main(String args[]) {
        int i;

        for(i=0; i<10; i++)
            switch(i) {
                case 0:
                    System.out.println("i is zero");
                    //switch(выражение) {
                    //case константа l:
                    //последовательность операторов
                    //break;
                    //default:
                    //последовательность операторов}
                    break;
                    //При выполнении оператора break оператор switch завершает работу,
                    // и управление передается следующему за ним оператору.
                case 1:
                    System.out.println("i is one");
                    break;
                case 2:
                    System.out.println("i is two");
                    break;
                case 3:
                    System.out.println("i is three");
                    break;
                case 4:
                    System.out.println("i is four");
                    break;
                default:
                    System.out.println("i is five or more until ten");
                    //на каждом шаге цикла выполняются операторы, связанные с совпадающей
                    //константой выбора в одной из ветвей case, в обход всех остальных ветвей. Когда
                    //же значение переменной i становится равным или больше пяти, оно не совпадает ни с
                    //одной из констант выбора, и поэтому управление получает выражение, следующее за
                    //оператором default.
            }

    }
}