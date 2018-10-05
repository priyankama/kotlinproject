import java.util.*

fun main(args: Array<String>) {
    println("Enter any 5 values:\n")
    val chk=2
    val a = readLine()!!.toInt()
    val b= readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val d= readLine()!!.toInt()
    val e = readLine()!!.toInt()
    val arr = listOf(a,b,c,d,e)
    for(i in arr){
        if(i % chk == 0){
            println("$i is even")
        }else{
            println("$i is odd")
        }
    }
}