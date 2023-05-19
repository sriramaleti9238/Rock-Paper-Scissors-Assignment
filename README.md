# Rock-Paper-Scissors-Assignment

The above code is a rock , paper and scissors game in which the game is implemented as using spring microservice. 

The game has the rules, which are

    1. The Rock beats the Scissors
    2. The Scissors beats the Paper
    3. The Paper beats the Rock
    
There will be two players , player 1 as user and player 2 as computer

The user will pass their move through a rest endpoint as a parameter and the only allowed values for the parameters are "Rock, Paper, and Scissors" in the microservice that has been created.

Computer will generate random move out of "Rock, Paper and Scissors"

Now, from user move and from Computer move , the winner will be generated in response and shown on the screen as , 


-> If Player wins , the output will be like :

   Your Move : scissors
   Computer Move : paper

   Player wins [ the scissors beats the paper ]


-> If Computer wins , the output will be like :

   Your Move : rock
   Computer Move : paper

   Computer wins [ the paper beats the rock ]


-> If both user and computer will be same move , then output will be shown as

   Your Move : scissors
   Computer Move : scissors

   It is a tie


-> If the user enter wrong data in rest endpoint,the output will be shown as 

   Invalid move. Possible values: rock, paper, scissors
   

# Following are implemented in the above microservice

   1. Logging is implemented
   2. Unit test cases are implemented.
   3. Swagger is implemeted for the api documentation

# APIs

  to play game 
  
        http://localhost:8080/api/v1/play?move=?
   
        instead of " ? " , enter [" rock or paper or scissors "]
   
  for swagger 
       
       http://localhost:8080/swagger-ui/index.html
   
