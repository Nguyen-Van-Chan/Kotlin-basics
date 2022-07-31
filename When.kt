fun main(args: Array<String>) {
    //When thay thế cho switch
    var tuoi:Int=0
    println("Nhập tuổi của bạn :")
    var s:String?= readLine()  //nullable
    if(s!=null)  //nếu s đã được nhập
        tuoi=s.toInt()  //chuyển chuỗi về int
    when(tuoi)
    {
        in 1..5-> println("Tuổi thiếu nhi")  // .. trong khoảng
        in 6..9-> println("Tuổi nhi đồng")
        in 10..15-> println("Tuổi thiếu niên")
        in 16..28-> println("Tuổi thanh niên")
        !in 1..100-> println("Ko biết tuổi gì")  // !in.. không nằm trong khoảng
        else->println("Bạn già rồi")
    }

    //------------------------------------------------
    println("*********************")
    var x:Int=8
    var kq=when(x)
    {
        in 1..10->x+100
        in 20..30->x-1000
        else -> x
    }
    println(kq)
    /****************
     *
     */
    var y:Int=10
    when
    {
        y%2==0-> println("$y là số chẵn") //$ giá trị của biến
        y%2!=0->println("$y là số lẻ")
    }

}
