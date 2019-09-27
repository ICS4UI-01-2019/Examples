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
public class TestCard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card c1 = new Card(Card.HEARTS, 5);
        Card c2 = new Card(Card.CLUBS, Card.KING);
        
        System.out.println("Card 1: " + c1.getRank());
        System.out.println("Card 2: " + c2.getRank());
        
        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();
        
        Card c3 = deck.drawCard();
        System.out.println("Suit: " + c3.getSuit());
        System.out.println("Rank: " + c3.getRank());
        
        c3 = deck.drawCard();
        System.out.println("Suit: " + c3.getSuit());
        System.out.println("Rank: " + c3.getRank());
    }
    
}
