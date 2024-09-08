/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.supermarketbillingsystem;

/**
 *
 * @author Lenovo
 */
import java.util.*;
class Product{
    int sr_no;
    int ID;
    String name;
    int price;

    public Product(int sr_no,int ID,String name,int price){
        this.sr_no=sr_no;
        this.ID=ID;
        this.name=name;  
        this.price=price;
    }
    public int getsrno(){
        return sr_no;
    }
    
    public int getID(){
        return ID;
        }
    
    public String getname(){
        return name;
        }
    
    public int getprice(){
        return price;
        }}
    
    class Bill{
        Product product;
        int quantity;
        public Bill(Product product, int quantity){
            this.product=product;
            this.quantity=quantity;
        }
public double getbill(){
    return product.getprice()*quantity;
}}
    
public class Supermarketbillingsystem{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Product products[]={
            new Product(1,12101, "Milk", 33),
            new Product(2,12102, "Bread", 25),
            new Product(3,12103, "Eggs", 6),
            new Product(4,12104, "Chips", 20),
            new Product(5,12105, "Cakes", 100),
            new Product(6,12106, "Shampoo", 500),
            new Product(7,12107, "Conditioner", 300),
            new Product(8,12123, "Hair Oil", 350),
            new Product(9,12124, "Cooking Oil", 200),
            new Product(10,12110, "Face Cream", 700),
            new Product(11,12111, "Biscuit", 30),
            new Product(12,12112, "Nail Paint", 200),
            new Product(13,12113, "Lipstick", 400),
            new Product(14,12114, "Key Chain", 20),
            new Product(15,12115, "Coke", 40),
            new Product(16,12116, "Juice", 20),
            new Product(17,12117, "Namkeen", 150),
            new Product(18,12125, "Salt", 40),
            new Product(19,12126, "Pepper", 40),
            new Product(20,12120, "Ketchup", 250),
        };
        
        System.out.println("Available products at store:");
        for(Product product: products){
            System.out.println(product.getsrno()+". "+product.getID()+"__"+product.getname()+"/Rs."+product.getprice());
        }
        
        Bill[] bills = new Bill[products.length];
        int totalbill=0;
        
    while(true){
       
        System.out.println("Press F if you want to print the Receipt or press C if you want to add more products: ");
         String x=s.nextLine();
        if(x.equals("c") || x.equals("C")){
            
            
         System.out.println("Enter the Serial no. of the Product: ");
         int n = s.nextInt();
         s.nextLine(); 
         
         Product selectedProduct = null;
                for (Product product : products) {
                    if (product.getsrno() == n) {
                        selectedProduct = product;
                        break;
                    }
                }

                if (selectedProduct == null) {
                    System.out.println("No product available with this serial number.");
                    continue;
                }

            
             System.out.println("Enter quantity: ");
              int quantity = s.nextInt();
             s.nextLine(); 
            
              bills[totalbill++] = new Bill(selectedProduct,quantity);  
         }
        
        else if(x.equals("f") || x.equals("F")){
            
   System.out.println("Customer name: ");
   String customername=s.nextLine();
   System.out.println("Customer Phone no.: ");
   int customerphone=s.nextInt();
   double total=0;
   System.out.println("\n-------------------------------------------------------- \n                       RECIPT \n--------------------------------------------------------");
   System.out.println("               Pink Basket Multi store \n                    32 Civil Lines \n                Mathura,Uttar Pradesh \n               Phone: (+91) 9219603284");
   System.out.println();
   System.out.println("Date:2024-08-25                               Time:15:30");
   System.out.println("Customer name: "+customername+"      Customer Phone no.: "+customerphone);
   System.out.println();
    System.out.println("-------------------------------------------------------- ");
   System.out.println("Item               Qty          Price        Total");
      System.out.println("-------------------------------------------------------- "); 
      
      for(int i=0; i<totalbill; i++){
      System.out.println(bills[i].product.getname()+"        "+bills[i].quantity+"           "+bills[i].product.getprice()+"         "+bills[i].getbill()+" ");
      total+=bills[i].getbill();
      }
      
      System.out.println();
      System.out.println();
      
      System.out.println("Subtotal:                                  Rs."+String.format("%.2f",total));
      System.out.println("Sales Tax (6%):                            Rs."+String.format("%.2f",total*0.06));
      System.out.println("GST (8%):                                  Rs."+String.format("%.2f",total*0.08));
        System.out.println("--------------------------------------------------------");
        double tb = total+(total*0.06)+(total*0.08);
        System.out.println();
      System.out.println("Total Bill:                                Rs."+String.format("%.2f",tb));
        System.out.println( );
        System.out.println("--------------------------------------------------------");
        System.out.println("Thank you for shopping with us! \nVisit us online at www.pinkbasket.in ");
        System.out.println();
        System.out.println("Return policy: Receipts required for all returns \nSurvey: Tell us about uour experience at www.pinkbasketfeedback.in" );
       break; 
        }
        else{
            System.out.println("ERROR !!!");
            break;
        }}}}
