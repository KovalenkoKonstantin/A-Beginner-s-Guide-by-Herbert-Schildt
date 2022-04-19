package beginners_guide_schildt.chapter2_Типы_данных;
/* Use the Pythagorean theorem to find
   the length of the hypotenuse
   given the lengths of the two opposing
   sides.*/
class Hypot {
    public static void main(String args[]) {
        double x, y, z;

        x = 3;
        y = 4;

        z = Math.sqrt(x*x + y*y);
        /*перед именем метода sqrt указывается имя класса Math,
         членом которого он является*/

        System.out.println("Hypotenuse is " +z);
    }
}
