// this Class has a regular constructor
/*
open class GeneralRobot(private val name: String) {
    // in kotlin the "open" keyword is used for specify that the class is up to extensions
    //using init
    init {
        println("A new robot has been created!")
    }
    init {
        println("Im the second init")
    }
    fun walk() {
        println("This robot is walking")
    }

    fun speak(message: String) {
        println("$name says $message")
    }

}
*/

// this Class has two constructors

open class GeneralRobot() {
    // in kotlin the "open" keyword is used for specify that the class is up to extensions
    // in order to access those variables inside the constructors, we have to declare they over here:
    //public are accessible inside de class, subclass and outside
    public var serialNumber: String = "123456"
    //private properties are not accessible from other classes or outside
    private var serialNumber2: String = "123456"
    //protected are visible and changeable inside de class and subclasses, but not outside
    // internal are accessible inside the files that are in the same package
    private var name: String = ""
        get() {
            println("getting the name........")
            return ("$field the robot ")
        }
        set(value) {
            println("Não adianta o nome que tu botar aqui, seu robo vai ser sempre tânia")
            field = "Tânia"
        }
    private var modelYear: String = ""


    // Getters and Setters


    init {
        println("initializing variables...!")
        name = ""
        modelYear = ""
    }

    //defining the constructors
    constructor(name: String, modelYear: String) : this() {
        this.name = name
        this.modelYear = modelYear
    }

    constructor(name: String) : this() {
        this.name = name
        this.modelYear = "Unknown model year"
    }

    //using init
    init {
        println("A new robot has been created!")
    }

    init {
        println("Im the second init")
    }

    fun walk() {
        println("This robot is walking")
    }

    fun speak(message: String) {
        println("$name says $message")
    }

}