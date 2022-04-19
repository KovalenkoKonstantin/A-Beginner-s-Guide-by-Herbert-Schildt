package beginners_guide_schildt.chapter2_Типы_данных;

// С символьными переменными можно обращаться, как с целочисленными /Character variables can be handled like integers.
class CharArithDemo {
    public static void main(String args[]) {
        char ch='X';

//        ch = 'X';
        System.out.println("ch содержит/contains " + ch);

        ch++; // increment ch
        System.out.println("ch is now " + ch);

        ch = 90; // give ch the value Z
        System.out.println("ch is now " + ch);
    }
}