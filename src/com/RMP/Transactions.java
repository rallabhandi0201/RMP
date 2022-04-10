package com.RMP;

import java.util.Date;

public class Transactions {
    String mot;//mot--ModeofTransfer
    Date date;
    double amount;
    int due,tr_id;

    public Transactions(String mot,Date date, double amount, int due, int tr_id) {
        this.mot = mot;
        this.date=date;
        this.amount = amount;
        this.due = due;
        this.tr_id = tr_id;
    }
}
