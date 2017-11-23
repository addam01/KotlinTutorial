
fun main(args : Array<String>){

    var car = Car()

    println(car.model)

    println(car.showCarNumber())

    println(car.makeNoise())

    var car2 = Car("Honda")
    println(car2.engine)
}