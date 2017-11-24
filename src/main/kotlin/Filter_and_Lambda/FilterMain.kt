package Filter_and_Lambda

fun main(args : Array<String>){

    val grades = mutableListOf<Int>(20,30,40,50,60,80,80,100,25,35,90)
    val passingGrades = grades.filter { item -> item>65 }
    val numberOfPassingGrades = grades.count { item -> item > 65 }

    passingGrades.forEach {
        item -> println(item)
    }


    fun <T> Iterable<T>.count(items: (T) -> Boolean): Int {
        if (this is Collection && isEmpty()) return 0
        var count = 0
        for (grade in this)
            if (items(grade)) {
                count++
            }
        return count
    }
    println(numberOfPassingGrades)

    println(grades.average())
}
