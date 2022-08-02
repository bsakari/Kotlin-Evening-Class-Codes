fun main(args: Array<String>) {
    //1. If statement
    //2. When statement

    //1. IF STATEMENTS
    var age = 18
    if (age < 18){
        println("Sorry, you can't party with us")
    }else{
        println("Welcome to the party")
    }

    var marks = 60
    if (marks < 40){
        println("E")
    }else if (marks < 50){
        println("D")
    }else if (marks < 60){
        println("C")
    }else if (marks < 70){
        println("B")
    }else{
        println("A")
    }
    //2. WHEN STATEMENTS
    //Create a simple betting system
    var bettingNumber = 1
    when(bettingNumber){
        1 ->{
            println("Ooops!!! You lost!!!")
        }
        2->{
            println("Ooops!!! You lost!!!")
        }
        3->{
            println("Congrats!!! You won!!!")
        }
        4->{
            println("Ooops!!! You lost!!!")
        }
        else->{
            println("Please enter any number from 1 - 4 to bet")
        }
    }
    // Create a system to calculate the BMI of any user and display the result
    //as either 1. Underweight 2. Normal weight 3. Overweight 4. Obese
    //N/B: Use the scale below to determine the BMI
    // 18 and below ------------- Underweight
    // 18.1  - 24 ------------------ Normal weight
    // 24.1 ---- 34 -------------- Overweight
    // 34.1 and above ------------- Obese

    var usersWeight = 70
    var usersHeight = 1.8
    var usersBmi = usersWeight / (usersHeight * usersHeight)
    if (usersBmi <= 18){
        println("Underweight")
    }else if (usersBmi <= 24){
        println("Normal weight")
    }else if (usersBmi <= 34){
        println("Overweight")
    }else{
        println("Obese")
    }
}