package marcnarz.design.pattern.creational.builder;

import lombok.*;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder(builderClassName = "Builder", toBuilder = true)
@Getter
@ToString
public class Book {

    private String isbn;

    private String title;

    private String shortDescription;
}
