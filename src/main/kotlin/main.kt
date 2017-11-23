fun main (args:Array<String>){
    println("hello world")
    println(2+2)

    val question1 = 2*5
    println(question1)

    var thisIsVairable = 2
    thisIsVairable += 3
    println(thisIsVairable)

//    println("Enter name")
//    val name = readLine()
//    println(name)

    /**
     * Types
     */
    val varchar : String = "Hello"
    val Integer : Int = 2
    val decimals : Double = 2.34

    /**
     *Conditions
     */
    val derpiness: Int? = readLine()?.toInt();
    println("Whats your level of derpi-ness?")

    if (derpiness != null) {
        if (derpiness<10)
            println("You are not derp")
        else
            println("For a level $derpiness. You are dumb AF")
    }

    
}