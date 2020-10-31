package com.brad.exercises.chapter3_selections;

import java.util.Random;

public class Exercise24_PickACard {

    private static Random rand = new Random();

    public static void main(String[] args) {

        System.out.printf("Your card is %s of %s", randomRank(), randomSuit());
    }

    private static String randomSuit() {

        String suit = "";
        int randomSuitNumber = rand.nextInt(4) + 1;

        switch(randomSuitNumber) {
            case 1:
                suit += "Clubs";
                break;
            case 2:
                suit += "Diamonds";
                break;
            case 3:
                suit += "Hearts";
                break;
            case 4:
                suit += "Spades";
                break;
            default:
                suit += "Suit Error";
                break;
        }

        return suit;
    }

    private static String randomRank() {

        int randomRankNumber = rand.nextInt(13) + 1;
        String rank = "";

        switch(randomRankNumber) {
            case 1:
                rank += "Ace";
                break;
            case 11:
                rank += "Jack";
                break;
            case 12:
                rank += "Queen";
                break;
            case 13:
                rank += "King";
                break;
            default:
                rank += Integer.toString(randomRankNumber);
                break;
        }

        return rank;
    }
}
