package beginners_guide_schildt.chapter12_Enum.tasks;
// An enumeration of the colors of a traffic light.
public enum TrafficLightColor {
    RED(1000), GREEN(1000), YELLOW_AFTER_RED(1000), YELLOW_AFTER_GREEN(1000);
    private int time; // typical time of each color
    //constructor
    TrafficLightColor(int delay) {
        time = delay;
    }
    //method
    public int getTime() {
        return time;
    }
}
