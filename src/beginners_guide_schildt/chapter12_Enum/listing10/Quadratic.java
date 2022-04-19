package beginners_guide_schildt.chapter12_Enum.listing10;
// Find the solutions to a quadratic equation.
class Quadratic {
    public static void main(String args[]) {

        // a, b, and c represent the coefficients in the
        // quadratic equation: ax2 + bx + c = 0
        double a, b, c, x;

        // Solve 4x2 + x - 3 = 0 for x.
        a = 4;
        b = 1;
        c = -3;

        // Find first solution.
/**pow() возвращает значение, возведенное в заданную степень
 * sqrt () возвращает квадратный корень переданного значения*/
        x = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("First solution: " + x);
/**Методы pow () и sqrt () - статические, а следовательно, их нужно вызывать, ссылаясь
 на имя класса Math.    */
        // Find second solution.
        x = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("Second solution: " + x);
    }
}
