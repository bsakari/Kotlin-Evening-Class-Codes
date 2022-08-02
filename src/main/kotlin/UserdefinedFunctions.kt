fun main(args: Array<String>) {
    motto()
    average(23.5, 56,76.0f)
    bmi(70.0,1.8)
    println(areaOfTriangle(23.0,45.0))
    println("Hello there, the result from the function is "+addNumbers(20,30,40))
}

fun motto(){
    println("Hi, this is our motto. Thank you.")
}

fun average(x:Double, y:Int, z: Float){
    var answer = (x + y + z) / 3.0
    println("Hello there, your average is $answer")
}

fun bmi(weight:Double, height:Double){
    var bmi = weight/Math.pow(height,2.0)
    println("Hello there, your bmi is $bmi")
}

fun areaOfTriangle(base:Double, height:Double):Double{
    var areaOfTriangle = 1/2.0 * base * height
    return areaOfTriangle
}

fun addNumbers(x:Int, y:Int, z:Int):Int{
    var additionResult = x + y + z
    return additionResult
}

// 1. Create a function to validate the users' login credentials.
// Check if the email provided is "emobilis@gmail.com" and the password provided is
// "emobilis123" and then proceed to perform the following tasks
    //i. call a separate bmi function that checks the users bmi and displays
    // the results as either 1. Underweight, 2. Normal weight 3. Overweight 4. Obese
    //N/B: Use a scale provided in our previous class
    //ii. call a separate function that calculates the total payable loan borrowed
    // after some time
    //iii. Call a separate function that illustrates a simple betting logic on a
    // conditional expression
// 2. Print all even numbers between 0 and 100 in descending order