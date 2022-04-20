package chapter12_Enum.listing8;
// Autoboxing/unboxing takes place with
// method parameters and return values.

class AutoBox2 {
    // This method has an Integer parameter.
    static void m(Integer v) { //Получает Integer
        System.out.println("Call method m(), pass value '" + v + "' and autobox it to Integer");
    }

    // This method returns an int.
    static int m2() { //Возвращает int
        return 10;
    }

    // This method returns an Integer.
    static Integer m3() { //Возвращает Integer
        return 99; // autoboxing 99 into an Integer.
    }

    public static void main(String args[]) {
        System.out.println("Demonstration:");
        // Pass an int to m().  Because m() has an Integer
        // parameter, the int value passed is automatically boxed.
        m(199);

        // Here, iOb recieves the int value returned by m2().
        // This value is automatically boxed so that it can be
        // assigned to iOb.
        Integer iOb = m2();
        System.out.println("Autobox int value '10' with method m2() to Integer object " + iOb);

        // Next, m3() is called. It returns an Integer value
        // which is auto-unboxed into an int.
        int i = m3();
        System.out.println("Autounboxed Integer value '99' from method m3() is int " + i);

        // Next, Math.sqrt() is called with iOb as an argument.
        // In this case, iOb is auto-unboxed and its value promoted to
        // double, which is the type needed by sqrt().
        iOb = 100;
        System.out.println("Autobox an int value '100' and link of it passed to the object iOb.\n" +
                "Pass an object iOb as an argument to Math method Math.sqrt()\n" +
                "Autounboxed Integer object iOb passed to double type\n" +
                "Square root of iOb is " + Math.sqrt(iOb));
    }
}
