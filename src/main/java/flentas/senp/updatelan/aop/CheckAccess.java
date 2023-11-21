package flentas.senp.updatelan.aop;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
/*CheckAccess annotation to check 
 * Authentication as well as Authorization */
@Retention(RUNTIME)
public @interface CheckAccess {
	
}
