package beginners_guide_schildt.chapter12_Enum.tasks;

public class Autoboxing {
    public static void main(String[] args) {
        Short val = new Short((short) 123);//manually
        short sh = val.shortValue();
        System.out.println(val + " " + sh);

        System.out.println();

        Short obj = 321; //autoboxing
        short s = obj;
        System.out.println(obj + " " + s);
    }
}
