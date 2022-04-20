package chapter13_Generics.listing10;

class GenConsDemo {
    public static void main(String args[]) {
        Summation ob = new Summation(4D);

        System.out.println("Summation of 4D is 0+1+2+3+4=" +
                ob.getSum());
    }
}
