package marcnarz.design.pattern.visitor;

public class VisitiorPattern {

    public static void main(String[] args) {
        Carrot carrot = new Carrot();
        Onion onion = new Onion();
        Tomato tomato = new Tomato();

        Bucket bucket = new Bucket();
        bucket.add(carrot);
        bucket.add(onion);
        bucket.add(tomato);

        Discounter discounter = new Discounter();
        bucket.calculateDiscount(discounter);
    }
}
