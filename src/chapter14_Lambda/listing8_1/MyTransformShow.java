package chapter14_Lambda.listing8_1;

public class MyTransformShow {
    public static void main(String[] args) {
        /**лямбда-выражение, которое использует интерфейс
         MyTransform для преобразования элементов массива типа Double в их квадратные
         корни*/
        /**параметр для лямбда-выражения вполне мог быть объявлен
         как Double [] , поскольку это просто означало бы явное объявление типа
         параметра, исключающее необходимость его автоматического определения
         компилятором. Однако в данном случае это не дает никакого выигрыша*/
        //MyTransform <Double> myTransform = (Double [] v) -> {
        MyTransform <Double> myTransform = (v) -> {
            for (int i = 0; i < v.length; i++)
                v[i] = Math.sqrt(v[i]);
        };
    }
}
