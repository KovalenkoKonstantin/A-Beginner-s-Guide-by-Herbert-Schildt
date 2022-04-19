package beginners_guide_schildt.chapter13_Generics.listing10;
// Use a generic constructor.
// В классе Summation вычисляется и инкапсулируется сумма всех чисел от О до arg
class Summation {
    private int sum;
    //обобщённый конструктор
    //объект типа Summation может
    //быть создан с использованием любого числового типа, в том числе Integer, Float
    //и Double
    <T extends Number> Summation(T arg) {
        //sum = 0;
    //Независимо от того, какой числовой тип используется, соответствующее
    //значение преобразуется в тип Integer при вызове intValue ()
        for(int i=0; i <= arg.intValue(); i++)
            sum += i;
    }

    int getSum() {
        return sum;
    }
}
