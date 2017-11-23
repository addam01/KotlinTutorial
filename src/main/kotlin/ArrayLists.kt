
fun main (args : Array<String>) {
    var friends = arrayListOf<String>("Addam", "Arman", "Firdaus")

    friends.add("Aswini")

    friends.remove("Arman")

    friends.add(1,"Herp")
    for (friend in friends){
        println(friend)
    }
}