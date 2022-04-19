package beginners_guide_schildt.chapter4_Методы;

class VehConsDemo {
    public static void main(String args[]) {

        // construct complete vehicles
        Vehicle minivan = new Vehicle(7, 16, 21);
        //При создании объекты minivan и sportscar инициализируются конструктором Vehicle ().
        //значения 7, 16 и 21 передаются конструктору Vehicle () при создании нового объекта
        //mini van с помощью оператора new.
        // В итоге копии переменных passengers, fuelcap и mpg в объекте minivan будут содержать
        //значения 7, 16 и 21 соответственно.
        Vehicle sportscar = new Vehicle(2, 14, 12);
        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);//fuelneeded - метод класса Vehicle
        // возвращающий значение переменной тела метода делённой на расход топлива

        System.out.println("To go " + dist + " miles minivan needs " +
                gallons + " gallons of fuel.");

        gallons = sportscar.fuelneeded(dist);

        System.out.println("To go " + dist + " miles sportscar needs " +
                gallons + " gallons of fuel.");
    }
}