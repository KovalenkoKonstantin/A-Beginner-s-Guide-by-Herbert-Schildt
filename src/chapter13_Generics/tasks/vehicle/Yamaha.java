package chapter13_Generics.tasks.vehicle;

public interface Yamaha {
    String bikeMark = null;

    default void yamaha (){
        System.out.println("Kawabanga!! " + bikeMark);
    }
}
