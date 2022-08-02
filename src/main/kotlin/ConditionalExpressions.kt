fun main(args: Array<String>) {
    //1. If expression
    //2. When expression

    //1. IF EXPRESSION
    var marks = 90
    var grade = if (marks < 40){
        "E"
    }else if (marks < 50){
        "D"
    }else if (marks < 60){
        "C"
    }else if (marks < 70){
        "B"
    }else{
        "A"
    }
    println(grade)

    //2. WHEN EXPRESSION
    var bettingNumber = 3
    var bettingResult = when(bettingNumber){
        1-> "Oops!!! You Lost"
        2-> "Oops!!! You Lost"
        3-> "Congrats!!! You Won"
        4-> "Oops!!! You Lost"
        else-> "Please enter a number from 1 - 4 to bet"
    }
    println(bettingResult)
}