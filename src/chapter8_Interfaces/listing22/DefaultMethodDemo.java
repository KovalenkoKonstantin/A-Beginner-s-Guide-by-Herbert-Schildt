package chapter8_Interfaces.listing22;

import chapter8_Interfaces.listing20.MyIF;
import chapter8_Interfaces.listing21.*;

// Use the default method.
class DefaultMethodDemo {
    public static void main(String args[]) {

        MyIFImp obj = new MyIFImp();

        // Can call getUserID(), because it is explicitly
        // implemented by MyIFImp:
        System.out.println("User ID is " + obj.getUserID());

        // Can also call getAdminID(), because of default
        // implementation:
        System.out.println("Administrator ID is " + obj.getAdminID());
        System.out.println("Universal ID is " + MyIF.getUniversalID());
        //Для вызова статического метода
        //следует указать его имя интерфейса, а после него, используя точечную нотацию, имя
        //самого метода.
    }
}