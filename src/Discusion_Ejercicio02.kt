fun main(args: Array<String>){
    val notas = arrayOf(0, 0, 0, 0, 0, 0, 0 , 0, 0, 0)
    var notasMenores7:Int = 0
    var notasMayoresOiguales7:Int = 0

    println("INGRESE 10 NOTAS DE ALUMNOS")
    var i:Int = 0
    var j:Int = 1
    while (i < 10){

        print("Ingrese la nota " + j + ": ")
        var num = readLine()?.toInt() as Int

        if(num >= 0 && num <= 10){
            notas[i] = num

            if(notas[i] < 7){
                notasMenores7++
            }
            else{
                notasMayoresOiguales7++
            }

            i++
            j = i+1
        }
        else{
            println("Error: La nota ingresada debe de estar entre los valores 0 y 10")
        }
    }

    println("" + notasMayoresOiguales7 + " Alumnos tuvieron una nota mayor o igual a 7");
    println("" + notasMayoresOiguales7 + " Alumnos tuvieron una nota menor a 7");
}