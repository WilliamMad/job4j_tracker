package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (int index = 0; index < users.length; index++) {
            if (login.equals(users[index].getUsername())) {
                return users[index];
            }
        }
        throw new UserNotFoundException("User not found.");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if ((!user.isValid()) || (user.getUsername().length() < 3)) {
            throw new UserInvalidException("User is not valid");
        }
        return true;
    }

    public static void main(String[] args) throws UserNotFoundException {
            User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
                if (validate(user)) {
                    System.out.println("This user has an access");
                }
            } catch (UserInvalidException uie) {
            System.out.println("Invalid user.");
            } catch (UserNotFoundException unf) {
            System.out.println("User not found");
            }
        }
    }

