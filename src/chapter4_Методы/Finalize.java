package chapter4_Методы;

class Finalize {
    public static void main(String args[]) {
        int count;

        FDemo ob = new FDemo(0);

    /* Генерируется большое количество объектов.
        В какой-то момент времени должна начаться сборка мусора.
        Примечание: возможно, для того чтобы активизировать
        систему сборки мусора, количество генерируемых объектов
        придется увеличить.*/

        for(count=1; count < 300_000; count++)
            ob.generator(count);
/*        В классе Finalize сначала создается исходный объект оЬ типа FDemo. Затем из
        данного объекта формируется 100_000 других аналогичных объектов. С этой целью
        вызывается метод generator () для объекта оЬ. На различных этапах процесса
        вступает в действие процедура сборки мусора.*/
    }
}
