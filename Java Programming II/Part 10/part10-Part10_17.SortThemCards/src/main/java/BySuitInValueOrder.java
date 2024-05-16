
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hugo
 */
public class BySuitInValueOrder implements Comparator<Card> {

    @Override
    public int compare(Card cardOne, Card cardTwo) {
        int resultValue = cardOne.getSuit().ordinal() - cardTwo.getSuit().ordinal();
        if (resultValue == 0) {
            return cardOne.getValue() - cardTwo.getValue();
        }
        
        return resultValue;
    }
}
