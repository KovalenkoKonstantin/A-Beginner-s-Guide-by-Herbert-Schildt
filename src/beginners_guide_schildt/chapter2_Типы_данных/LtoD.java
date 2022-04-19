package beginners_guide_schildt.chapter2_Типы_данных;

// Demonstrate automatic conversion from long to double.
// Демонстрация автоматического преобразования типа long в тип double
class LtoD {
    public static void main(String[] args) {
        long L = 100_123_285L;
        System.out.println("исходное значение в формате long: "+L);

        double D = L;//атоматическое преобразование типа long в тип double
        System.out.println("атоматическое преобразование типа long в тип double");
        System.out.println("запись в формате long: " + L + "\nзапись в формате double " + D);
        // *** This program will not compile. ***
        // Эта программа не пройдет компиляцию
//            long L = 100123285.0;
//            double D = L;// Illegal!!!
//            System.out.println("L and D: " + L + " " + D);
// В то же время тип double не может быть автоматически преобразован в тип long,
//поскольку такое преобразование уже не является расширяющим.
    }
}
