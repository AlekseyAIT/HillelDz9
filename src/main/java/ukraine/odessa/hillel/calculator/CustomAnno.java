package ukraine.odessa.hillel.calculator;
import java.lang.annotation.*;

/*
 * type():
 * "guide" - if annotation helps people to understand the sense of some methods
 *
 * ...
 *
 * forWho():
 * Who is the annotation for ->
 * (it may be for other programmers or for computer)
 *
 * */


@Target(value = ElementType.ANNOTATION_TYPE)
@Retention(value = RetentionPolicy.SOURCE)
public @interface CustomAnno {
    String type();
    String forWho();
}
