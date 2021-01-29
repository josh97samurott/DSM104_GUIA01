fun main(args: Array<String>){
    println("CONTADOR DE NÚMEROS PARES E IMPARES")

    print("¿Cuantos números ingresará? ")
    var i:Int = readLine()?.toInt() as Int
    var j:Int = 0
    var k:Int
    var pares:Int = 0
    var impares:Int = 0

    while(j < i){
        k = j+1
        print("("+k+") Ingrese el número: ")
        var num:Int = readLine()?.toInt() as Int

        var modulo:Int = num%2

        if(modulo == 0){
            pares++
        }
        else{
            impares++
        }

        j++
    }

    println("La cantidad de números pares ingresados fue de: "+ pares)
    println("La cantidad de números impares ingresados fue de: "+impares)

}