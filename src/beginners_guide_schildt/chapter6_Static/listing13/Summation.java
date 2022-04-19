package beginners_guide_schildt.chapter6_Static.listing13;

// Инициализация одного объекта посредством другого.
class Summation {
    int sum;

    // Создать объект на основе целочисленного значения.
    Summation(int num) {
        sum = 0;
        for(int i=1; i <= num; i++)
            sum += i;
    }

    // Создать один объект на основе другого.
    Summation(Summation ob) {
        sum = ob.sum;
    }
}
