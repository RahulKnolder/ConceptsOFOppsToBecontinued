package Agrigation_Part_One_Task5;

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

    private int time;


    public SalesInformation(String salespersonName, int time) {
        this.salespersonName = salespersonName;
        this.time = time;

    }


}
