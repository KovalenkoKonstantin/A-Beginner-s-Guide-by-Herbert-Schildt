package beginners_guide_schildt.chapter6_Static.listing7;

class ErrMsg {
    public static void main(String args[]) {
        ErrorMsg error = new ErrorMsg();

        System.out.println(error.getErrorMsg(2));
        System.out.println(error.getErrorMsg(19));
        System.out.println(error.getErrorMsg(3));
    }
}
