
fun main (args : Array<String>){

    callName(object :ExampleCallbackInterface{
        override fun sayName(name: String) {
            println(name)
        }

    })
}

fun callName (callback : ExampleCallbackInterface){
    callback.sayName("Addam")
}