package chapter13_Generics.listing3;
// NumericFns attemps (unsuccessfully) to create
// a generic class that can compute various
// numeric functions, such as the reciprocal or the
// fractional component, given any type of number.
class NumericFns<T> {
    T num;

    // Pass the constructor a reference to
    // a numeric object.
    NumericFns(T n) {
        num = n;
    }
/**компилятору неизвестно, что объекты класса NumericFns предполагается создавать
 * только для числовых типов данных. Поэтому при попытке скомпилировать класс
 * NumericFns возникает ошибка, а соответствующее сообщение уведомит вас о том,
 * что метод douЬleValue () неизвестен*/
    // Return the reciprocal.
    /**double reciprocal() {
        return 1 / num.doubleValue(); // Error!
    }*/

    // Return the fractional component.
    /**double fraction() {
        return num.doubleValue() - num.intValue(); // Error!
    }*/

    // ...
}