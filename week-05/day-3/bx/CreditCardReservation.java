package com.greenfox.bx;

import java.security.PublicKey;

/**
 * Created by Anna812 on 11/16/2016.
 */
public class CreditCardReservation implements Reservationy, CreditCardy {

    CreditCard creditCard;
    Reservation reservation;

    final static String ls = "01234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public CreditCardReservation(String dowBooking, String nameCardholder, String codeAccount) {
        this.reservation = new Reservation(dowBooking);
        this.creditCard = new CreditCard(nameCardholder, codeAccount);
    }

    public void setSumCVV(int sumCVV) {
        this.creditCard.setSumCVV(sumCVV);
    }

    public int getSumCVV() {
        return creditCard.sumCVV;
    }

    public void setNameCardholder(String nameCardholder) {
        this.creditCard.setNameCardholder(nameCardholder);
    }

    public String getNameCardholder() {
        return creditCard.nameCardholder;
    }

    public void setCodeAccount(String codeAccount) {
        this.creditCard.setCodeAccount(codeAccount);
    }

    public String getCodeAccount() {
        return creditCard.codeAccount;
    }

    public int cumeSumCVV(String codeAccount) {
        for (int i = 0; i < codeAccount.length(); i++){
            creditCard.sumCVV += Integer.parseInt(codeAccount.valueOf(codeAccount.charAt(i)));
        }
        return creditCard.sumCVV;
    }

    public boolean ValidCard(String codeAccount, int sumCVV) {
        return true;
    }

    public void setDowBooking(String dowBooking) {
        this.reservation.setDowBooking(dowBooking);
    }

    public String getDowBooking() {
        return reservation.dowBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.reservation.setCodeBooking(codeBooking);
    }

    public String getCodeBooking() {
        return reservation.codeBooking;
    }

    public boolean PlaceReserved(String dowBooking, String codeBooking) {
        return false;
    }

    public boolean PlaceCancelled(String dowBooking, String codeBooking) {
        return false;
    }

    static String randomZeroToZ(int len) {
        String out = "";
        for(int i= 0; i<len; i++) {
            out += ls.charAt((int) (Math.random() * 36));
        }
        return out;
    }

    public String toString() {
        return String.format("Booking# %s for %s paid by Name = %s CC# = %s CVV = %d", reservation.codeBooking,
                reservation.dowBooking, creditCard.getNameCardholder(), creditCard.getCodeAccount(), creditCard.getSumCVV());
    }
}
