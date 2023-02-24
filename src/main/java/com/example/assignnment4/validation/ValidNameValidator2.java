package com.example.assignnment4.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidNameValidator2 implements ConstraintValidator<ValidName1,String> {
    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(s.matches("[a-z0-9 .]+"))
        {
            return true;

        }
        else
        {
            return false;
        }
    }
}