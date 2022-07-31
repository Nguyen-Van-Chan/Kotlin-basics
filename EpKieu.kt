fun main(args: Array<String>) {
   /* Ép kiểu rộng: Đưa từ kiểu có vùng lưu trữ nhỏ lên kiểu có vùng lưu trữ lớn==>không sợ mất mát dữ liệu.
         Byte=>Short=>Int=>Long=>Float=>Double

      Ép kiểu hẹp Đưa từ kiểu có vùng lưu trữ lớn về kiểu có vùng lưu trữ nhỏ==>có thể bị mất mát dữ liệu
         Double=>Float=>Long=>Int=>Short=>Byte
*/
   var A:Int = 10
   var B:Double = A.toDouble()
    println("A = "+A)
    println("B = "+B)

   var C = 10.11F
   var D:Int = C.toInt()
    println("C = "+C)
    println("D = "+D) //còn 10, gây mất dữ liệu
    //**************************
    var x = 15L +1 //Implicit Conversion 
    print("x = "+x)
}