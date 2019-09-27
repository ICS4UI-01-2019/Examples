/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectExample;

/**
 *
 * @author lamon
 */
public class DeckOfCards {
    
    // instance variables
    private Card[] cards;
    private int numCards;
    
    // constructor
    public DeckOfCards(){
        // initialize array
        this.cards = new Card[52];
        this.numCards = 0;
        
        // create the cards
        for(int suit = 1; suit <= 4; suit++){
            for(int rank = Card.ACE; rank <= Card.KING; rank++){
                // make the card
                Card c = new Card(suit,rank);
                // put card in array
                this.cards[this.numCards] = c;
                // increase the card count
                this.numCards++;
            }
        }
    }
    
    // accessor methods
    public int numberOfCards(){
        return this.numCards;
    }
    
    public boolean isEmpty(){
        return this.numCards == 0;
    }
    
    // mutator methods
    public Card drawCard(){
        // save value 
        Card c = this.cards[this.numCards - 1];
        // clearing out the card
        this.cards[this.numCards - 1] = null;
        // decrease card count
        this.numCards--;
        
        return c;
    }
    
    public void addCard(Card c){
        this.cards[this.numCards] = c;
        this.numCards++;
    }
    
    public void shuffle(){
        // go through each spot
        for(int i = 0; i < this.numCards; i++){
            // random spot
            int spot = (int)(Math.random()*(51-i+1) + i);
            // swap cards
            Card temp = this.cards[i];
            this.cards[i] = this.cards[spot];
            this.cards[spot] = temp;
        }
    }
    
}
