package beginners_guide_schildt.chapter2_Типы_данных;

/* Try This 2-1
    Рассчитать расстояние до места впышки молнии, звук от которого
    доходит до наблюдателя через 7,2 секунды
    Звук распространяется в воздухе со скоростью, приблизительно равной 1100 фут/с.
   Compute the distance to a lightening
   strike whose sound takes 7.2 seconds
   to reach you.*/
class Sound {
    public static void main(String args[]) {
        double dist;
        int m;
        int rock;
        float v = 7.2f;

        dist = v * 1_100;

        System.out.println("Paccтoяниe до места вспышки молнии /The lightening is " + dist +
                " футов /feet away.");
        m = (int) (dist/3.28084);
        System.out.println("Что примерно соответствует " + m + " метрам");
        rock = m/2;
        System.out.println("Если хлопнуть в ладоши и отражённый звук вернётся через " + v +" секунд,");
        System.out.println("то это будет означать то, что объект находится на расстоянии примерно " + rock + " метров от вас");

    }
}
