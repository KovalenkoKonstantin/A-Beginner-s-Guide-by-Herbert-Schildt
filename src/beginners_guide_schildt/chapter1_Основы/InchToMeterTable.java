package beginners_guide_schildt.chapter1_Основы;

class InchToMeterTable {
    public static void main(String[] args) {
        double inch, meter, foot;
        int counter;
        counter = 0;

        for (inch = 1; inch <= 12*12; inch++) {
            meter = inch / 39.37; // convert to meters
            System.out.println(inch + " inch is " +
                    meter + " metres.");
            counter++;

            // every 12th line, print a blank line
            if(counter == 12) {
                System.out.println();//вывод пустой строки
                counter = 0; //после вывода пустой строки reset the line counter
            }
                }
    }
}

