package singletonTutorial

fun main(args : Array<String>){
    val person1 = SingletonPerson
    person1.name = "Herp"

    val person2 = SingletonPerson
    person2.name = "Derp"

    SingletonPerson.name = "Huhu"

    println(person1.name)
    println(person2.name)
    println(SingletonPerson.name)
}