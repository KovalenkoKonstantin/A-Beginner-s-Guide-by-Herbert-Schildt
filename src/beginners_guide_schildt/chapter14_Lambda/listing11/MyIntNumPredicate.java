package beginners_guide_schildt.chapter14_Lambda.listing11;
// Use an instance method reference to refer to any instance.

// A functional interface for numeric predicates that operate
// on an object of type MyIntNum and an integer value.
interface MyIntNumPredicate {
    /**Первый параметр метода test() имеет тип MyIntNum.
     * Он будет использоваться для получения объекта, подлежащего обработке.
     * Это позволяет программе создать ссылку на экземплярный метод isFactor(),
     * который может использоваться с любым объектом MyIntNum.*/
    boolean test(MyIntNum mv, int n);
}
