package com.google.startmono;



public class Company {

    private String name ; // the type of the company
    private int price ; // the price pf the card

    public Company (String name,int Money)
    {
        this.price=Money;
        this.name=name;
    }

    public String getname()
    {
        return this.name;
    }

    public int getprice() {
        return this.price;
    }


}// end class
