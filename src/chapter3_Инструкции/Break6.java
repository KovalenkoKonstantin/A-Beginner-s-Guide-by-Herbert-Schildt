package chapter3_Инструкции;

// Расположение метки имеет большое значение
class Break6 {
    public static void main(String args[]) {
        int x  =0, y = 0;

// Здесь метка располагается перед оператором for
        stop1: for(x = 0; x < 5; x++) {
                    for(y = 0; y < 5; y++) {
                        if(y == 2) break stop1;
                System.out.println("x и y: " + x + " " + y);
            }
        }
        System.out.println();
// А здесь метка располагается непосредственно перед открывающей фигурной скобкой {
        for(x=0; x < 5; x++)
        stop2: {
                for(y = 0; y < 5; y++) {
                    if(y == 2) break stop2;
                    System.out.println("x и y: " + x + " " + y);
                }
            }
/*        one: for(int i=0; i<3; i++) {
            System.out.print("Pass " + i + ": ");
        }
        for(int j=0; j<100; j++) {
            if(j == 10) break one; // WRONG
            // оператор break использует метку, не определенную в охватывающем eгo цикле
            System.out.print(j + " ");
        }*/
    }
}
