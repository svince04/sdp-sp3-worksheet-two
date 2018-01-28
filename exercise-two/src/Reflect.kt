
fun main(args: Array<String>) {
    if (args.size < 2) {
        println("Requires a class name and a list of arguments")
        System.exit(-1)
    }

    // Java reflection - get class reference
    val reflectClassJava = Class.forName(args[0])
    val paramArray = args.sliceArray(1..(args.size - 1))

    // Get constructor list...
    val constructorsJava = reflectClassJava.constructors

    constructorsJava
            .filter { it.parameterCount == paramArray.size }
            .map { it.newInstance(*paramArray) }
            .filterIsInstance<Dinosaur>()
            .forEach { it.roar() }

}
