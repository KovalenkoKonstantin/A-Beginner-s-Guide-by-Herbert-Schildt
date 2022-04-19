package beginners_guide_schildt.chapter6_Static.listing8;

// Возврат объекта, определяемого разработчиком программы.
class Err {
    String msg; // сообщение об ошибке
    String severity; // уровень серьезности ошибки

    Err(String m, String s) { //конструктор
        msg = m;
        severity  = s;
    }
}
