package chapter10_Потоки.listing16;

/* This program averages a list of numbers entered
   by the user.  */

import java.io.*;

class AvgNums {
    public static void main(String args[])
            throws IOException
    {
        // create a BufferedReader using System.in
        BufferedReader br = new
                BufferedReader(new InputStreamReader(System.in));
        String str;
        int n;
        double sum = 0.0;
        double avg, t;

        System.out.print("How many numbers will you enter: ");
        str = br.readLine();
        try {
/**Преобразование строки в числовое значение типа int*/
            n = Integer.parseInt(str);
        }
        catch(NumberFormatException exc) {
            System.out.println("Invalid format");
            n = 0;//если неправилно сбрасывает в ноль
            System.out.println("use default " + n);
        }

        System.out.println("Enter " + n + " values.");
        for(int i=0; i < n ; i++)  { int a = i + 1;
            System.out.print("Position number "+ a + " is: ");
            str = br.readLine();
            try {
/**Преобразование строки в числовое значение типа double*/
                t = Double.parseDouble(str);
            } catch(NumberFormatException exc) {
                System.out.println("Invalid format");
                t = 0.0;//если неправилно сбрасывает в ноль
                System.out.println("use default " + t);
            }
            sum += t;
        }
        avg = sum / n;
        System.out.println("Average is " + avg);
    }
}
