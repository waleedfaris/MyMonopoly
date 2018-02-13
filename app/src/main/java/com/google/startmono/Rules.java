package com.google.startmono;



public class Rules {


    private String Object;
    private String Equipment;
    private String Preparation;
    private String Banker;
    private String The_Bank;
    private String The_Play;
    private String Doubles;
    private String GO;
    private String Buying_Property;
    private String Paying_Rent;
    private String Chance_and_Community_Chest;
    private String Income_Tax;
    private String Jail;
    private String Free_Parking;
    private String Houses;
    private String Hotels;
    private String Building_Shortage;
    private String Selling_Trading_Property;
    private String Mortgages;
    private String Bankruptcy;
    private String Miscellaneous;


    public Rules()
    {
        Object="Object:\n  The object of the game is become the wealthiest player through buying, renting and selling\n" +
                "property. ";
        Equipment="Equipment:\n The equipment consists of a board, 2 dice, tokens, 32 houses and 12 hotels. There are\n" +
                "16 Chance and 16 Community Chest cards, a Title Deed card for each property (28 total) and play\n" +
                "money (7 denominations, 30+ copies of each).";
        Preparation="Preparation:\n  Place the board on a table and put the Chance and Community Chest cards shuffled\n" +
                "& face down on their allotted spaces on the board. Each player chooses one token to represent\n" +
                "him/her on his/her travels around the board. Each player is given $1,500 divided as follows: 2x\n" +
                "$500?s; 4x $100?s; 1x $50; 1x $20; 2x $10?s; 1x $5; and 5x $1?s. All remaining money and other\n" +
                "equipment go to the Bank. " ;
        Banker="Banker:\n  Select as Banker a player/volunteer who will also make a good Auctioneer. If the Banker\n" +
                "plays in the game, he/she must keep his/her personal funds separate from those of the Bank.";
        The_Bank="The Bank:\n Besides the Bank?s money, the Bank holds the Title Deed cards and houses and hotels\n" +
                "prior to purchase and use by the players. The Bank pays salaries ($200 for passing “GO”) and\n" +
                "bonuses. It sells and auctions properties and hands out their proper Title Deed cards; it sells\n" +
                "houses and hotels to the players and lends money when required on mortgages. The Bank collects\n" +
                "all taxes, fines, loans and interest, and the price of all properties, which it sells and auctions. The\n" +
                "Bank never “goes broke.” If the Bank runs out of money, it may issue as much more as may be\n" +
                "needed by merely writing on any ordinary piece of paper.";
        The_Play="The Play:\n Starting with the Banker, each player in turn throws the dice. The player with the highest\n" +
                "total starts the play. He/she places his/her token on the corner marked “GO,” throws the 2 dice and\n" +
                "moves his/her token in the direction of the arrow the number of spaces indicated by the dice. After\n" +
                "he/she has completed his/her play, the turn to play passes to the left. The tokens remain on the\n" +
                "spaces occupied and proceed from that point on the player?s next turn. Two or more tokens may\n" +
                "rest on the same space at the same time. According to the space, which his/her token reaches, a\n" +
                "player may be entitled to buy real estate or other properties - or be obliged to pay rent, pay taxes,\n" +
                "draw a Chance or Community Chest card, “Go to Jail,” etc. ";
        Doubles="Doubles:\n If a player throws doubles, he/she moves his/her token as usual, the sum of the two dice,\n" +
                "and is subject to any privileges or penalties pertaining to the space on which he/she lands.\n" +
                "Retaining the dice, he/she throws again and moves his/her token as before. If a player throws\n" +
                "doubles three times in succession, he/she moves his/her token immediately to the space marked\n" +
                "“In Jail” (see JAIL).";
        GO="GO Each time a player?s token lands on or passes over GO, whether by throw of the dice or by\n" +
                "drawing a card, the Banker pays the player a $200 salary. The $200 is paid only once each time\n" +
                "around the board. However, if a player passing GO on the throw of a dice lands 2 spaces beyond it\n" +
                "on Community Chest, or 7 spaces beyond it on Chance, and draws the “Advance to GO” card,\n" +
                "he/she collects $200 for passing GO the first time and another $200 for reaching it the second time\n" +
                "by instructions on the card.:\n";
        Buying_Property="Buying Property: \n Whenever a player lands on an unowned property, the player may buy that\n" +
                "property from the Bank at its printed price. The player receives the Title Deed card showing\n" +
                "ownership and places it face up in front of him/her. If he/she does not wish to buy the property, it is\n" +
                "immediately sold at auction by the Banker to the highest bidder. The buyer pays to the Bank the\n" +
                "amount of the bid in cash and receives the Title Deed card for that property. Any player, including\n" +
                "the one who declined the option of buying it at the printed price, may bid. Bidding may start at any\n" +
                "price.";
        Paying_Rent="Paying Rent:\n When a player lands on a property owned by another player, the owner collects rent\n" +
                "from the player in accordance with the list printed on the Title Deed card applying to it. If the\n" +
                "property is mortgaged, no rent can be collected. When a property is mortgaged, its Title Deed card\n" +
                "is placed face down in front of the owner. It is an advantage to hold all the Title Deed cards in a\n" +
                "color-group (i.e. Boardwalk and Park Place, or Connecticut, Vermont and Oriental Avenues)\n" +
                "because the owner may then charge double rent for unimproved properties in that color-group. This\n" +
                "rule applies to unmortgaged properties even if another property in that color-group is mortgaged. It\n" +
                "is even more of an advantage to have houses and hotels on properties because rents are much\n" +
                "higher than for unimproved properties. The owner may not collect his/her rent if he/she fails to ask\n" +
                "for it before the second player following throws the dice.";
        Chance_and_Community_Chest="Chance and Community Chest:\n  When a player lands on either of these spaces he/she takes the\n" +
                "top card from the deck indicated, follows the instruction, and returns the card face down to the\n" +
                "bottom of the deck. The “Get Out of Jail Free” card is held until used and then returned to the\n" +
                "bottom of the deck. If the player who draws does not wish to use it he/she may sell it, at any time,\n" +
                "to another player at a price agreeable to both.";
        Income_Tax="Income Tax:\n  When a player lands on “Income Tax” he/she must pay the $200 tax to the Bank";
        Jail="Jail:\n A player lands in jail when...(1) his/her token lands on the space marked “Go to Jail”; (2)\n" +
                "he/she draws a card marked “Go to Jail”; (3) he/she throws doubles three times in succession.\n" +
                "When a player is sent to Jail he/she cannot collect $200 salary in that move since, regardless of\n" +
                "where his/her token is on the board, he/she must move it directly into Jail. A player?s turn ends\n" +
                "when he/she is sent to Jail. If a player is not “sent to Jail” but in the ordinary course of play lands\n" +
                "on that space, he/she is “Just Visiting,” incurs no penalty, and moves ahead in the usual manner\n" +
                "on his/her next roll.\n" +
                "A player gets out of Jail by (1) throwing doubles on any of his/her next three turns, if he/she\n" +
                "succeeds in doing this he/she immediately moves forward the number of spaces shown by his/her\n" +
                "doubles throw, even though he/she had thrown doubles, he/she does not take another turn; (2)\n" +
                "using the “Get Out of Jail Free” card if he/she has it; (3) purchasing the “Get Out of Jail Free” card\n" +
                "from another player and playing it; (4) paying a fine of $50 before he/she rolls the dice on either of\n" +
                "his/her next two turns. If the player does not throw doubles by his/her third turn, he/she must pay\n" +
                "the $50 fine. He/she then gets out of Jail and immediately moves forward the number of spaces\n" +
                "shown by his/her throw. Even though he/she is in Jail, a player may still buy, sell, or mortgage\n" +
                "property, buy or sell houses and hotels, make trades, and collect rents.";
        Free_Parking="Free Parking :\n A player landing on this space does not receive any money, property or reward of\n" +
                "any kind. This is just a “free” resting place.";
        Houses="Houses:\n  When a player owns all the properties in a color-group, he/she may buy houses from the\n" +
                "Bank and erect them on those properties. If he/she buys one house, he/she may put it on any one\n" +
                "of those properties. The next house the player buys must be erected on one of the unimproved\n" +
                "properties of this or any other complete color-group he/she may own. The price the player must\n" +
                "pay the Bank for each house is shown on his/her Title Deed card for the property on which he/she\n" +
                "erects the house. The owner can still collect double rent from an opponent who lands on the\n" +
                "unimproved properties of his/her color-group.\n" +
                "Following the above rules, a player may buy and erect (at any time during his/her turn or in\n" +
                "between any turns) as many houses as his/her judgment and financial standing will allow. But the\n" +
                "player must build evenly, i.e. he/she cannot erect more than one house on any one property of any\n" +
                "color-group until he/she has built one house on every property of that group. He/she may then\n" +
                "begin on the second row of houses, and so on, up to a limit of four houses to a property. For\n" +
                "example, he/she cannot build three houses on one property if he/she has only one house on\n" +
                "another property of that group. As a player builds evenly, he/she must also break down evenly as\n" +
                "he/she sells houses back to the Bank (see SELLING PROPERTY)";
        Hotels="Hotels:\n When a player has four houses on each property of a complete color-group, he/she may\n" +
                "buy a hotel from the Bank and erect it on any property of the color-group. He/She returns the four\n" +
                "houses from that property to the Bank and pays the price for the hotel as shown on the Title Deed\n" +
                "card. Only one hotel may be erected on any one property.";
        Building_Shortage="Building Shortage:\n  When the Bank has no houses to sell, players wishing to build must wait for\n" +
                "another player to turn back or sell his/her houses to the Bank before building. If there are a limited\n" +
                "number of houses and hotels available, and two or more players wish to buy more than the Bank\n" +
                "has, the houses or hotels must be sold one at a time at auction to the highest bidder. Each\n" +
                "house/hotel auction begins at the price of the lowest priced house/hotel desired for purchase\n" +
                "among the bidding players.";
        Selling_Trading_Property="Selling/Trading Property :\n Unimproved properties, railroads and utilities (but not buildings) may be\n" +
                "sold or traded to any player as a private transaction for any amount that the owner can get.\n" +
                "However, no property can be sold to another player if buildings are standing on any properties of\n" +
                "that color-group. Any buildings so located must be sold back to the Bank before the owner can sell\n" +
                "or trade any property of that color-group. Houses and hotels may be sold back to the Bank at any\n" +
                "time for one-half the price paid for them. All houses on one color-group must be sold one by one,\n" +
                "evenly, in reverse of the manner in which they were erected. All hotels on one color-group may be\n" +
                "sold at once. Or they may be sold one house at a time (one hotel equals five houses), evenly, in\n" +
                "reverse of the manner in which they were erected.\n";
        Mortgages="Mortgages :\n Unimproved properties can be mortgaged through the Bank at any time. Before an\n" +
                "improved property can be mortgaged, all the buildings on all the properties of its color-group must\n" +
                "be sold back to the Bank at half price. The mortgage value is printed on each Title Deed card. No\n" +
                "rent can be collected on mortgaged properties or utilities, but rent may be collected on\n" +
                "unmortgaged properties in the same color group. In order to lift the mortgage, the owner must pay\n" +
                "the Bank the amount of the mortgage plus 10% interest. When all the properties of a color-group\n" +
                "are no longer mortgaged, the owner may begin to buy back houses at full price. The player who\n" +
                "mortgages property retains possession of it and no other player may secure it by lifting the\n" +
                "mortgage from the Bank. However, the owner may sell or trade this mortgaged property to another \n" +
                "player at any agreed price. The new owner may lift the mortgage at once, if he/she wishes, by\n" +
                "paying off the mortgage plus 10% interest to the Bank. If he/she does not lift the mortgage at once,\n" +
                "he/she must pay the bank 10% interest when he/she buys/receives the mortgaged property, and if\n" +
                "he/she lifts the mortgage later he/she must pay the Bank an additional 10% interest as well as the\n" +
                "amount of the mortgage.";
        Bankruptcy="Bankruptcy :\n A player is bankrupt when he/she owes more than he/she can pay either to another\n" +
                "player or to the Bank. If his/her debt is to another player, he/she must turn over to that player all\n" +
                "that he/she has of value and retire from the game. In making this settlement, if he/she owns\n" +
                "houses or hotels, he/she must return these to the Bank in exchange for money to the extent of onehalf\n" +
                "the amount paid for them and this cash is given to the creditor. If he/she has mortgaged\n" +
                "property, he/she also turns his/her property over to this creditor but the new owner must at once\n" +
                "pay the Bank the amount of interest on the loan, which is 10% of the value of the property. After\n" +
                "the new owner does this, he/she may, at his/her option, pay the principal or hold the property until\n" +
                "some later turn at which time he/she may lift the mortgage. If he/she holds property in this way until\n" +
                "a later turn, he/she must pay the interest again when he/she lifts the mortgage.\n" +
                "Should a player owe the Bank, instead of another player, more than he/she can pay (because of\n" +
                "taxes or penalties) even by selling his/her buildings, mortgaging property, or selling/trading with\n" +
                "other players, then he/she must turn over all his/her assets to the Bank. In this case, the Bank\n" +
                "immediately sells by auction all property so taken, except buildings. A bankrupt player must\n" +
                "immediately retire from the game. The last player left in the game wins.";
        Miscellaneous="Miscellaneous:\n  Money can only be loaned to a player by the Bank and then only by mortgaging\n" +
                "property. No player may borrow from or lend money to another player.";
    }

    public String GetRuleByID(int ID )
    {
        switch (ID)
        {
            case 1 : {
                return this.Object;
            }
            case 2 : {
                return this.Equipment;
            }
            case 3 : {
                return this.Preparation;
            }
            case 4 : {
                return this.Banker;
            }
            case 5 : {
                return this.The_Bank;
            }
            case 6 : {
                return this.The_Play;
            }
            case 7 :{
                return this.Doubles;
            }
            case 8 : {
                return this.GO;
            }
            case 9 :{
                return this.Buying_Property;
            }
            case 10 :{
                return this.Paying_Rent;
            }
            case 11 : {
                return this.Chance_and_Community_Chest;
            }
            case 12 : {
                return this.Income_Tax;
            }
            case 13 :{
                return this.Jail;
            }
            case 14 : {
                return this.Free_Parking;
            }
            case 15 : {
                return this.Houses;
            }
            case 16 : {
                return this.Hotels;
            }
            case 17 : {
                return this.Building_Shortage;
            }
            case 18 :{
                return this.Selling_Trading_Property;
            }
            case 19 : {
                return this.Mortgages;
            }
            case 20 : {
                return this.Bankruptcy;
            }
            case 21 : {
                return this.Miscellaneous;
            }
        }//end switch
        return ".";
    }// end function


    public String GetRuleByNaemRule(String name )
    {
        switch (name)
        {
            case "Object" : {
                return this.Object;
            }
            case "Equipment" : {
                return this.Equipment;
            }
            case "Preparation" : {
                return this.Preparation;
            }
            case "Banker" : {
                return this.Banker;
            }
            case "The bank" : {
                return this.The_Bank;
            }
            case "The play" : {
                return this.The_Play;
            }
            case "Doubles" :{
                return this.Doubles;
            }
            case "GO" : {
                return this.GO;
            }
            case "Buying property " :{
                return this.Buying_Property;
            }
            case "Paying rent" :{
                return this.Paying_Rent;
            }
            case "Chance and community chest" : {
                return this.Chance_and_Community_Chest;
            }
            case "Income tax" : {
                return this.Income_Tax;
            }
            case "Jail" :{
                return this.Jail;
            }
            case "Free parking" : {
                return this.Free_Parking;
            }
            case "Houses" : {
                return this.Houses;
            }
            case "Hotels" : {
                return this.Hotels;
            }
            case "Building shortage" : {
                return this.Building_Shortage;
            }
            case "Selling trading property" :{
                return this.Selling_Trading_Property;
            }
            case "Mortgages" : {
                return this.Mortgages;
            }
            case "Bankruptcy" : {
                return this.Bankruptcy;
            }
            case "Miscellaneous" : {
                return this.Miscellaneous;
            }
        }//end switch
        return ".";
    }// end function


    public String GetAllRules()
    {
        String st="";
        for(int i = 0 ; i < 21 ; i++)
        {
            st=st+ "\n" +this.GetRuleByID(i+1);
        }
        return st ;
    }// end function



}
