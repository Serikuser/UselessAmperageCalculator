package by.siarhei.pikabu.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputDataValidator {
    private static final String REGEX_NON_NUMERIC = "[^\\d. +-]+";

    // TODO: 04.04.2020 need more validation cases
    public boolean validate(String diameter, String length, String inputAmper) {
        return isNumeric(diameter) && isNumeric(length) && isNumeric(inputAmper);
    }

    private boolean isNumeric(String value) {
        Pattern pattern = Pattern.compile(REGEX_NON_NUMERIC);
        Matcher matcher = pattern.matcher(value);
        return !value.isBlank() && !matcher.find();
    }
}
