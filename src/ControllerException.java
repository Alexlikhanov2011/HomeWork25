import java.util.regex.Pattern;

public class ControllerException {
    private static final Pattern PATTERN = Pattern.compile("[a-zA-Z0-9_]+$");
    public static void chek(String login, String pasword, String repeatPassword) throws LoginException {
        if (login.length() > 20) {
            throw new LoginException("Логин не может содержать больше 20 символов!");
        }
        if (!PATTERN.matcher(login).matches()) {
            throw new LoginException("Логин содержит не допустимые символы");
        }
        if (pasword.length() > 20) {
            throw new PasswordException("Пароль не может содержать больше 20 символов!");
        }
        if (!pasword.equals(repeatPassword)) {
            throw new PasswordException("Пароли не совпадают!");
        }
        if (!PATTERN.matcher(pasword).matches()) {
            throw new PasswordException("Пароль содержит не допустимые символы");
        }
    }
}
