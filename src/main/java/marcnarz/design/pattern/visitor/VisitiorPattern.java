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

        System.out.println("-----SMALL-DISCOUNTER-----");
        SmallDiscounter smallDiscounter = new SmallDiscounter();
        bucket.calculateDiscount(smallDiscounter);

        System.out.println();

        System.out.println("-----BIG-DISCOUNTER-----");
        BigDiscounter bigDiscounter = new BigDiscounter();
        bucket.calculateDiscount(bigDiscounter);
    }
}
