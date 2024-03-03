package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean extraCheese = false;
    private boolean extraToppings = false;
    private boolean takeaway = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.price = isVeg?  400: 500;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        extraCheese = true;
    }

    public void addExtraToppings(){
        // your code goes here
        extraToppings = true;
    }

    public void addTakeaway(){
        // your code goes here
        takeaway = true;
    }

    public String getBill(){
        // your code goes here
        this.bill = "Base Price Of The Pizza: "+this.price + "\n";
        if(extraCheese){
            this.price+=80;
            this.bill += "Extra Cheese Added: 80\n";
        }
        if(extraToppings){
            int toppingsPrice = isVeg? 70: 120;
            this.price+= toppingsPrice;
            this.bill += "Extra Toppings Added: "+toppingsPrice+"\n";
        }
        if(takeaway){
            this.price+=20;
            this.bill+="Paperbag Added: 20\n";
        }
        this.bill+="Total Price: "+this.price+"\n";
        return this.bill;
    }
}
