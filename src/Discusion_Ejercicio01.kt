fun main(args: Array<String>) {
    var num1:Int
    var num2:Int

    println("Ingrese dos números para conocer si son divisibles entre si.")

    print("Ingrese el primer número: ")
    num1 = readLine()?.toInt() as Int

    println("")
    print("Ingrese el segundo número: ")
    num2 = readLine()?.toInt() as Int

    var modulo:Int = num1%num2

    println("")
    if(modulo == 0){
        println("Los números 'SI' son divisibles entre sí")
    }
    else{
        println("Los números 'NO' son divisibles entre sí")
    }

}