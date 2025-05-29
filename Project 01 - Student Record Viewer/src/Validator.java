public class Validator {

    private static boolean nameValidator(String _name) throws ExceptionHandler {
        if (_name.isEmpty()) {
            throw new ExceptionHandler("Name cant be empty");
        } else if (!Character.isLetter(_name.charAt(0))) {
            throw new ExceptionHandler("First letter must be a letter");
        }
        return true;
    }

    private static boolean ageValidator(int _age) throws ExceptionHandler {
        if (_age < 10 || _age > 30) {
            throw new ExceptionHandler("not in the age limit");
        }
        return true;
    }

    private static boolean gpaValidator(Double _value) throws ExceptionHandler {
        if (_value > 4) {
            throw new ExceptionHandler("GPA cant be more than 4.0");
        } else if (_value < 0) {
            throw new ExceptionHandler("GPA cant be less than 0");
        }
        return true;
    }

    public static <T> boolean isValid(T value) throws ExceptionHandler {
        return switch (value) {
            case String s -> nameValidator(s);
            case Integer i -> ageValidator(i);
            case Double v -> gpaValidator(v);
            case null, default -> throw new ExceptionHandler("invalid");
        };
    }
}
