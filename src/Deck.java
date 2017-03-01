package src;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vajni on 2017.03.01..
 */
public abstract class Deck {

    List<Card> deckList = new ArrayList();

    public void addCard(Card card){
        deckList.add(card);
    }

    @Override
    public String toString() {
        return "Deck{" +
                "deckList=" + deckList +
                '}';
    }
}
