package beginners_guide_schildt.chapter6_Static.listing7;

// Возврат объекта типа String.
class ErrorMsg {
    String msgs[] = { //метод
            "Ошибка вывода", //0
            "Ошибка ввода", //1
            "Отсутствует место на диске", //2
            "Выход индекса за границы диапазона" //3
    };

    // Return the error message.
    String getErrorMsg(int i) { //Возврат объекта типа String
        if(i >=0 & i < msgs.length)
            return msgs[i];
        //else
            return "Несуществующий код ошибки"; //в случае выхода за пределы массива
    }
}
