package me.oriley.mortein;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

@SuppressWarnings("unused")
@Target({TYPE, METHOD, CONSTRUCTOR})
@Retention(CLASS)
public @interface DebugLog {
    boolean enabled() default true;
}
