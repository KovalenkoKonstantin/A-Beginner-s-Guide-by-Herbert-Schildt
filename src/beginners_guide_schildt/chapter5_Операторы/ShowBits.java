package beginners_guide_schildt.chapter5_Операторы;

// Отображение битов, составляющих байт.
class ShowBits {
    public static void main(String args[]) {
        int t;
        byte variable;

        variable = 123;//111 1011
        for(t=128; t > 0; t = t/2) {
            if((variable & t) != 0) System.out.print("1 ");
            else System.out.print("0 ");
//В цикле for последовательно проверяется каждый бит значения переменной val.
//Для выяснения того, установлен ли бит, выполняется операция поразрядного И.
//Если бит установлен, отображается цифра 1, иначе - О.
        }
    }
}
