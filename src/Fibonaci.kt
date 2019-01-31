fun main(args: Array<String>){
    var a=0
    var b=1
    println("enter the no to form fibonacci series")
    val n=    readLine()!!.toInt()
    val i = n
    print("$a $b ")
    var sum =a+b
    for(i in n downTo 2){
        print("$sum ")
        a=b
        b=sum
        sum=a+b
    }
}