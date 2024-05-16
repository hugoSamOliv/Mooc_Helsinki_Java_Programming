
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hugo
 */
public class Hand implements Comparable<Hand> {
    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.cards.add(card);
    }
    
    public void print() {
        Iterator<Card> iterator = cards.iterator();
        
        while (iterator.hasNext()) {
            Card card = iterator.next();
            System.out.println(card);
        }
    }
    
    public void sort() {
        Collections.sort(this.cards);
    }

    @Override
    public int compareTo(Hand rivalHand) {
        int handValue = this.cards.stream()
                        .map(card -> card.getValue())
                        .reduce(0, (previousValue, nextValue) -> previousValue + nextValue);
        
        int rivalHandValue = rivalHand.cards.stream()
                                .map(card -> card.getValue())   
                                .reduce(0, (previousValue, nextValue) -> previousValue + nextValue);
        
        return handValue - rivalHandValue;
    }
    
    public void sortBySuit() {
        Collections.sort(this.cards, new BySuitInValueOrder());
    }
}
