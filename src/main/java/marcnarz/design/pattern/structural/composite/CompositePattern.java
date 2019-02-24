package marcnarz.design.pattern.structural.composite;

public class CompositePattern {

    public static void main(String[] args) {
        Cadet cadet = new Cadet();
        Sergeant sergeant = new Sergeant();
        Officer officer = new Officer();

        General general = new General();
        general.addSoldier(officer);
        general.addSoldier(sergeant);
        general.addSoldier(cadet);

        general.salute();
    }
}
