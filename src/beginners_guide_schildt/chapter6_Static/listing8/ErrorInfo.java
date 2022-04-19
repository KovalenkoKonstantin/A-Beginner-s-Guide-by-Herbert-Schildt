package beginners_guide_schildt.chapter6_Static.listing8;

class ErrorInfo {
    String msgs[] = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутствует место на диске",
            "Выход индекса за границы диапазона"
    };
    String howbad[] = { "3", "3", "весьма", "4" };

    Err getErrorInfo(int i) { //Возврат объекта типа Err
        if(i >=0 & i < msgs.length)
            return new Err(msgs[i], howbad[i]);
        //else
            return new Err("Несуществующий код ошибки", "0");
    }
}
