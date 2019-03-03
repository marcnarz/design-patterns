package marcnarz.design.pattern.creational.singleton;

public class SingletonPattern {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.toString());
    }
}
