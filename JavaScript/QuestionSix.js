let prompt = require("prompt-sync")();

const dateOfBirth = 25;
        
let userInput =parseInt(prompt("What is my day of birth? : "));

while (userInput != dateOfBirth) {
  userInput = parseInt(prompt("Guess my day of birth: "));
  if (userInput == dateOfBirth) {
    console.log("Correct Guess");
  } else {
    console.log("Incorrect Guess");
  }
}

