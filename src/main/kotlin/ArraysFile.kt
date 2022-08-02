fun main(args: Array<String>) {
    var names = arrayOf("King","John","Mercy","David","Mike")
    println(names[0])
    println(names[3])
    println("----------------------------------------")
    for (name in names){
        println(name)
    }
    println("----------------------------------------")

    //Use a while to print the elements of the array
    var sizeOfTheArray = names.size
    var arrayPosition = 0
    names.sort()
    while (arrayPosition < sizeOfTheArray){
        println(names[arrayPosition])
        arrayPosition++
    }
}