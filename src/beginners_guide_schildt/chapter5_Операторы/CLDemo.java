package beginners_guide_schildt.chapter5_Операторы;

// Отображение всех данных, указываемых в командной строке.
//для запуска необходимо: Run-Edit_Configurations-в поле Program arguments
//дописать "one two three"
class CLDemo {
    public static void main(String args[]) {
        System.out.println("Программе передано " + args.length +
                " аргументов командной строки.");

        System.out.println("Список аргументов: ");
        for(int i=0; i<args.length; i++)
            System.out.println("arg[" + i + "]: " + args[i]);
    }
}
