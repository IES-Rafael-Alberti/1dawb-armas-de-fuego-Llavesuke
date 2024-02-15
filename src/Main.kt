
val pistolita = Pistola(6,"Calibre 50", 4, TipoRadio.CORTO)
val ak47 = Rifle(30,"Balas explosivas", 10, TipoRadio.INTERMEDIO)
val lanzapepos = Bazooka(30,"DUM-DUM", 10, TipoRadio.ENORME)

val casita = Casa("NarutoO", 500)
val cochecito = Coche("Toyota", "AE86", 150)
val bocata = Bocadillo(listOf("Jamon, Lechuga, Pollo"))

val armas: List<Disparos> = listOf(pistolita, ak47, lanzapepos,casita, cochecito, bocata)

fun main(){
    println("Municion extra = ${ArmaDeFuego.cajaDeMunicion} para todas las armas")

    val disparos = (1..9).map {armas.random() to (1..3).random() }

    var contadorDisparos = 1

    for ((arma, veces) in disparos){

        println("Disparo $contadorDisparos")
        repeat(veces){
            arma.dispara()
            println(arma)
        }
        contadorDisparos++
    }

    for (i in 1..9){
        println()
    }

}