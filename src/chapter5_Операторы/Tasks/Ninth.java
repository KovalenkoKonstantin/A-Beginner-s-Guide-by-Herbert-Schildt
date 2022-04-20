package chapter5_Операторы.Tasks;

/*Перепишите приведенную ниже последовательность операторов, воспользовавшись
        оператором ?.
        if(x < 0) у= 10;
        else у= 20;*/

public class Ninth {
    public static void main(String[] args) {

/*        int y;
        for (int x = -1; x < 1; x++){
        if(x < 0) y = 10;
        else y = 20;
            System.out.println(x + " : " + y + "\t");
        }*/

        for (int x = -1; x < 1; x++){
            int y = x < 0 ? 10 : 20;
            System.out.println(x + " : " + y + "\t");
        }
    }
}
