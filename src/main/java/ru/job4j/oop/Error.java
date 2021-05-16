package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {
        active = true;
        status = 404;
        message = "Not found";
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Ошибка активна? " + active);
        System.out.println("Код ошибки: " + status);
        System.out.println("Сообщение ошибки: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error(false, 0, "All clear");
        error.printInfo();
    }
}