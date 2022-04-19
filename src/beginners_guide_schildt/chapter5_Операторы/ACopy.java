package beginners_guide_schildt.chapter5_Операторы;

// Use length variable to help copy an array.
//Использование переменной length для копирования массивов
class ACopy {
    public static void main(String args[]) {
        int i;
        int nums1[] = new int[10];
        int nums2[] = new int[10];

        for(i=0; i < nums1.length; i++)//10
            nums1[i] = i;

        // Копировать массив numsl в массив nums2
        if(nums2.length >= nums1.length)
            //Использование переменной length для сравнения размеров массивов
            //позволяет убедиться в том, что размера целевого массива достаточно
            //для хранения содержимого исходного массива
            for(i = 0; i < nums2.length; i++)
                //формируется условие завершения цикла,
                //в котором выполняется копирование массива
                nums2[i] = nums1[i];

        for(i=0; i < nums2.length; i++)
            System.out.print(nums2[i] + " ");
    }
}
