public class Main {
    public static void main(String[] args) {
        try {
            ControllerException.chek("Rtd", "1223", "1223");
            System.out.println("Регистрация прошла успешно");
        } catch (LoginException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Работа завершена!");
        }
    }
}