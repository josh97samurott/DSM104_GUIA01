fun main(args: Array<String>){
    var x:Int
    var y:Int
    var primerc:Int = 0
    var segundoc:Int = 0
    var tercerc:Int = 0
    var cuartoc:Int = 0

    println("¡PUNTOS EN EL PLANO CARTESIANO!")
    println("¿Cuantos puntos en el plano ingresará? ")

    var i:Int = readLine()?.toInt() as Int
    var j:Int = 0
    var k:Int

    while(j < i){
        k = j+1
        println("("+k+") Ingresando punto en el plano")
        print("Ingrese la coordenada x: ")
        x = readLine()?.toInt() as Int
        print("Ingrese la coordenada y: ")
        y = readLine()?.toInt() as Int

        if(x>0 && y>0){
            println("El punto ("+x+","+y+") se encuentra en el primer cuadrante del plano cartesiano")
            primerc++
        }

        if(x>0 && y<0){
            println("El punto ("+x+","+y+") se encuentra en el cuarto cuadrante del plano cartesiano")
            cuartoc++
        }

        if(x<0 && y>0){
            println("El punto ("+x+","+y+") se encuentra en el segundo cuadrante del plano cartesiano")
            segundoc++
        }

        if(x<0 && y<0){
            println("El punto ("+x+","+y+") se encuentra en el tercer cuadrante del plano cartesiano")
            tercerc++
        }

        println("-------------------------------------")

        j++
    }

    println("Se ingresaron "+primerc+" puntos en el primer cuadrante del plano cartesiano")
    println("Se ingresaron "+segundoc+" puntos en el primer cuadrante del plano cartesiano")
    println("Se ingresaron "+tercerc+" puntos en el primer cuadrante del plano cartesiano")
    println("Se ingresaron "+cuartoc+" puntos en el primer cuadrante del plano cartesiano")
}