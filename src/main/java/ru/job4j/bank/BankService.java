package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу банковских переводов
 * @author Gleb Lipay
 * @version 1.0
 */
public class BankService {

    /**
     * Хранение задания осуществляется в коллекции типа Map
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет нового пользователя в систему
     * @param user пользователь
     */
    public void addUser(User user) {
        if (!users.containsKey(user)) {
            users.put(user, new ArrayList<Account>());
        }
    }

    /**
     * Метод находит пользователя по паспорту и, если такой
     * пользователь существует, создает ему банковский аккаунт
     * @param passport - паспорт
     * @param account - аккаунт
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
        if (!accounts.contains(account)) {
            accounts.add(account);
        }
        }
    }

    /**
     * Метод находит пользователя по паспорту
     * @param passport - паспорт
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод находит пользователя по паспорту,
     * если такой пользоатель существует, то
     * ищет его по реквизитам
     * @param passport - паспорт
     * @param requisite - реквизиты
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            for (Account account : users.get(user)) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
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
        Account srcAcc = findByRequisite(srcPassport, srcRequisite);
        Account destAcc = findByRequisite(destPassport, destRequisite);
        if (srcAcc != null && destAcc != null && srcAcc.getBalance() >= amount) {
            srcAcc.setBalance(srcAcc.getBalance() - amount);
            destAcc.setBalance(destAcc.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
