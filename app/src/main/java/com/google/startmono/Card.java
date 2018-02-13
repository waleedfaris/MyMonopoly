package com.google.startmono;

import android.media.Image;



public class Card {

    private String color;
    private String street;
    private int Rent;
    private int With_One_House;
    private int With_Two_Houses;
    private int With_Three_Houses;
    private int With_Four_Houses;
    private int With_Hotel;
    private int Mortgage_Value;
    private int Hotel_Coast;
    private int House_Coast;
    private Image Card_View;
    private boolean Bought;
    private int BuyHome;
    private boolean HaveHome;
    private boolean HaveHotel;
    private int OwnerId;

    public Card(String color,String name,int rent,int oneH,int twoH,int threeH,int fourH,int hotel,int mortgage,int hotelC,int houseC)
    {
        this.color=color;
        this.street=name;
        this.Rent=rent;
        this.With_One_House=oneH;
        this.With_Two_Houses=twoH;
        this.With_Three_Houses=threeH;
        this.With_Four_Houses=fourH;
        this.With_Hotel=hotel;
        this.Mortgage_Value=mortgage;
        this.Hotel_Coast=hotelC;
        this.House_Coast=houseC;
        //this.Card_View=image;
        this.Bought=false;
        this.BuyHome=0;
        this.HaveHome=false;
        this.HaveHotel=false;
        this.OwnerId=0;

    }

    public int GetOwner()
    {
        return this.OwnerId;
    }

    public String GetCity()
    {
        return this.color;
    }

    public String GetName()
    {
        return this.street;
    }

    public int GetRent(){return this.Rent;}

    public int GetWith_One_House(){return this.With_One_House;}

    public int GetWith_Two_Houses(){return this.With_Two_Houses;}

    public int GetWith_Three_Houses(){return this.With_Three_Houses;}

    public int GetWith_Four_Houses(){return this.With_Four_Houses;}

    public int GetWith_Hotel(){return this.With_Hotel;}

    public int GetMortgage_Value(){return this.Mortgage_Value;}

    public int GetHotel_Coast(){return this.Hotel_Coast;}

    public int GetHouse_Coast(){return this.House_Coast;}

    public Image GetCard_View(){return this.Card_View;}

    public void SetBought (int OwnerID)
    {
        this.Bought=true;
        this.OwnerId=OwnerID;
    }

    public boolean GetBought() {return  this.Bought;}

    public int GetBuyHome() {return this.BuyHome;}

    public void BuyHome()
    {
        this.BuyHome=this.BuyHome+1;
        this.HaveHome=true;
    }

    public void BuyHotel()
    {
        this.HaveHotel=true;
    }

    public int I_Need_To_Pay()
    {

        if(this.HaveHotel==true)
        {
            return GetWith_Hotel();
        }
        else if (this.HaveHome==true)
        {
            switch (this.BuyHome)
            {
                case 1:
                {
                    return this.GetWith_One_House();
                }
                case 2:
                {
                    return this.GetWith_Two_Houses();
                }
                case 3:
                {
                    return this.GetWith_Three_Houses();
                }
                case 4:
                {
                    return this.GetWith_Four_Houses();
                }
            }
        }
        return GetRent();
    }
}
