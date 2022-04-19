package beginners_guide_schildt.chapter1_Основы;

/*Демонстрация использования переменных.
Присвойте файлу с исходным кодом имя Example2.java.*/
class Example2 {
    public static void main(String args[]) {
        int varl=1024,var2=varl/2;/*объявляется переменная. В одном операторе можно объявить две и более переменных. Для этого достаточно разделить их имена запятыми.
        int var2=varl/2; объявляется еще одна переменная.
        varl = 1024; переменной varl присваивается значение 1024.*/
        System.out.println("Пepeмeннaя varl содержит (равна) = " + varl);
//        var2 = varl / 2;
        System.out.print("Пepeмeннaя var2 содержит (равна) = varl / 2: ");
        System.out.println(var2);
//       Метод print() действует аналогично методу println(), за исключением того, что его выполнение не завершается переходом на следующую строку.
    }
}