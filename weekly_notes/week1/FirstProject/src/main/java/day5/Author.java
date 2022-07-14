package day5;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface Author {
    String authorName();
    String purpose();
    String dateCreated();
}
