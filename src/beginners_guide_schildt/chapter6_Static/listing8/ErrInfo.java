package beginners_guide_schildt.chapter6_Static.listing8;

class ErrInfo {
    public static void main(String args[]) {
        ErrorInfo err = new ErrorInfo();
        Err e;

        e = err.getErrorInfo(2);
        System.out.println(e.msg + " уровень: " + e.severity);

        e = err.getErrorInfo(19);
        System.out.println(e.msg + " уровень: " + e.severity);
//При каждом вызове метода getErrorinfo () создается новый объект типа Err, и
//ссылка на него возвращается вызывающему методу. Затем этот объект используется методом
//main () для отображения уровня серьезности ошибки и текстового сообщения.
//Объект, возвращенный методом, существует до тех пор, пока на него имеется хотя бы
//одна ссылка. Если ссылки на объект отсутствуют, он уничтожается сборщиком мусора.
    }
}
