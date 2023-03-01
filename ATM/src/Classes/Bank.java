package Classes;

import java.util.ArrayList;

public class Bank {

    private ArrayList accountList;

    public Bank() {
        accountList = new ArrayList<Account>();
    }

    private void addAccount(Account a){
        if(!accountList.contains(a)){
            accountList.add(a);
        }
    }
}
