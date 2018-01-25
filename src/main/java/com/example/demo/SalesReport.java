package com.example.demo;

import java.util.Scanner;

public class SalesReport {
    public String salesReporting(){
        Integer customer_number;
        String customer_name;
        Double sales_amount;
        Integer tax_code;
        Double sales_tax;
        Double total_tax_due;
        Double total_amount_due;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the customer's number");
        customer_number = keyboard.nextInt();
        System.out.println("What is the customer's name");
        keyboard.nextLine();
        customer_name = keyboard.nextLine();
        System.out.println("How much did the customer spend");
        sales_amount = keyboard.nextDouble();
        System.out.println("What is the applicable tax code (0, 1, or 2)");
        tax_code = keyboard.nextInt();

        if (tax_code == 0) {
            sales_tax = 0.00;
        }
        else if (tax_code == 1) {
            sales_tax = .03;
        }
        else{
            sales_tax = .05;
        }
        total_tax_due = sales_amount * sales_tax;
        total_amount_due = sales_amount + total_tax_due;
        String result = ("Sales Report\n" + "Customer number is " +customer_number + "\nCustomer name is " + customer_name
                + "\nPrice without tax is $" + sales_amount + "\nSales tax is $"
                + total_tax_due + "\nTotal Amount due is $" + total_amount_due);
        String result_web = ("Sales Report<br/>" + "Customer number is " +customer_number + "<br/>Customer name is " + customer_name
                + "<br/>Price without tax is $" + sales_amount + "<br/>Sales tax is $"
                + total_tax_due + "<br/>Total Amount due is $" + total_amount_due);
        System.out.println(result);
        return result_web;
    }
}
