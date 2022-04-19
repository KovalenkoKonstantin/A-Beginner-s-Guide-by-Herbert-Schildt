package beginners_guide_schildt.chapter12_Enum.listing3;

// Use an enum constructor, instance variable, and method.
public enum Transport {
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);

    private int speed; // typical speed of each transport
    // конструктор
    Transport(int s) {speed = s;}
    // метод
    public int getSpeed() {return speed;}
}
