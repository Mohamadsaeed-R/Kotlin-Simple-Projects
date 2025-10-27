package com.example.project1

fun main(args:Array<String>){
    var a:String ="Hello Kotlin"
    var b:String ="Language"
    var age :Int= 32
    println("your age is :"+age)
    println(a +" " +  b)


    var d:String ="Kotlin"
    var e:Int=d.length
    println("Length of Kotlin:"+e)
    var g:Boolean=e.equals("java")//یعنی ایا مقدارش مساوی است با java?
    println(g)
    println(d.isEmpty())
    println(d.plus("Language"))
    println(d.lowercase())
    println("**********************************")
    println(d.uppercase())
    var t :String ="    Android   "
    println(d+t)
    println(d+t.trim())     //Removes spaces from both ends of the string
}