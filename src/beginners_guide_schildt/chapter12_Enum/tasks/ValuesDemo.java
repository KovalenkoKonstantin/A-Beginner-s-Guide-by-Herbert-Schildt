package beginners_guide_schildt.chapter12_Enum.tasks;
/**Напишите для приведенного ниже перечисления программу, в которой метод
 values () используется для отображения списка констант и их значений.
 enum Tools {
 SCREWDRIVER, WRENCH, НАММЕR, PLIERS
 }*/
public class ValuesDemo {
    public static void main(String[] args) {
        for (Tools tools : Tools.values()) {
            System.out.println(tools + " "+ tools.ordinal());
        }
    }
}
