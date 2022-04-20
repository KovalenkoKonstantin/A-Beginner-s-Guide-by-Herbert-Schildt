package chapter14_Lambda.listing10;
class MethodRefDemo2 {

    public static void main(String args[])
    {
        boolean result;

        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);

        // Here, a method reference to isFactor on myNum is created.
        /**фигурирующий здесь метод isFactor() связывается с объектом, на который указывает ссылка
         на объект (isFactor)
         Переменной ip присваивается ссылка на метод isFactor() объекта myNum.
         Таким образом, если вызвать метод test(), то он вызовет метод isFactor() для объекта myNum,
         т.е. того объекта, который был указан при создании ссылки на метод.*/
        /**Если ссылаться на объект myNum класса MyIntNum,
         * тогда нет необходимости объект класса mv с названием его класса MyIntNum
         * передевать в аргументы метода test()
         * функционального интерфейса IntPredicate*/
        IntPredicate ip = myNum::isFactor; //ссылка на метод экземпляра

        // Now, it is used to call isFactor() via test().
        /**вызывается метод ip.test() с передачей ему ссылки на метод
         isFactor() соответствующего экземпляра*/
        result = ip.test(3);
        if(result) System.out.println(myNum.getFactor() + " is a factor of " + myNum.getNum());
        else System.out.println(myNum.getFactor() + " is a not factor of " + myNum.getNum());

        // This time, a method reference to isFactor on myNum2 is created.
        // and used to call isFactor() via test().
        ip = myNum2::isFactor; //ссылка на метод экземпляра
        result = ip.test(5);
        if(!result) System.out.println(myNum2.getFactor() + " is not a factor of " + myNum2.getNum());
        else System.out.println(myNum2.getFactor() + " is a factor of " + myNum2.getNum());
    }
}
