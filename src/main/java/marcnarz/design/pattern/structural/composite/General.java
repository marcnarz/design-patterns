package marcnarz.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.Collection;

public class General implements Soldier {

    private final Collection<Soldier> soldiers = new ArrayList<>();

    public void addSoldier(Soldier soldier) {
        soldiers.add(soldier);
    }

    @Override
    public void salute() {
        for (Soldier soldier : soldiers) {
            soldier.salute();
        }
    }
}
