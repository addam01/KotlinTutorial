
fun main (args : Array<String>){

    println("What is your favorite ice cream flavor?")

    var iceCream : String = readLine()!!

    when (iceCream){
        "Vanilla" -> {
            println("Yum")
            println("Vaniillllaaa")
        }
        "Chocolate" -> println("Heaty")
        "Durian" -> println("Stay away from me!")
    }

    /*
    * It can only do == conditons
    * cannot do < , >, || , and &&*/
}