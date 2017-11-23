package EnumTutorial

fun main(args : Array<String>){

    var person = Person()

    person.doAction(PersonConst.BIKING)

    println(person.personAction)

}