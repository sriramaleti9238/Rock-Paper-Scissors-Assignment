package com.game.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class RockPaperScissorsService {
	//to generate a random string
	public String generateRandomMove() {
        String[] moves = {"rock", "paper", "scissors"};
        Random random = new Random();
        int index = random.nextInt(moves.length);
        return moves[index];
    }

	// to determine who's the winner 
    public String determineWinner(String playerMove, String computerMove) {
        if (playerMove.equals(computerMove)) {
            return "Your Move : "+playerMove+ "\n"+"Computer Move : "+computerMove+"\n\n"+
                   "It is a tie";
        } 
        else if ((playerMove.equals("rock") && computerMove.equals("scissors"))
                || (playerMove.equals("scissors") && computerMove.equals("paper"))
                || (playerMove.equals("paper") && computerMove.equals("rock"))) {
            return "Your Move : "+playerMove+ "\n"+"Computer Move : "+computerMove+"\n\n"+
                "Player wins"+ " [ the "+ playerMove +" beats the "+computerMove+" ]";
        } else {
            return "Your Move : "+playerMove+ "\n"+"Computer Move : "+computerMove+"\n\n"+
               "Computer wins" + " [ the "+ computerMove +" beats the "+playerMove+" ]";
        }
    }

}
