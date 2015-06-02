package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Date;

/**
 * Created by vishal on 22/5/15.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TesterInfo {
    String createdAt() default "22/05/2015";
    String lastModifiedBy() default "Vishal Joshi";
    Priority priority() default Priority.MEDIUM;
}
