package chapter12_Enum.listing11;
// Use static import to bring sqrt() and pow() into view.

//import static java.lang.Math.sqrt; //static import
//import static java.lang.Math.pow; //static import
import static java.lang.Math.*; //static import
import static java.lang.System.out; //static import

class Quadraticv1 {
    public static void main(String args[]) {

        // a, b, and c represent the coefficients in the
        // quadratic equation: ax2 + bx + c = 0
        double a, b, c, x;

        // Solve 4x2 + x -3 = 0 for x.
        a = 4;
        b = 1;
        c = -3;

        // Find first solution.
        x = (-b + sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("First solution: " + x);

        // Find second solution.
        x = (-b - sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("Second solution: " + x);
        out.println("Импортировав System.out, имя out можно использовать непосредственно");
    }
}
