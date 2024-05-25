package com.example.rockpaperscissors

fun main(){

    var computerChoice= " "
    var Playerchoice= " "
    println("Rock, Paper or Scissors? Enter your choices!")
    Playerchoice= readln()

    val randomNumber=(1..3).random()

    when (randomNumber) {
        1 -> {
            computerChoice = "Rock"
        }
        2 -> {
            computerChoice = "Paper"
        }
        3 -> {
            computerChoice = "Scissors"
        }
    }
    println(computerChoice)

    val winner= when{
        Playerchoice==computerChoice-> "Tie"
        Playerchoice == "Rock" && computerChoice== "Scissors" -> "Player"
        Playerchoice== "Paper" &&  computerChoice== "Rock" -> "Player"
        Playerchoice== "Scissors" && computerChoice== "Paper" -> "Player"
        else-> "Computer"
    }
    if(winner=="Tie") {
        println("It's a tie")
    }
        else{
            println("$winner won!")
        }
}