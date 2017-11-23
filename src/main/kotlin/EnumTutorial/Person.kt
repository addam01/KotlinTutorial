package EnumTutorial

class Person{

    var personAction : PersonConst = PersonConst.EATING_AND_DRINKING
    fun doAction(action : PersonConst){
        this.personAction = action
    }
}