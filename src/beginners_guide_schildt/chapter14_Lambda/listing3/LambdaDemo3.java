package beginners_guide_schildt.chapter14_Lambda.listing3;
class LambdaDemo3 {
    public static void main(String args[])
    {
        // This lambda expression determines if one string is
        // part of another.
        StringTest isIn = (a, b) -> a.indexOf(b) != -1;
        StringTest isInv1 = (String a, String b) -> a.indexOf(b) != -1;
        StringTest isInv2 = (a, b) -> a.contains(b);

        String str = "This is a test";

        System.out.println("Testing string: " + str);

        if(isIn.test(str, "is a"))
            System.out.println("'is a' found.");
        else
            System.out.println("'is a' not found.");

        if(isIn.test(str, "xyz"))
            System.out.println("'xyz' Found");
        else
            System.out.println("'xyz' not found");

        if(isInv2.test(str, "a "))
            System.out.println("'a ' Found");
        else
            System.out.println("'a ' not found");
    }
}
