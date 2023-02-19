package oops;

public class Pen {
    String color = "Green";
    String type = "Micro tip";
    static boolean clicked = false;

    public static void click(){
        clicked = true;
    }
    public static void unclick(){
        clicked = false;
    }

}
