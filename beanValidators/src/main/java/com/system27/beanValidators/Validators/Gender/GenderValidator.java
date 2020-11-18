package com.system27.beanValidators.Validators.Gender;

import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class GenderValidator implements ConstraintValidator<Gender, String> {

    List<String> genders = Arrays.asList("Male", "Female");

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return genders.contains(value);
    }

}
