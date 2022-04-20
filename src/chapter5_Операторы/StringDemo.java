package chapter5_Операторы;

// Знакомство с классом String.
class StringDemo {
    public static void main(String args[]) {
        // declare strings in various ways
        String str1 = new String("В Java строки - объекты."); //класс String объявлен в самой системе
        String str2 = "Их можно создавать разными способами.";
        String str3 = new String(str2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
