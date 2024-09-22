import GeneralRobot as GeneralRobot

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



    // function declaration
// unit is the void like in kotlin
    fun sayHello(name: String, age: String = "Not Specified"): Unit {
        println("Hello $name, your age is: $age")
    }

    // return declarations
    fun sumTwoNumbers(x: Int, y: Int): Int {
        val z = x + y
        return z
    }

    /*
        Function overloading
        is a powerful feature that allows you
        to define multiple functions with the
        same name but different parameters. Then the kotlin compiler decides which version of
        the function to call based on the arguments provided.
     */

    fun sumTwoNumbers(x: Double, y: Double): Double {
        val z = x + y
        println("second function")
        return z
    }


    sayHello("joão")
    sumTwoNumbers(2, 2)
    sumTwoNumbers(3.5, 5.5)

    // CLASSES ---------------------------------------------------------
    /*
        class SimpleRobot( name: String): GeneralRobot(name) {
            fun tornOnLight() {
                println("The light is on!")
            }
        }

        class SupaDupaRobot( name: String): GeneralRobot(name) {
            fun savesTheWorld() {
                println("I'LL SAVE THE WORLD")
            }
        }


        val robert = SimpleRobot("Robert")
        val metatron = SupaDupaRobot("Metatron")
        robert.tornOnLight()
        robert.walk()
        robert.speak("Oh hiiiiiinnnn")
        metatron.savesTheWorld()
        robert.speak("Metraton smash")

        */


    // AFTER ADDING ONE MORE CONSTRUCTOR, THOSE CLASSES NEED TO BE REFACTORED
    class SimpleRobot : GeneralRobot {
        constructor(name: String, modelYear: String) : super(name, modelYear)
        constructor(name: String) : super(name)

        fun tornOnLight() {
            println("The light is on!")
        }
    }

    class SupaDupaRobot : GeneralRobot {
        constructor(name: String, modelYear: String) : super(name, modelYear)
        constructor(name: String) : super(name)

        fun savesTheWorld() {
            println("I'LL SAVE THE WORLD")
        }
    }


    val robert = SimpleRobot("Robert", "2024")
    val metatron = SupaDupaRobot("Metatron")
    robert.tornOnLight()
    robert.walk()
    robert.speak("Oh hiiiiiinnnn")
    metatron.savesTheWorld()
    robert.speak("Metraton smash")


    val vegetables = mutableListOf<String>("BANANA", "4")
    println(vegetables)
    vegetables.add("carrots")
    println(vegetables)
    vegetables.removeAt(0)
    println(vegetables)

    // update values
    vegetables[0] = "onions"
    println(vegetables)

    // ArrayList
    val colors = arrayListOf("RED", "GREEN", 1, "RED")
    println(colors)
    colors.add("BLUE")
    println(colors)
    colors.removeAt(0)
    println(colors)

    //set
    //immutable sets no duplicates allowed and is read-only
    val colorsset = setOf("RED", "GREEN", "RED")
    println(colorsset)

    //mutable set no duplicates allowed but can be modified
    val mutableSetOfColors = mutableSetOf("RED", "GREEN", "RED")
    println(mutableSetOfColors)
    mutableSetOfColors.add("BLUE")
    println(mutableSetOfColors)


    // map
    // key-value pairs - like objects in javascript
    //immutable maps no duplicates allowed and is read-only

    val fruitsMaps = mapOf("apple" to 5, "banana" to 10)
    println(fruitsMaps)
    val quantityOfBananas = fruitsMaps["banana"]
    //val quantityOfBananas = fruitsMaps.get("apple")
    println("the quantity of bananas is $quantityOfBananas")

    val mapOfVegetables = mutableMapOf<String, Double>("carrots" to 5.0, "onions" to 10.0)
    println(mapOfVegetables)
    mapOfVegetables["pepper"] = 20.0
    println(mapOfVegetables)
    val quantityOfCarrots = mapOfVegetables["carrots"]
    println("the quantity of carrots is $quantityOfCarrots")
    mapOfVegetables.put("beans", 60.0)
    mapOfVegetables["pepper"] = 2.0
    println(mapOfVegetables)

    // basic lambda expression: {parameters -> body}
    // type 1 - with parameters and return type
    val add: (Int, Int) -> Int = { a, b -> a + b }
    // uma constante que recebe uma expressão lambda que tem recebe dois argumentos que são do tipo
    // inteiro. A função retorna um resultado do tipo inteiro que é a soma dos argumentos
    var result = add(5, 4)
    println(result)

    // 2 - with parameters and no return value
    val add2: (Int, Int) -> Unit = { a, b -> println(a + b) }
    add2(5, 4)
    //Unit é o tipo de retorno em Kotlin, unit é semelhante a void em outras linguagens, e significa que
    //a expressão lambda não retorna nenhum valor completo significativo, portanto, não há valor

    //3 - No parameters but with return value
    val add3: () -> String = { "Welcome to New York, it's been waiting for you!" }
    println(add3())
    add3() // no return because it is type string
    var result2 = add3()
    println(result2)

    // 4 - no parameters and no return value
    val add4: () -> Unit = { println("no parameters and no return value") }
    add4()
    println(add4())

    // Direct use of lambda expressions
    println({ a: Int, b: Int -> a + b }(5, 4))


    // anonymous function
    val numbers = listOf(1, 2, 3, 4, 5)
    val squareAnonymous = fun(x: Int): Int {
        return x * x
    }

    val squaredNumbers = numbers.map(squareAnonymous)
    println(squaredNumbers)

    // types of anonymous functions
    val multiply = fun(a: Int, b: Int): Int { return a * b }
    println(multiply(5, 4))
    println(multiply.invoke(5, 4))


    // with parameters and no return value
    val multiply2 = fun(a: Int, b: Int) { println("" + a * b) }
    multiply2(5, 5)

    // no parameters and return value
    val msg = fun(): String { return "Welcome to New York, it's been waiting for you!" }
    println(msg())

    // no parameters and no return value
    val msg2 = fun(): Unit { println("no parameters and no return value") }
    msg2()


    // higher-order functions: accept one or more functions as parameters can retur a function as a result

    fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        // this function has 3 parameters 2 int and 1 function which takes 2 ints and returns an int
        return operation(a, b) //usando os 2 argumentos na function
    }

    val addResult = operateOnNumbers(5, 4) { a, b -> a + b }
    val multiplyResult = operateOnNumbers(5, 4) { a, b -> a * b }
    println("the result of the add operation is $addResult")
    println("the result of the multiply operation is $multiplyResult")


    // it operator
    val squaredNumbers2 = numbers.map { it * it }
    println(squaredNumbers2)
}