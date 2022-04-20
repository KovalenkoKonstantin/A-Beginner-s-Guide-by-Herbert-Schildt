package chapter8_Interfaces.interfaces;

public class animal implements interfaces{
    public int id;

    public animal(int id) {
        this.id = id;
    }

    public void sleep (){
        System.out.println("I'm sleeping");
    }

    @Override
    public void showinfo() {
        System.out.println("I'm animal " + id);
    }
}
