package Agrigation_2;

import java.util.Date;

public class SalesInformation {
    public String getSalespersonName() {
        return salespersonName;
    }

    public void setSalespersonName(String salespersonName) {
        this.salespersonName = salespersonName;
    }


    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }




    private String salespersonName;

    private int  time;



    public SalesInformation(String salespersonName,  int time) {
        this.salespersonName = salespersonName;
        this.time = time;

    }



}
