package by.epam.intro.task3.logic;

import by.epam.intro.task3.bean.Account;

public class AccountLogic {
    public Boolean blockAccount (Account account) {
        if (account.getIsOpen()) {
            account.setIsOpen(false);
        }
        return true;
    }
}
