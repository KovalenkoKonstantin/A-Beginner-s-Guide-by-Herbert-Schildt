package beginners_guide_schildt.chapter12_Enum.listing5;

// Try This 12-1
// A simulation of a traffic light that uses
// an enumeration to describe the light's color
// A computerized traffic light
public class TrafficLightSimulator extends Thread {
    private Thread thd; // holds the thread that runs the simulation
    private TrafficLightColor tlc; // holds the current traffic light color
    boolean stop = false; // set to true to stop the simulation
    boolean changed = false; // true when the light has changed

    public TrafficLightSimulator(TrafficLightColor tlc) {
        this.tlc = tlc;
        thd = new Thread(this);
        thd.start();
    }

    public TrafficLightSimulator() {
        tlc = TrafficLightColor.GREEN;
    }

    // Start up the light.
    @Override
    public void run() {
        while (!stop) {
            try {
                switch (tlc) {
                    case RED:
                        Thread.sleep(1000);
                        break;
                    case GREEN:
                        Thread.sleep(1000);
                        break;
                    case YELLOW_AFTER_GREEN:
                        Thread.sleep(1000);
                        break;
                    case YELLOW_AFTER_RED:
                        Thread.sleep(1000);
                        break;
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            changeColor();
        }
    }

    // Change color.
    synchronized void changeColor() {
        switch (tlc) {
            case RED:
                tlc = TrafficLightColor.YELLOW_AFTER_RED;
                break;
            case GREEN:
                tlc = TrafficLightColor.YELLOW_AFTER_GREEN;
                break;
            case YELLOW_AFTER_GREEN:
                tlc = TrafficLightColor.RED;
                break;
            case YELLOW_AFTER_RED:
                tlc = TrafficLightColor.GREEN;
                break;
        }
        changed = true;
        notify(); // signal that the light has changed
    }

    // Wait until a light change occurs.
    synchronized void waitForChange() {
        try {
            while (!changed)
                wait(); // wait for light to change
            changed = false;
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    // Return current color.
    synchronized TrafficLightColor getTlc() {
        return tlc;
    }

    // Stop the traffic light.
    synchronized void cancel() {
        stop = true;
    }
}
