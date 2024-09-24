package core.basesyntax;

public class PasswordValidator {
    public void validate(String password, String repeatPassword)
            throws PasswordValidationException {
        //write your code here
        if (password == null || repeatPassword == null) {
            throw new PasswordValidationException("Passwords cannot be null");
        }

        if (!(password.equals(repeatPassword)) || password.length() < 10) {
            throw new PasswordValidationException("Wrong passwords");
        }
    }
}
