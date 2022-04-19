package edu.mfti;

public class primitive {
    public static void main(String[] args) {
        System.out.println(010);//8
        System.out.println(2.0/0.0);//Infinity
        System.out.println("not compile");// что-то "c:\Users"
        String txt = """
                Some
                     Text
             Is
         Here
                        Yep            
                """;
        System.out.println(txt);//from java 13
    }
}
