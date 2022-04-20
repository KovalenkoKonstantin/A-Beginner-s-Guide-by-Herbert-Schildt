package chapter8_Interfaces.listing24;

// Усовершенствованная версия интерфейса Series, которая включает
// используемый по умолчанию метод getNextArray()
public interface Series extends MyIF{
        int getNext(); // вернуть следующее число в ряду
// Возвратить массив, который содержит n элементов,
// располагающихся в ряду вслед за текущим элементом
default int[] getNextArray(int n) {
        int[] vals = new int[n];
        for(int i=0; i < n; i++)
            vals[i] = getNext();
        return vals;
}
        void reset(); // сброс
        void setStart(int х); // установка начального значения
}