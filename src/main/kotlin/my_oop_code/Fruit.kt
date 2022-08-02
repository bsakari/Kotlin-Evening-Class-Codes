package my_oop_code

fun main(args: Array<String>) {
    //Let's create our first fruit from the Fruit class
    val fruitOne = Fruit("Mango","Yellow","Ksh 30.00")
    //Let's create the second fruit from the Fruit class
    val fruitTwo = Fruit("Tomato","Red","Ksh 10.00")
    //Let's create the third fruit from the Fruit class
    val fruitThree = Fruit("Apple","Green","Ksh 50.00")

    println(fruitOne.name)
    println(fruitThree.price)
    println(fruitTwo.colour)
}

class Fruit {
    //These are properties of a class
    var name:String
    var colour:String
    var price:String

    //This is a constructor
    constructor(name:String, colour:String, price:String){
        this.name = name
        this.colour = colour
        this.price = price
    }
}