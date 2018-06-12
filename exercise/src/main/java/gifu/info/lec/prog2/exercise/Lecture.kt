package gifu.info.lec.prog2.exercise

val x: Int = 1
// x = 2 // <- val cannot be reassigned

var str: String? = "ABCabc"
// str = "def"

val y = 1.0
val b = true

fun hello(name: String): Unit {

}

//
// fun double ...

// if文とfor文

fun ifAndForTest() {
    val x = -10

    if (x > 0) {
        println("x is positive")
    } else {
        println("x is zero or negative")
    }

    for (x in 1..10) {
        println("\n" + x)
    }

    val msg = if (x > 0) "x is positive" else "x is 0 or negative"
    println(msg)
}

// クラス
class Person0(val name: String, val age: Int)

fun classTest() {
    val p = Person0("Imai", 36)
    println(p.name)
}


// データクラス
data class Person(val name: String, val age: Int)

fun dataClassTest() {
    val p = Person("Imai", 36)
    println(p.name)
    // Person(name=Imai, age=35)
}

// リストと集合
fun collectionTest() {
    val xs = listOf(1, 2, 3)
    val amount = xs.sum()
    println(amount)

    val ys = setOf(1, 1, 1, 1, 2, 3, 3, 3, 4, 4)
    println(ys)
}

// ミュータブルなリスト
fun mutableTest() {
    val xs = listOf(1, 2, 3)
    // xs.add(4)

    val zs = mutableListOf(0)
    for (z in 1..10) {
        zs.add(z)
    }
    println(zs)

    println(listOf(1..10))
}

// sumBy
val people = listOf(Person("Kim", 35), Person("Donald", 71),
        Person("Jae-in", 65), Person("Shinzo", 63))

fun collectionTest2() {
    // people.sum() // error

    // 年齢の総和
    println(people.sumBy { it.age })

    // 全員の名前の印字
    people.forEach({ println(it.name) })

}

fun hello2(p: Person): Unit {
    println("Hello, " + p.name + "!")
}

fun under40(p: Person): Int {
    if (p.age < 40) {
        return p.age
    } else {
        return 0
    }
}
/* これは

fun under40(p:Person) = if (p.age<40) p.age else 0

とも書ける
 */


fun collectionTest3() {

    people.forEach(::hello2)

    people.sumBy(::under40)

    // people.sumBy { it.age } は次のようにも書ける
    people.sumBy(Person::age)
}

fun collectionTest4() {
    println( listOf(1,2,3).map { it * 2 } )

    println( people.map { it.name.toUpperCase() } )

    println( listOf(631, -10, 42, 193).filter { it < 100 } )

    println( people.filter { it.age >= 70 } )

}

// NULL 許容型

// fun dangerous(str : String?) = str.toUpperCase() // error

fun safe(str : String?) : String {
    if (str!=null) {
        return "Hello, " + str.toUpperCase() // 上でチェックしているのでOk
    } else {
        return "Hello, 名無し"
    }
}


// 拡張関数
fun Person.hello() = "Hello, I'm " + this.name

// Exercise.kt へ










