package com.game.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.game.service.RockPaperScissorsService;

@RestController
@RequestMapping("api/v1")
public class RockPaperScissorsController {
	
	@Autowired
	private RockPaperScissorsService service;

	@PostMapping("/play")
    public ResponseEntity<String> playGame(@RequestParam("move") String move) {
	
        // Check if the move is valid
        if (move.toLowerCase().equals("rock")||move.toLowerCase().equals("paper") || move.toLowerCase().equals("scissors")) {
        	String playerMove=move.toLowerCase();
        	String computerMove = service.generateRandomMove();
            String result = service.determineWinner(playerMove, computerMove);
            return ResponseEntity.status(HttpStatus.OK).body(result);
        } else {
            // Invalid move
            return ResponseEntity.badRequest().body("Invalid move. Possible values: rock, paper, scissors");
        }
    }

   
}
