//fun main(args: Array<String>) {
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
//}
fun main(args: Array<String>){
    // 변수선언
    // 상수 (val)
    val initAndConstant:Int=10;
    println("val : init and constant ${initAndConstant}");

    // 변수 (var)
    var mustInitVariables: Int=10;
    println("var : must init and not null ${mustInitVariables}");

    var acceptNullQuestionMarkVariables: Int?; 
    acceptNullQuestionMarkVariables = 11;
    // runtime시 체크하여 null 이면 에러발생
    println("var : accept null ${acceptNullQuestionMarkVariables}"); 

    var byteValue:Byte=127; // -128 ~ 127
    println("var byte max 256 -> ${byteValue}");

    var shortValue:Short=-32768;
    println("var short max 256 -> ${shortValue}");

    var intValue:Int= -2147483648; // -2147483648 ~ 2147483647
    println("var Int max -> ${intValue}");

    var longValue:Long=9223372036854775806;
    println("var Long max -> ${longValue}");

    var ubyteValue:UByte=255u;
    println("var UByte max -> ${ubyteValue}");

    var ushortValue:UShort=65535u;
    println("var UShort max -> ${ushortValue}");

}