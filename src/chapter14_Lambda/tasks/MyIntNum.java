package chapter14_Lambda.tasks;

import beginners_guide_schildt.self_annotations.Constructor;
import beginners_guide_schildt.self_annotations.Getter;
import beginners_guide_schildt.self_annotations.Method;

/**
 * В программе MethodRefDemo2 добавьте в класс MyIntNum новый метод
 * hasCommonFactor(). Этот метод должен возвращать true, если его аргумент
 * типа int и значение, которое хранится в вызывающем объекте MyintNum, имеют
 * по крайней мере один общий делитель.
 * Продемонстрируйте работу метода hasCommonFactor(), используя ссылку на метод.
 */
class MyIntNum {
    private int v;
    private int f;

    @Constructor
    MyIntNum(int x) {
        v = x;
    }

    @Getter
    int getV() {
        return v;
    }

    @Method
    boolean isFactor(int n) {
        f = n;
        if (n == 0) return false;
        else return (v % n) == 0;
    }

    @Getter
    int getF() {
        return f;
    }

    @Method
    int commonFactor(int n) {
        int result = 1;
        f = n;
        if (f == 0) {
            System.out.println("f не может быть равным нулю");
            return 1;
        }
        if (v == 0) {
            System.out.println("v не может быть равным нулю");
            return 1;
        }

        n = n < 0 ? -n : n;

        for (int i = 2; i <= n; i++) {
            if ((n % i) == 0) {
                result = i;
                if ((v % result) == 0) return result;
                else return 1;
            }
        }
        return result;
    }

    @Method
    boolean devideOneAnother(int v, int f) {
        this.v = v;
        this.f = f;
        if (f == 0) {
            System.out.println("f не может быть равным нулю");
            return false;
        }
        if (v == 0) {
            System.out.println("v не может быть равным нулю");
            return false;
        }

        if ((v % f) == 0 || (f % v) == 0)
            return true;
        return false;
    }

    @Method
    boolean hasCommonFactor(int f) {
        this.f = f;

        f = f < 0 ? -f : f;

        for (int i = 2; i <= f; i++)
            if (((f % i) == 0) && ((v % i) == 0)) return true;
        return false;
    }
}


