package ru.job4j.ex;

public class UserInvalidException extends UserNotFoundException {

    public UserInvalidException(String uie) {
        super(uie);
    }
}
