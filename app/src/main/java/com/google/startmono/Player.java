package com.google.startmono;

import java.util.ArrayList;
import java.util.List;



public class Player {


    private String playername;
    private int id;
    private int Money;
    private List<Card> Cards;
    private List<Company> Companys;
   private List<Surprise> SavedCard;

    public Player(String N, int I,int money)
    {
        this.playername=N;
        this.id=I;
        this.Money=money;
        this.Cards=new ArrayList<Card> ();
        this.Companys=new ArrayList<Company>();
        this.SavedCard=new ArrayList<Surprise>();
    }

    public void SetMoney(int money)
    {
        this.Money=this.Money+money;
    }


    public String GetN()
    {
        return this.playername;
    }

    public int GetID()
    {
        return this.id;
    }

    public int GetMoney() {return this.Money;}

    public ArrayList<Card> GetCards()
    {
        return (ArrayList<Card>) this.Cards;
    }

    public ArrayList<Surprise> GetSavedCard()
    {
        return (ArrayList<Surprise>) this.SavedCard;
    }

    public void SetCard(Card c)
    {
        this.Cards.add(c);
    }

    public void SetSavedCard(Surprise s)
    {
        this.SavedCard.add(s);
    }

    public void SetCompany(Company company)
    {
        this.Companys.add(company);
    }

    public boolean Have_This_Card(Card c)
    {
        for(int i=0;i<this.Cards.size();i++)
        {
            if(c.GetOwner()==this.id)
            {
                return true;
            }
        }
        return false;
    }


    public void SetN(String Name){
        this.playername=Name;
    }

}
