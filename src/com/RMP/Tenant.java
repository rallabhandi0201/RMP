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

}
