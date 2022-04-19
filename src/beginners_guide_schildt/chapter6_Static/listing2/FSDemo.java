package beginners_guide_schildt.chapter6_Static.listing2;

// Демонстрация работы с "отказоустойчивым" массивом.
class FSDemo {
    public static void main(String args[]) {
        FailSoftArray fs = new FailSoftArray(5, -1);//обращение к классу FailSoftArray
        int x;

        // Демонстрация корректной обработки ошибок
        System.out.println("Обработка ошибок без вывода отчета:");
        for(int i=0; i < (fs.length * 2); i++) //i инкрементируется за пределы длины массива
            //согласно конструктору FailSoftArray
            //length = size -> fs.length = 5
            //i = 0-9
            fs.put(i, i*10); //Для обращения к элементам массива должны использоваться методы доступа
            //метод put,  в случае если значение i в пределах допустимости массива i = 0-4
            //присваивает новые значения элементам массива согласно конструктору FailSoftArray
        // a = new int[size]
        // a[index] = val где index = i
            // новые значения size это значение i, а errv это значение i*10
            //0*10  1*10    2*10    3*10    4*10
        for(int i=0; i < (fs.length * 2); i++) { //i инкрементируется за пределы длины массива
            x = fs.get(i); //Для обращения к элементам массива должны использоваться методы доступа
            if(x != -1) //в случае выхода за пределы массива метод get возвращает значение errval
            //который согласно конструктору FailSoftArray errval = errv = -1
            //поэтому для последних пяти значений за пределаим массива выводится errv = -1
            //для исключения вывода на экран errv = -1 вводится условие if
                System.out.print(x + " ");
        }
        System.out.println();

        // обработать ошибки
/*        System.out.println("\nОбработка ошибок с выводом отчета.");
        for(int i=0; i < (fs.length * 2); i++) //i инкрементируется за пределы длины массива
            if(!fs.put(i, i*10))
                System.out.println("Index " + i + " вне допустимого диапазона");

        for(int i=0; i < (fs.length * 2); i++) { //i инкрементируется за пределы длины массива
            x = fs.get(i);
            if(x != -1) System.out.print(x + " ");
            else
                System.out.println("Index " + i + " вне допустимого диапазона");
        }*/
    }
}
