//Noah Anderson
fun main() {
    //asks user for a number between 1 and 10, also initializes numGerman
    println("Please input a number between 1 and 10, inclusive.5")
    var numInput = readLine()!!.toInt()
    var numGerman = ""
    //Input validation, makes sure numInput is between 1 and 10
    while(numInput > 10 || numInput < 1){
        println("That is an invalid number! Please enter one between 1 and 10!")
        numInput = readLine()!!.toInt()
    }

    //prints the number in German
    when(numInput){
        1 -> numGerman = "Eins"
        2 -> numGerman = "Zwei"
        3 -> numGerman = "Drei"
        4 -> numGerman = "Vier"
        5 -> numGerman = "Fuenf"
        6 -> numGerman = "Sechs"
        7 -> numGerman = "Sieben"
        8 -> numGerman = "Acht"
        9 -> numGerman = "Neun"
        10 -> numGerman = "Zehn"
    }
    println("The number " + numInput + " in German is: " + numGerman)
}