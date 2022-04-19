package beginners_guide_schildt.chapter5_Операторы;

// Применение метода substring().
class SubStr {
    public static void main(String args[]) {
        String orgstr = "Java makes the Web move.";

        // Сформировать подстроку
        String substr = orgstr.substring(5, 18);//checkBoundsBeginEnd
        //Здесь создается новая строка,
        //содержащая нужную подстроку

        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);

    }
}
