package chapter13_Generics.listing9;

// Demonstrate a simple generic method.
class GenericMethodDemo {

    // Determine if the contents of two arrays are same.
    //Параметры типа <> объявляются перед возвращаемым типом
    //интерфейс Comparable, определяет упорядочиваемыеобъекты.
    //Таким образом, установление Comparable в качестве верхней границы
    //допустимых типов гарантирует, что метод arraysEqual () можно использовать только
    //в отношении объектов, допускающих сравнение.
    //тип v ограничен сверху типом T. Следовательно, тип v должен либо совпадать с типом T,
    //либо быть eгo подклассом. В силу этого метод arrayEquals () может вызываться лишь с аргументами,
    //которые можно сравнивать между собой.
    //метод объявлен как статический и поэтому вызывается без привязки к какому-либо объекту.
    private static <T extends Comparable<T>, V extends T> boolean arraysEqual(T[] x, V[] y) {
        // If array lengths differ, then the arrays differ.
        if(x.length != y.length) return false;

        for(int i=0; i < x.length; i++)
            if(!x[i].equals(y[i])) return false; // arrays differ

        return true; // contents of arrays are equivalent
    }

    public static void main(String args[]) {

        Integer nums[] = { 1, 2, 3, 4, 5 };
        Integer nums2[] = { 1, 2, 3, 4, 5 };
        Integer nums3[] = { 1, 2, 7, 4, 5 };
        Integer nums4[] = { 1, 2, 7, 4, 5, 6 };

        if(arraysEqual(nums, nums)) //Аргументы типа Т и V неявно определяются при вызове метода
            System.out.println("nums equals nums");

        if(arraysEqual(nums, nums2))
            System.out.println("nums equals nums2");

        if(arraysEqual(nums, nums3))
            System.out.println("nums equals nums3");

        if(arraysEqual(nums, nums4))
            System.out.println("nums equals nums4");
        else System.out.println("nums not equals nums4");

        // Create an array of Doubles
        Double dvals[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };

        // This won't compile because nums and dvals
        // are not of the same type.
        // if(arraysEqual(nums, dvals))
        // System.out.println("nums equals dvals");
    }
}
