package beginners_guide_schildt.chapter8_Interfaces.interfaces;

public class person implements interfaces{
    String name;

    public person(String name) {
        this.name = name;
    }

    public void sayhello (){
        System.out.println("Say hello");
    }

    @Override
    public void showinfo() {
        System.out.println("I'm human " + name);
    }
}
