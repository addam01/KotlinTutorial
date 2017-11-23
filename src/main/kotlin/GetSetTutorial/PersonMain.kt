package GetSetTutorial

import EnumTutorial.PersonConst

fun main(args : Array<String>){

    val person = Person()

    println(person.action)

    person.action2 = PersonConst.BIKING
    println(person.action2)
}