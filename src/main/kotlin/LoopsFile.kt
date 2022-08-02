fun main(args: Array<String>) {
    //1. WHILE LOOP
    var counterOne = 0
    while (counterOne <= 5){
        println(counterOne)
        counterOne++
    }
    //2. DO WHILE LOOP
    var counterTwo = 10
    do {
        println(counterTwo)
        counterTwo++
    }while (counterTwo <= 15)
    //3. FOR IN LOOP
    var increasingNumbers = 25 .. 30
    for ( x in increasingNumbers){
        println(x)
    }

    var decreasingNumbers = 30 downTo 25
    for (y in decreasingNumbers){
        println(y)
    }
    var studentsNames = arrayOf("Grace","Bethel","Douglas","Chege","Amy")

    for (jina in studentsNames){
        println(jina)
    }
    //4. REPEAT LOOP
    repeat(5){
        println("Hello there")
    }

    //Using a while loop, print all the numbers from 50 to 45

    var counterFour =50
    while (counterFour>=45){
        println(counterFour)
        counterFour--
    }
}







