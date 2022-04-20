package chapter4_Методы;

class ParmDemo {
    public static void main(String[] args) {
        ChkNum e = new ChkNum();

        if (e.isEven(10)) System.out.println("10 - чётное число");
        //isEven - метод который вызывается и которому передаётся значение (аргумент) '10'
        //Передача аргумента '10' методу isEven ()
        if (e.isEven(9)) System.out.println("9 - чётное число");//'9' - параметр метода
        if (e.isEven(8)) System.out.println("8 - чётное число");
        //когда метод isEven () начинает выполняться, параметр х получает значение 8.
        //которое опять же присваивается параметру х.
    }
}
