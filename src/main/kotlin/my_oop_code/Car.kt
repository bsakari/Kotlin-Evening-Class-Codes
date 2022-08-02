package my_oop_code

fun main(args: Array<String>) {
    val carOne = Car("Mercedes","KDH001A",5)
    val carTwo = Car("Range","KDY002B",5)
    val carThree = Car("Noah","KDB006K",7)

    val carFour = Car("Subaru","KCA987J",5)

    carOne.hoot()
    println(carTwo.modelName)
    carThree.accelerate()
    carTwo.brake()
    println(carFour.modelName)
}

class Car {
    var modelName:String
    var registrationNumber:String
    var seatCapacity:Int

    constructor(modelName:String, registrationNumber:String,seatCapacity:Int){
        this.modelName = modelName
        this.registrationNumber = registrationNumber
        this.seatCapacity = seatCapacity
    }

    //These are functionalities
    fun hoot(){
        println("Yeah, I can hoot")
    }

    fun brake(){
        println("Yeah, I can brake")
    }

    fun accelerate(){
        println("Yeah, I can accelerate")
    }
}

//Create a User class to determine properties of its objects
//Make sure username and password are part of the user's properties
//Henceforth, have a functionality for a user to be able to log in if he/she
// provides correct credentials as per your desire










