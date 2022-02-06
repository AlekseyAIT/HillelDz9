package ukraine.odessa.hillel.calculator;
import java.lang.annotation.*;

@CustomAnno(type = "guide", forWho = "otherProgrammers")
@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.SOURCE)
public @interface MainMethod {
}
