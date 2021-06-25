package ru.job4j.bank;

import ru.job4j.map.Student;

import java.util.*;

/**
 * Класс описывает работу банковских переводов
 * @author Gleb Lipay
 * @version 1.0
 */
public class BankService {

    /**
     * Хранение задания осуществляется в коллекции типа Map
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет нового пользователя в систему
     * @param user пользователь
     */
    public void addUser(User user) {
            users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод находит пользователя по паспорту и, если такой
     * пользователь существует, создает ему банковский аккаунт
     * @param passport - паспорт
     * @param account - аккаунт
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> accounts = users.get(user.get());
        if (!accounts.contains(account)) {
            accounts.add(account);
        }
        }
    }

    /**
     * Метод находит пользователя по паспорту
     * @param passport - паспорт
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
               .filter(user -> user.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод находит пользователя по паспорту,
     * если такой пользоатель существует, то
     * ищет его по реквизитам
     * @param passport - паспорт
     * @param requisite - реквизиты
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> foundUser = findByPassport(passport);
        return foundUser.flatMap(value -> users.get(value)
                .stream()
                .filter(user -> user.getRequisite().equals(requisite))
                .findFirst());
    }

    /**
     * Метод находит двух пользователей по
     * реквизитам, получает баланс аккаунтов пользователей
     * и переводит деньги от первого пользователя - второму
     * @param srcPassport - паспорт пользователя, у которого
     *                    мы вычитаем денежные ср-ва
     * @param destPassport - паспорт пользователя, которому
     *                     мы перечисляем денежные ср-ва
     * @param srcRequisite - реквизиты по аналогии с паспортом
     * @param destRequisite - реквизиты по аналогии с паспортом
     * @param amount - перечисляемая сумма
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> srcAcc = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAcc = findByRequisite(destPassport, destRequisite);
        if (srcAcc.isPresent() && destAcc.isPresent() && srcAcc.get().getBalance() >= amount) {
            srcAcc.get().setBalance(srcAcc.get().getBalance() - amount);
            destAcc.get().setBalance(destAcc.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
