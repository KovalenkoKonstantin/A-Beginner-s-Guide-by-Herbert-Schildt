package chapter1_Основы;

/*программа, которая вычисляет ваш вес на Луне*/

class Moon {
    public static void main(String[] args) {
        double myweight = 96;
        double moon = myweight * 0.17;

        if (myweight <= 0)
            System.out.println("значение веса не может быть меньше нуля");

        if (myweight > 0)
        System.out.println("если допустить, что мой вес на земле составляет: " + myweight +" килограмм, - ");
        if (myweight > 0)
        System.out.println("тогда мой вес на луне составит около: " + moon +" килограмм");
    }
}
