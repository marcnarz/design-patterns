package marcnarz.design.pattern.structural.composite;

public class Officer implements Soldier {

    @Override
    public void salute() {
        System.out.println("Officer - salute");
    }
}
