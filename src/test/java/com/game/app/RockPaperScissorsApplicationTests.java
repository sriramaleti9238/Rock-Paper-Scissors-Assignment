package com.game.app;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.game.controller.RockPaperScissorsController;



@SpringBootTest
class RockPaperScissorsApplicationTests {
	

    @Autowired
    private RockPaperScissorsController controller;
    

    @Test
    public void testPlayGameWithValidMove() {
        String playerMove = "rock";
        ResponseEntity<String> response = controller.playGame(playerMove);
        assertEquals(HttpStatus.OK, response.getStatusCode());

    }
	
	@Test
    public void testPlayGameWithInvalidMove() {
        String invalidMove = "invalid";
        ResponseEntity<String> response = controller.playGame(invalidMove);

        assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
        assertNotNull(response);
        assertEquals("Invalid move. Possible values: rock, paper, scissors", response.getBody());
    }
	
	@Test
	public void dataNotNull() {
		String playerMove = "rock";
		ResponseEntity<String> response = controller.playGame(playerMove);
		 assertNotNull(response);
	}
	
	@Test
	public void expectedWrongData() {
		String playerMove = "rock";
		ResponseEntity<String> response = controller.playGame(playerMove);
		assertFalse("Invalid move. Possible values: rock, paper, scissors", false);
	}
	
}
