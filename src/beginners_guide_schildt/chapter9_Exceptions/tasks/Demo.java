package beginners_guide_schildt.chapter9_Exceptions.tasks;

public class Demo {
    public static void main(String[] args) {

        int array1[] = {2, 4, 6, 8, 9};
        int array2[] = {1, 0, 1, 2, 2};

        for (int i = 0; i < array1.length; i++) {
            try {
                if ((array1[i]%2) != 0)
                    throw new B(array1[i], array2[i]);
                else if (array2[i] == 0)
                    throw new A(array1[i], array2[i]);

            } catch (B exc) {
                System.out.println(exc);
            } catch (A exc) {
                System.out.println(exc);
            }
        }
    }
}
