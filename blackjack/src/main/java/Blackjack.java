import java.util.*;
public class Blackjack {

    public int parseCard(String card) { //Think of a static way to do this
        Map<String, Integer> cardValue = new HashMap<>();
        cardValue.put("ace", 11);
        cardValue.put("king", 10);
        cardValue.put("queen", 10);
        cardValue.put("jack", 10);
        cardValue.put("ten", 10);
        cardValue.put("nine", 9);
        cardValue.put("eight", 8);
        cardValue.put("seven", 7);
        cardValue.put("six", 6);
        cardValue.put("five", 5);
        cardValue.put("four", 4);
        cardValue.put("three", 3);
        cardValue.put("two", 2);
        cardValue.put("other", 0);
        return cardValue.get(card);
    }

    public boolean isBlackjack(String card1, String card2) {
        if(parseCard(card1) + parseCard(card2) == 21) {
            return true;
        }
        else {
            return false;
        }
    }

    public String largeHand(boolean isBlackjack, int dealerScore, int handScore) {
        if(handScore==22) { //2 Aces
            return "P";
        }
        if(isBlackjack) {
            if(dealerScore < 10) {
                return "W";
            }
            else {
                return "S";
            }
        }
        return null;
    }

    public String smallHand(int handScore, int dealerScore) {
        if(handScore >= 17) {
            return "S";
        }
        else if(handScore <= 11) {
            return "H";
        }
        else {
            if(dealerScore >= 7) {
                return "H";
            }
            else {
                return "S";
            } 
        }
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore, handScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
