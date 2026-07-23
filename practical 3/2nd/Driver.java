import java.util.Objects;

class Card
{
    private String rank;
    private String suit;

    public Card(String rank, String suit)
    {
        this.rank=rank;
        this.suit=suit;
    }

    //toString()
    @Override
    public String toString()
    {
        return rank +  "of" + suit;
    }
    //equals
    @Override
    public boolean equals(Object obj)
    {
     
     if(this == obj)
        return true;

     if(obj == null || getClass!= obj.getClass())
        return false;

     Card c =(Card) obj;

     return rank.equals(c.rank) && suit.equals(c.suit);
    }
    //hashCode()
    @Override
    public int hashCode()
    {
        return Object.hash(rank, suit);
    }
}

public class Driver {
    
    public static void main(String[] args)
    {
     Card[] cards = new Card[5]; 
     
     Card[] input =
    {
     new Card("Ace","SPades"),
     new Card("King","Heart"),
     new Card("Queen","Diamonds"),
     new Card("Ace","SPades"),
     new Card("Jack","Clubs")


    };

    int count =0;

    for(int i=0;i<input.length;i++)
    {
     boolean duplicate = false;

     for(int j=0;j <count;j++)
     {
     if(input[i].equals(cards[j]))
     {
        duplicate =true;
        System.out.println("Duplicate found:"+input[i]);
        break;
     }
    }
    if(!duplicate)
    {
        cards[count] =input[i];
        count++;
    }
}
}
 }
    
