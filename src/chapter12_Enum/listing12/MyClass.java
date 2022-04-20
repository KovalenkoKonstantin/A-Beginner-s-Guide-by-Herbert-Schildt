package chapter12_Enum.listing12;
// An example that uses @Deprecated. (устаревший, избыточный)

// Deprecate a class.
@Deprecated
class MyClass {
    private String msg;
@Deprecated
    MyClass(String m) {
        msg = m;
    }

    // Deprecate a method within a class.
    @Deprecated
    String getMsg() {
        return msg;
    }

    @interface MyAnno {
        String str();
        int value();
    }
}
