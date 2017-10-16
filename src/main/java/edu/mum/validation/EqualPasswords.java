package edu.mum.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {EqualPasswordsValidator.class})
public @interface EqualPasswords {
 
    String message() default "{com.dolszewski.blog.EqualPasswords.message}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
 
}