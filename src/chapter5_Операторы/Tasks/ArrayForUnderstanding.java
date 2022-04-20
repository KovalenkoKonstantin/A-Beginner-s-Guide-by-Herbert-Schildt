package chapter5_Операторы.Tasks;

public class ArrayForUnderstanding {
    public static void main(String[] args) {
/*        int array [][][] = new int[4][5][6];
        for (int a=0; a<1;){
            for (int b=0;b<3;b++)
                for (int c=0;c<3;c++)
                    System.out.println("array[" + a + "][" + b + "][" + c + "] = "+ array[a][b][c]);
            System.out.println();break;
        }*/
        int array1[][][] = {
                {{1,2,3,4}, {5,6,7,8}},//array1[0][][]
                {{9,10,11,12},{13,14,15,16}},//array1[1][][]
                {{17,18,19,20}, {21,22,23,24}}//array1[2][][]
        };
        for (int x = 0; x < 3; x++){//число массивов в массиве array1
            for (int y = 0; y < 2; y++)//число подмассивов в каждом массиве
                for (int z = 0; z < 4; z++)//количество объявленных элементов подмассивов в каждом массиве
                    System.out.println("array1 [" + x + "][" + y + "][" + z + "] = " + array1[x][y][z]);
        System.out.println();}
        System.out.println("длинна массива array1[][][] составляет: " + array1.length);
            System.out.println();
    }
/*        int[][][] arr = { { { 1, 2 }, { 3, 4 } },
                { { 5, 6 }, { 7, 8 } } };

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                for (int k = 0; k < 2; k++) {

                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
        }
    }*/
}
