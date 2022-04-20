package chapter2_Типы_данных;

//Print a truth table for the logical operators.
   //Отображение таблицы истинности для логических операций

class LogicalOpTable {
    public static void main(String args[]) {

        boolean p, q;

        System.out.println("P\t\tQ\t\tAND&\tOR|\t\tXOR^\tNOT!");

        p = true; q = true;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        //в операторах с вызовами метода println () логические
        //операции заключены в круглые скобки. Эти скобки необходимы для соблюдения
        //приоритета операций. В частности, арифметическая операция + имеет
        //более высокий приоритет, чем логические операции.
        System.out.println((p^q) + "\t" + (!p));

        p = true; q = false;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = false; q = true;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = false; q = false;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        System.out.println("\n");

        int x, y, z;

        p = true; q = true;
        if (p){x = 1;}
        else {x = 0;}
        if (q){y = 1;}
        else {y = 0;}
        if(!p){z = 1;}
        else {z = 0;}
        System.out.print(x + "\t\t" + y +"\t\t");
        System.out.print((x&y) + "\t\t" + (x|y) + "\t\t");
        System.out.println((x^y) + "\t\t" + (z));

        p = true; q = false;
        if (p){x = 1;}
        else {x = 0;}
        if (q){y = 1;}
        else {y = 0;}
        if(!p){z = 1;}
        else {z = 0;}
        System.out.print(x + "\t\t" + y +"\t\t");
        System.out.print((x&y) + "\t\t" + (x|y) + "\t\t");
        System.out.println((x^y) + "\t\t" + (z));

        p = false; q = true;
        if (p){x = 1;}
        else {x = 0;}
        if (q){y = 1;}
        else {y = 0;}
        if(!p){z = 1;}
        else {z = 0;}
        System.out.print(x + "\t\t" + y +"\t\t");
        System.out.print((x&y) + "\t\t" + (x|y) + "\t\t");
        System.out.println((x^y) + "\t\t" + (z));

        p = false; q = false;
        if (p){x = 1;}
        else {x = 0;}
        if (q){y = 1;}
        else {y = 0;}
        if(!p){z = 1;}
        else {z = 0;}
        System.out.print(x + "\t\t" + y +"\t\t");
        System.out.print((x&y) + "\t\t" + (x|y) + "\t\t");
        System.out.println((x^y) + "\t\t" + (z));
    }
}