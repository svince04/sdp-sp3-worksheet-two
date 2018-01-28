/**
 * Created by svince04 on 28/01/2018 for sdp-sp3-worksheet-two.
 */
class Dinosaur (val size: String, val diet: String, val teeth: String) {
    var dStatus: String = ""

    constructor(size: String, diet: String, teeth: String, status: String) : this(size, diet, teeth) {
        dStatus = status
    }

    fun roar() {
        println("RAAAAWRRRRRRR")
    }

}