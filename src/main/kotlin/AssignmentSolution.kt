fun main(args: Array<String>) {
    validateUsersCredentials("emobilis@gmail.com","emobilis123")
}

fun validateUsersCredentials(email:String, password:String){
    val correctEmail = "emobilis@gmail.com"
    val correctPassword = "emobilis123"
    if (email.equals(correctEmail) && password.equals(correctPassword)){
        bmiCalc(70.0,1.8)
        bettingDemo(3)
        totalLoanCalc(10000.00,2.5,3.0)
    }else{
        println("Wrong email or password")
    }
}

fun bmiCalc(weight:Double, height:Double){
    var usersBmi = weight / (height * height)
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

fun bettingDemo(bettingNumber:Int){

    var bettingResult = when(bettingNumber){
        1-> "Oops!!! You Lost"
        2-> "Oops!!! You Lost"
        3-> "Congrats!!! You Won"
        4-> "Oops!!! You Lost"
        else-> "Please enter a number from 1 - 4 to bet"
    }
    println(bettingResult)
}

fun totalLoanCalc(principle:Double, rate:Double, time:Double){
    var simpleInterest = (principle * rate * time) / 100.0
    var totalPayableLoan = simpleInterest + principle
    println("Hello, your total payable loan is $totalPayableLoan")
}