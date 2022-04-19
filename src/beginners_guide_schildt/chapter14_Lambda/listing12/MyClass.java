package beginners_guide_schildt.chapter14_Lambda.listing12;
import beginners_guide_schildt.self_annotations.*;

public class MyClass {
    private String str;

    // This constructor takes an argument.
    @Constructor
    public MyClass(String str) { this.str = str; }

    // This is the default constructor.
    @Constructor
    MyClass() { str = ""; }

    // ...
    @Getter
    String getStr() { return str; }
}
