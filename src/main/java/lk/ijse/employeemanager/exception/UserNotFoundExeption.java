package lk.ijse.employeemanager.exception;

public class UserNotFoundExeption extends RuntimeException {
    public UserNotFoundExeption(String message) {
        super(message);
    }
}
