package test.annotation.inherited;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author sherlock
 * @since 2/2/18.
 */
/*This @Retention annotation is required; otherwise Class.isAnnotationPresent() won't work*/
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface InheritanceAnnoTester {
}
