import com.sun.xml.internal.fastinfoset.util.StringArray

fun main(args: Array<String>) {
    var x:Long=100L
    var y:Double=113.5
    var f:Float=113.5f
    var i:Int =113
    var s:Short=8
    var b:Byte=1
    var gioitinh:Boolean = true
    // khai báo nhiều dòng vói 3 dấu nháy kép """
    var infor:String =
        """ trang đăng khải
            | lớp k11tho1
            | đang học kotlin
        """.trimMargin()

    println(infor)
    // var kiểu dữ liệu = xxxArrayOf(giá trị1, giá trị 2)
    var so:IntArray = intArrayOf(1,2,3,4)
    print(so[2])
    var chu:CharArray = charArrayOf('a','b')
    println(chu[1])
    val pi:Float = 3.14F //val là dành cho hằng số
    print("so pi la: "+pi)
}