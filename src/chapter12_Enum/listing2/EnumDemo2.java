package chapter12_Enum.listing2;

import chapter12_Enum.listing1.Transport;
// Use the built-in enumeration methods.
class EnumDemo2 {
    public static void main(String args[])
    {
        Transport tp;

        System.out.println("Here are all Transport constants");

        // use values() Получение массива констант типа Transport
        Transport allTransports[] = Transport.values();
        for(Transport t : allTransports)
            System.out.print(t + " ");
        System.out.println();
        for(Transport t : Transport.values())
            System.out.print(t + " ");

        System.out.println();

        // use valueOf()
        tp = Transport.valueOf("AIRPLANE"); //получение константы AIRPLANE
        System.out.println("tp contains " + tp);

    }
}
