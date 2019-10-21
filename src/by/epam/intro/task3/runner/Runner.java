package by.epam.intro.task3.runner;

import by.epam.intro.task3.bean.Account;
import by.epam.intro.task3.bean.Client;
import by.epam.intro.task3.logic.ClientLogic;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {
        Account accountFirst = new Account("777",100,true);
        Account accountSecond = new Account("888",-100,true);
        Account accountThird = new Account("999",66,true);
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(accountFirst);
        accounts.add(accountSecond);
        accounts.add(accountThird);
        Client client = new Client("Pablo",accounts);
        ClientLogic clientLogic=new ClientLogic();
        client=clientLogic.sortAscendingBalance(client);
        System.out.println("balance negative = " + clientLogic.negativeAccounts(client));
        System.out.println("balance positive = " + clientLogic.positiveAccounts(client));
        System.out.println("All balance = " + clientLogic.AllAccounts(client));
        System.out.println(clientLogic.findAccount(client,"888").toString());
    }
}