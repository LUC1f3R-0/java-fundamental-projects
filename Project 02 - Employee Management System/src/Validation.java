public class Validation {
    private static boolean idValidator(String _id) throws ExceptionHandler {
        if (_id.contains(" ")) {
            throw new ExceptionHandler("Id cant contain spaces");
        }

        for (char c : _id.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new ExceptionHandler("Id cant contain other than number");
            }
        }
        return true;
    }

    private static boolean nameValidator(String _name) throws ExceptionHandler {
        if (!Character.isLetter(_name.charAt(0))) {
            throw new ExceptionHandler("first character must be a letter");
        }
        return true;
    }

    private static boolean salaryValidator(double _salary) throws ExceptionHandler {
        if (_salary < 0) {
            throw new ExceptionHandler("Salary can't be negative");
        }
        return true;
    }

    private static boolean bonusValidator(double _bonus) throws ExceptionHandler {
        if (_bonus < 0) {
            throw new ExceptionHandler("Bonus can't be negative");
        }
        return true;
    }

    private static boolean hoursValidator(int _hours) throws ExceptionHandler {
        if (_hours < 0) {
            throw new ExceptionHandler("Hours can't be negative");
        }
        return true;
    }

    private static boolean rateValidator(int _rate) throws ExceptionHandler {
        if (_rate < 0) {
            throw new ExceptionHandler("Rate can't be negative");
        }
        return true;
    }

    static <T> boolean isValid(FieldType type, T value) throws ExceptionHandler {
        return switch (type) {
            case ID -> idValidator((String) value);
            case NAME -> nameValidator((String) value);
            case SALARY -> salaryValidator((Double) value);
            case BONUS -> bonusValidator((Double) value);
            case HOURS -> hoursValidator((Integer) value);
            case RATE -> rateValidator((Integer) value);
            default -> throw new ExceptionHandler("Error");
        };
    }
}
