
class Car : Vehicle {
    var engine : String = ""
    var model : String = "Toyota"
    private val carNumber = 324313


    constructor(){}

    constructor(engine : String){
        this.engine = engine
    }

    fun showCarNumber(): Int {
        return carNumber
    }
}