package com.RMP;
import java.util.*;


public class Tenant {
    int T_id;
    List<Transactions> lt=new ArrayList<>();
    List<AutoMobiles> lv=new ArrayList<>();
    List<Commodities> lc=new ArrayList<>();
    String name,guardian_name,ph,aph;//ph phone number, aph alternate phone number
    String job_id;//job id for tenant
    String adhar_no;
    String Perm_address;
    Date due_date;
    Date doj;//date of joining
    int occupants;//no.of people staying
    int amount;
    int adv_mon;

    public int getT_id() {
        return T_id;
    }

    public void setT_id(int t_id) {
        T_id = t_id;
    }

    public List<Transactions> getLt() {
        return lt;
    }

    public void setLt(List<Transactions> lt) {
        this.lt = lt;
    }

    public List<AutoMobiles> getLv() {
        return lv;
    }

    public void setLv(List<AutoMobiles> lv) {
        this.lv = lv;
    }

    public List<Commodities> getLc() {
        return lc;
    }

    public void setLc(List<Commodities> lc) {
        this.lc = lc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGuardian_name() {
        return guardian_name;
    }

    public void setGuardian_name(String guardian_name) {
        this.guardian_name = guardian_name;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public String getAph() {
        return aph;
    }

    public void setAph(String aph) {
        this.aph = aph;
    }

    public String getJob_id() {
        return job_id;
    }

    public void setJob_id(String job_id) {
        this.job_id = job_id;
    }

    public String getAdhar_no() {
        return adhar_no;
    }

    public void setAdhar_no(String adhar_no) {
        this.adhar_no = adhar_no;
    }

    public String getPerm_address() {
        return Perm_address;
    }

    public void setPerm_address(String perm_address) {
        Perm_address = perm_address;
    }

    public Date getDue_date() {
        return due_date;
    }

    public void setDue_date(Date due_date) {
        this.due_date = due_date;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public int getOccupants() {
        return occupants;
    }

    public void setOccupants(int occupants) {
        this.occupants = occupants;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAdv_mon() {
        return adv_mon;
    }

    public void setAdv_mon(int adv_mon) {
        this.adv_mon = adv_mon;
    }

}
