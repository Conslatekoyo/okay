import java.util.*

fun main() {
    //Create a function that takes in 4 strings  and creates an array out of them
    //then prints out the array
    /*Create a function that given an array below:
 var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
prints out the names of the cities in the correct grammatical case.      (2 points)

3. Create one function that given the below array:
 var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
(i) prints out the sum of the second and fifth elements                         (1 point)
(ii) prints out the index of 158                                                                                (1 point)
(iii) prints out the elements in ascending order                                           (2 points)

4. Create a function that takes in 3 names and returns a string array containing
all 3 names. */


    chaine(arrayOf("Sudan", "Somalia", "Kenya", "Rwanda"))
    Correct()
    great()
    takein(arrayOf("brenda","conslate","jeik"))
}

fun chaine(namesCountries:Array<String>) {
    println(namesCountries.contentToString())
    }

fun Correct() {
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    cities.forEach { city  ->
        println(city.capitalize())
    }
}
fun great() {
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var sum= numbers[1]+numbers[4]
    println(sum)
    var index=numbers.indexOf(158)
    println(index)
    var sortasc = numbers.sortedArray()
    println(Arrays.toString(sortasc))
}

fun takein(noms:Array<String>):Array<String> {
    var name= noms
    println(noms.contentToString())
    return(name)

}