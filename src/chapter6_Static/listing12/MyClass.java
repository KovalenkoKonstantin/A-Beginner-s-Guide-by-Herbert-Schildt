package chapter6_Static.listing12;

// Демонстрация перегрузки конструкторов.
class MyClass {
    int x;

    MyClass() { //Конструирование объектов разными способами
        System.out.println("Внутри MyClass().");
        x = 0;
    }

    MyClass(int i) { //Конструирование объектов разными способами
        System.out.println("Внутри MyClass(int).");
        x = i;
    }

    MyClass(float d) { //Конструирование объектов разными способами
        System.out.println("Внутри MyClass(float).");
        x = (int) d;
    }

    MyClass(int i, int j) { //Конструирование объектов разными способами
        System.out.println("Внутри MyClass(int, int).");
        x = i * j;
    }
}
