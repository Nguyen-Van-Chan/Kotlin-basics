fun main(args: Array<String>) {
    var a:Int=10
    var b:Int=15
    var max = if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }
    println("max ="+max)

//***************
    println("**********************")

    var dtb:Double = 0.0
    print("Bạn hãy nhập điểm trung bình: ")
    var diem:String ?= readLine()
    if (diem!=null) {
        dtb = diem.toDouble()
        if (dtb >= 5 && dtb <= 10)
            print("bạn đã đậu")
        if (dtb >= 0 && dtb < 5)
            print("Bạn đã rớt")
    } else {
        print("Bạn hãy nhập điểm trong khoản 0 - 10")
    }
    
}