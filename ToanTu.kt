fun main(args: Array<String>) {
    var x:Int=-8
    var y=x.unaryPlus() //+ số dương
    var z=x.unaryMinus() // - số âm
    println("x"+x)
    println("y"+y)
    println("z"+z)
    print("*************************")
    /*
    var a:Int = 5
    var b:Int = 4
    println(""+a+"+"+b+"="+(a.plus(b)))
    println(""+a+"-"+b+"="+(a.minus(b)))
    println(""+a+"*"+b+"="+(a.times(b)))
    println(""+a+"/"+b+"="+(a.div(b)))
    println(""+a+"/"+b+"="+(a.rem(b))) // chia lấy dư
    println(8.plus(2))
*/
    println("*************************")
    var a2:Int=8
    var b2:Int=5
    println(a2==b2)
    println(a2.equals(b2)) // so sách bằng
    println(!a2.equals(b2)) //không bằng
    println(a2.compareTo(b2)) // lớn bé
    println("*************************")
    var a:Int=5
    var b:Int=8
    var c:Int=2
    a-- // = a.inc()
    b++ // = b.dec()
    var z2=a++ + ++b - --c + 7
    println("a="+a)  // a = 5
    println("b="+b)  // b = 10
    println("c="+c)  // c = 1
    println("z2="+z2) //z2 = 20








}