package com.greenfox.bx;

/**
 * Created by Anna812 on 11/16/2016.
 */
public class Reservation implements Reservationy{

    private String dowBooking;
    private String codeBooking;
    final static String ls = "01234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public Reservation(String dowBooking){
        this.dowBooking = dowBooking;
        this.codeBooking = randomZeroToZ(8);
    }

    public void setDowBooking(String dowBooking) {
        this.dowBooking = dowBooking;
    }

    public String getDowBooking() {
        return dowBooking;
    }

    public void setCodeBooking(String codeBooking) {
       this.codeBooking = codeBooking;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public boolean PlaceReserved(String dowBooking, String codeBooking) {
        return true;
    }

    public boolean PlaceCancelled(String dowBooking, String codeBooking) {
        return true;
    }

    public String toString() {
        return String.format("Booking# %s for %s", codeBooking, dowBooking);
    }

    static String randomZeroToZ(int len) {
        String out = "";
        for(int i= 0; i<len; i++) {
            out += ls.charAt((int) (Math.random() * 36));
        }
        return out;
    }
}
