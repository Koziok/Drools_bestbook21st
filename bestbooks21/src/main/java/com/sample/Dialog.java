package com.sample;

public class Dialog{
    public String pytanie;
    public String odpowiedz;
    
    public Dialog() {
    }

    public Dialog(String pytanie, String odpowiedz) {
        this.pytanie = pytanie;
        this.odpowiedz = odpowiedz;
    }

    public String getPytanie() {
        return pytanie;
    }

    public String getOdpowiedz() {
        return odpowiedz;
    }

    public void setPytanie(String pytanie) {
        this.pytanie = pytanie;
    }
    
    public void setOdpowiedz(String odpowiedz) {
        this.odpowiedz = odpowiedz;
    }
}