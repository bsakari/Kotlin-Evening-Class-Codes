fun main(args: Array<String>) {
    //1. Inbuilt functions / Methods
    //2. User defined / custom functions / Methods

    //1. INBUILT FUNCTIONS
    var greeting = "      Hello there        "
    println(greeting.uppercase())
    println(greeting.lowercase())
    println(greeting.trim())

    var numberX = 16.0
    println(Math.pow(numberX,3.0))
    println(Math.sqrt(numberX))

    var usersWeight = 70
    var usersHeight = 1.8
    var usersBmi = usersWeight / Math.pow(usersHeight,2.0)
    println("Hello there, your bmi is $usersBmi")

    
    var cylinderHeight = 10.0
    var cylinderRadius = 9.0
    var cylinderVolume = Math.PI * Math.pow(cylinderRadius,2.0) * cylinderHeight
    println("Hello there, your volume is $cylinderVolume")
}

