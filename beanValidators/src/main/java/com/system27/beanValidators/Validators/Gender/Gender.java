package com.system27.beanValidators.Validators.Gender;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = GenderValidator.class)
@Documented
public @interface Gender {
    String message() default "Gender is not allowed.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
