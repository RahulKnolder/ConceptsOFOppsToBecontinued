




/*You are building a data analysis tool that analyzes the performance of a company's sales team.
 The tool needs to calculate the total sales made by each salesperson in a given period (e.g. month, quarter, year).
  How would you use Java aggregations to calculate the total sales made by each salesperson?*/

package Agrigation_Part_One_Task5;


import java.util.Scanner;

public class CalculatSale {

    //Calculating the total sales
    public void CalculatTotalSale(int[][] array, int time, String name) {
        int calculate_sales = 0;
        for (int index1 = 0; index1 < time; index1++) {
            int multiple = 1;
            for (int index2 = 0; index2 < 2; index2++) {

                multiple = multiple * array[index1][index2];
            }
            calculate_sales = calculate_sales + multiple;
        }
        System.out.println("Totla sales  of " + name + " in " + time + " is " + calculate_sales);
    }

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("enter name ");

        String name = read.nextLine();
        System.out.println("enter the time in month");
        int time = read.nextInt();
        SalesInformation salesobject = new SalesInformation(name, time);

        //getting the time and name from the SalesInformation object
        int timeOfSales = salesobject.getTime();
        String nameOfSalesPerson = salesobject.getSalespersonName();

        //declaring array to sote the uni and the sale details
        int arr[][] = new int[timeOfSales][2];


        // inter the unit sales and per unit slaes to calculate the total sales
        System.out.println("enter " + time + " months  unit sale and per unit sale");
        for (int index = 0; index < timeOfSales; index++) {
            for (int index2 = 0; index2 < 2; index2++) {
                arr[index][index2] = read.nextInt();
            }
        }



        //aggregations behaviour
        // here we are creating object of SalesInformation class and using it in CalculatSale class which folows the aggregations rule;
        CalculatSale calculateOject = new CalculatSale();
        calculateOject.CalculatTotalSale(arr, timeOfSales, nameOfSalesPerson);
    }
}
