package beginners_guide_schildt.chapter13_Generics.tasks.vehicle;

public interface Boeing {
    String aircraftName = null;
    int aircraftSpeed = 0;

    default void boeing (){
        System.out.println("I can fly " + aircraftName + " with speed " + aircraftSpeed);
    }
}
