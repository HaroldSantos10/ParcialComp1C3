package com.example.parcialcomp1

fun main(){
    print("Value 1: ")
    var num1: String? = readLine()?.ifBlank { null } ?: null
    print("Value 2: ")
    var num2: String? = readLine()?.ifBlank { null } ?: null

    var result = suma(num1,num2)
    println(result)
}

fun suma(num1 : String? , num2 : String?): String{
    var result = ""
    val n1 = num1?.toInt()
    val n2 = num2?.toInt()
    if (num1 != null && num2 != null){

        result = (n1!! + n2!!).toString()
    }else{
        if(num1 != null || num2 != null){
            if (num1 != null) {result = num1}
            if (num2 != null) {result = num2}
        }else{
            result= "Datos erroneos"
        }
    }
    return result.toString()
}