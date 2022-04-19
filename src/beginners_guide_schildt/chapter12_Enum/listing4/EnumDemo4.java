package beginners_guide_schildt.chapter12_Enum.listing4;

import beginners_guide_schildt.chapter12_Enum.listing1.Transport;
// Demonstrate ordinal() and compareTo().
public class EnumDemo4 {
    public static void main(String[] args) {
        Transport tp, tp2, tp3, tp4;
        // Obtain all ordinal values using ordinal().
        System.out.println("Here are all Transport constants and their ordinal values: ");
        for (Transport t : Transport.values())
            System.out.println(t + " " + t.ordinal()); //получение порядковых значений
        tp = Transport.AIRPLANE;
        tp2 = Transport.TRAIN;
        tp3 = Transport.BOAT;
        tp4 = Transport.AIRPLANE;
        System.out.println();
        // Demonstrate compareTo()
        if (tp.compareTo(tp2) < 0) //сравнение порядковых значений
            System.out.println(tp +" comes before " + tp2);
        if (tp3.compareTo(tp2) > 0)
            System.out.println(tp3 +" comes after " + tp2);
        if (tp.compareTo(tp4) == 0)
            System.out.println(tp +" equals to " + tp4);
    }
}
