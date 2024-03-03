//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {
    // loops and babados
    for (i: Int in 1..5) {
        // 1 to five inclusive 1,2,3,4,5
        println(i)
    }

    // while
    var count: Int = 0
    while (count <= 5) {
        println("count : $count")
        count++
    }

    // do-while loop: it guarantees that the loop body is
    // executed at least once because the condition is checked
    // after the loop body

    var x = 1
    do {
        println("this will be printed at least once...")
    } while (x < 0)

    // break keyword
    for (i in 1..10) {
        if (i == 5) {
            break
        }
        println(i)
    }
    // continue keyword
    for (i in 1..10) {
        if ((i % 2) == 0) {
            continue
        }
        println(i)
    }

    // Arrays - a collection of elements of THE SAME DATA TYPE organized in a specific order and accessed by index
    // arrays are indexed by 0
    val osNames: Array<String> = arrayOf("windows", "android", "MacOs", "Linux")
    val win: String = osNames[0]
    println(win)
    //modifying elements
    osNames[1] = "iOs"
    println(osNames)

    val size = osNames.size
    println(size)

    for (name in osNames) {
        println(name)
    }

    osNames.forEach { name -> println(name) }

    // Ranges - interval between two values
    // closed range startValue..endValue
    // 1,2,3,4,5
    val range = 1..5

    // half-open range startValue until endValue
    val range2 = 1 until 5
    // 1,2,3,4

    for (i in range) {
        println("range 1 -> $i")
    }
    for (i in range2) {
        println("range 2 -> $i")
    }

}