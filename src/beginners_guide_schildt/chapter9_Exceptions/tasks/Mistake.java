package beginners_guide_schildt.chapter9_Exceptions.tasks;

public class Mistake {
    public static void main(String[] args) {

        int vals[] = new int[17];

        try {vals[18] = 10;}
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Mistake taken");
        }
    }
}
