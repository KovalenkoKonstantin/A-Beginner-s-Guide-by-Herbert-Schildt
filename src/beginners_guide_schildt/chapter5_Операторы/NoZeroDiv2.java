package beginners_guide_schildt.chapter5_Операторы;

// Предотвращение деления на нуль с помощью тернарного оператора?.
class NoZeroDiv2 {
    public static void main(String args[]) {

        for(int i = -5; i < 6; i++)
            if(i != 0 ? true : false)
                System.out.println("100 / " + i +
                        " is " + 100 / i);
    }
}
