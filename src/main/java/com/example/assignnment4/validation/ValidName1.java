package com.example.assignnment4.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = ValidNameValidator2.class)
public @interface ValidName1 {
    String message() default "NOT a proper valid name format";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}