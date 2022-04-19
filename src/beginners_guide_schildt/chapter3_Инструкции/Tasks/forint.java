package beginners_guide_schildt.chapter3_Инструкции.Tasks;

public class forint {
    public static void main(String[] args) {

        int num = 5, sum = 0, count;

        for (int i = 0; i < num; i ++)
            sum += i;
        //count = i;
        //кусок кода не корректен потому как константе count присваивается значение диапазона значений i (наверно)
        System.out.println(sum);//0+1+2+3+4=10
    }
}
