package beginners_guide_schildt.chapter4_Методы;

class FDemo {
    int x;

    FDemo(int i) {
        x = i;//В конструкторе данного класса устанавливается значение переменной экземпляра
        // х, определяемое передаваемым параметром. В данном примере переменная
        //экземпляра х используется в качестве идентификатора объекта.
    }

    // Вызывается при удалении объекта
    protected void finalize() {
        System.out.println("Finalizing " + x);//При утилизации
        // объекта метод finalize () отображает значение переменной х.
    }

    // Генерирует объект, который тотчас уничтожается
    void generator(int i) {
        FDemo o = new FDemo(i);//метод generator ().
        // В нем создается объект 'o' типа FDemo, который сразу же уничтожается.
    }

}