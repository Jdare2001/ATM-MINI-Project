package Classes;

import Exceptions.IncorrectPasswordException;
import Exceptions.InsufficientBalanceException;

public class Account {
    private String id;
    private String password;
    private int balance;
    private int overdraftAllowed = 0;

    public Account(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public int getBalance(String p) throws IncorrectPasswordException {
        if(passwordCheck(p)) {
            return balance;
        }
        throw new IncorrectPasswordException();
    }

    public int OverDrawnAllowedAmount(String p) throws IncorrectPasswordException {
        if(passwordCheck(p)) {
            return overdraftAllowed;
        }
        throw new IncorrectPasswordException();
    }
    public int depositMoney(String p, int depositAmount){
        if(passwordCheck(p)){
            balance = balance + depositAmount;
            return balance;
        }
        throw new IllegalStateException("incorrect password");
    }
    public int withdrawMoney(String p, int withdrawAmount) throws IncorrectPasswordException, InsufficientBalanceException {
        if(passwordCheck(p)){
            if((balance  + overdraftAllowed) - withdrawAmount > 0 ){
                balance = balance - withdrawAmount;
                return balance;
            }
            else{
                throw new InsufficientBalanceException();
            }
        }
       throw new IncorrectPasswordException();
    }
    private boolean passwordCheck(String p){
        boolean returnedStatement = false;
        if(p.equals(password)){
            returnedStatement = true;
        }
        return returnedStatement;

    }
}
