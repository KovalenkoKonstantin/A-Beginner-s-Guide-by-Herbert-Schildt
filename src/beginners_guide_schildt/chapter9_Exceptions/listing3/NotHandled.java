package beginners_guide_schildt.chapter9_Exceptions.listing3;

// Let JVM handle the error.
class NotHandled {
    public static void main(String args[]) {
        int nums[] = new int[4];

        System.out.println("Before exception is generated.");

        // generate an index out-of-bounds exception
        nums[7] = 10;
    }
}

