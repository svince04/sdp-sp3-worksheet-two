
fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Requires a class name as argument to program")
        System.exit(-1)
    }

    // Takes class name from input string and loads
    val reflectClass = Class.forName(args[0])
    val name = reflectClass.name

    println("Class name: $name")
    println("")

    print("Interface name(s): ")
    val interfaces = reflectClass.interfaces
    interfaces.forEach { n -> println(n) }
    println("")

    println("Class fields:")
    reflectClass.declaredFields.forEach { n -> println(n) }
    println("")

    println("Interface fields:")
    interfaces.forEach { n -> n.declaredFields.forEach { i -> println(i) }}
    println("")

    println("Class constructor(s):")
    reflectClass.constructors.forEach { n -> println(n) }
    println("")

    println("Interface constructor(s):")
    interfaces.forEach { n -> n.constructors.forEach { i -> println(i) }}
    println("")

    println("Method(s):")
    reflectClass.declaredMethods.forEach { n -> println(n)}
    println("")

    println("Interface method(s):")
    interfaces.forEach { n -> n.declaredMethods.forEach { i -> println(i) }}
    println("")
}
