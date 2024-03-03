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
    }

    public int getPrice(){
        this.price = 0;
        this.price += isVeg?  300: 400;
        if(extraCheese){
            this.price+=80;
        }
        if(extraToppings){
            int toppingsPrice = isVeg? 70: 120;
            this.price+= toppingsPrice;
        }
        if(takeaway){
            this.price+=20;
        }
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

        this.bill = "Base Price Of The Pizza: "+ (isVeg? 300: 400) + "\n";
        if(extraCheese){
            this.bill += "Extra Cheese Added: 80\n";
        }
        if(extraToppings){
            this.bill += "Extra Toppings Added: "+(isVeg? 70: 120)+"\n";
        }
        if(takeaway){
            this.bill+="Paperbag Added: 20\n";
        }
        this.bill+="Total Price: "+this.getPrice()+"\n";
        return this.bill;
    }
}
