package com.example.parcialcomp1

fun main(){

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