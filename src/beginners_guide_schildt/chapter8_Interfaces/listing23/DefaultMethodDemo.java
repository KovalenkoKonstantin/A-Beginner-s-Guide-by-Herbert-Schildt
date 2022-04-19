package beginners_guide_schildt.chapter8_Interfaces.listing23;

// Use the default method.
class DefaultMethodDemo {
    public static void main(String args[]) {

        MyIFImp2 obj = new MyIFImp2();

        // Can call getUserID(), because it is explicitly
        // implemented by MyIFImp:
        System.out.println("User ID is " + obj.getUserID());

        // Can also call getAdminID(), because of default
        // implementation:
        System.out.println("Administrator ID is " + obj.getAdminID());
    }
}