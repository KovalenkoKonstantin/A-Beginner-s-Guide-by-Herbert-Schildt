package beginners_guide_schildt.chapter9_Exceptions.listing11;

// Using the Throwable methods.

class ExcTest {
    static void genException() {
        int nums[] = new int[4];

        System.out.println("Before exception is generated.");

        // generate an index out-of-bounds exception
        nums[7] = 10;
        System.out.println("this won't be displayed");
    }
}
