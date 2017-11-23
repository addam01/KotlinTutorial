
fun main (args : Array<String>) {

    var friends = arrayListOf<String>()

    var friendInput = "something"

    while (friendInput != ""){
        println("Enter your friends, leave blank if want to stop")
        friendInput = readLine()!!
        if (friendInput !=""){
            friends.add(friendInput)
        }
    }

    println(friends)
}