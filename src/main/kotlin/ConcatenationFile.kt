fun main(args: Array<String>) {
    var name = "King"
    var age = 100
    println("Hello "+name+", you are "+age+" years old")
    println("Hello $name, you are $age years old")

    var radius = 7
    var height = 30
    var volumeOfTheCylinder = 3.142 * radius * radius * height
    println("Hello there, your volume is $volumeOfTheCylinder")
    
    var personWeight = 80
    var personHeight = 1.8
    var bmiOfAPerson = personWeight / (personHeight * personHeight)
    println("Hello there, your BMI is $bmiOfAPerson")

}