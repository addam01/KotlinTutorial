package GetSetTutorial

import EnumTutorial.PersonConst

class Person{
    var action : PersonConst = PersonConst.BIKING
    get() = PersonConst.EATING_AND_DRINKING

    var action2 : PersonConst = PersonConst.BIKING
    set(value) {
        field = PersonConst.WALK
    }
}