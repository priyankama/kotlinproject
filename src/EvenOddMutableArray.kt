fun main(args: Array<String>) {
    println("Enter no of values you want to enter in a array :\n")
    val n = readLine()!!.toInt()
    val chk=2
    println("Enter $n values in array")
    val arr = arrayListOf<Int>()
    for(i in n downTo 1){
        val a= readLine()!!.toInt()
        arr.add(a)
    }
    for(i in arr){
        if(i%chk ==0){
            println("$i is even")
        }else{
            println("$i is odd")
        }
    }

}