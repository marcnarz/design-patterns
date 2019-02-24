package marcnarz.design.pattern.creational.builder;

public class BuilderPattern {

    public static void main(String[] args) {
        Book book = Book.builder()
                .isbn("1234567890")
                .title("Design Patterns")
                .shortDescription("Design patterns for java developers")
                .build();
        System.out.println(book);
    }
}
