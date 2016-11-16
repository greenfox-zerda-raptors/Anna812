package com.greenfox.bx;

/**
 * Created by Anna812 on 11/16/2016.
 */
public class CreditCard implements CreditCardy{

    public String nameCardholder;
    public String codeAccount;
    public int sumCVV;

    public CreditCard(String nameCardholder, String codeAccount) {
        this.nameCardholder = nameCardholder;
        this.codeAccount = codeAccount;
        this.sumCVV = cumeSumCVV(codeAccount);
    }

    public void setSumCVV(int sumCVV) {
        this.sumCVV = sumCVV;
    }

    public int getSumCVV() {
        return sumCVV;
    }

    public void setNameCardholder(String nameCardholder) {
        this.nameCardholder = nameCardholder;
    }

    public String getNameCardholder() {
        return nameCardholder;
    }

    public void setCodeAccount(String codeAccount) {
        this.codeAccount = codeAccount;
    }

    public String getCodeAccount() {
        return codeAccount;
    }

    public int cumeSumCVV(String codeAccount) {
        for (int i = 0; i < codeAccount.length(); i++){
            sumCVV += Integer.parseInt(codeAccount.valueOf(codeAccount.charAt(i)));
        }
        return sumCVV;
    }

    public boolean ValidCard(String codeAccount, int sumCVV) {
        return true;
    }

    public String toString() {
        return String.format("Name = %s CC# = %s CVV = %d", nameCardholder, codeAccount, sumCVV);
    }
}
