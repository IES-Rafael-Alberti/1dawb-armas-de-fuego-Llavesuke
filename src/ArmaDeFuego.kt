import kotlin.math.abs

abstract class ArmaDeFuego(private val nombre: String,
                           private var municion: Int,
                           private val municionARestar: Int,
                           private val tipodeMunicion: String) {
    companion object{
        var cajaDeMunicion = (5..15).random()
    }

    abstract var danio: Int

    abstract var radio: TipoRadio

    open fun dispara() {
        when {
            municion - municionARestar >= 0 -> {
                println("${this.nombre} dispara. Municion restante: ${this.municion}" )
                municion -= municionARestar
            }

            municion - municionARestar < 0 -> {
                if (cajaDeMunicion - abs(municion - municionARestar) < 0 ) {
                    println("No ha podido recargase")
                } else {
                    this.recarga()
                    municion -= municionARestar
                }
            }
        }
    }

    open fun recarga(){
        when {
            cajaDeMunicion - municionARestar*2 >= 0 -> {
                cajaDeMunicion - municionARestar*2
                municion += municionARestar*2
                println("Arma recargada")
            }

            cajaDeMunicion - municionARestar*2 < 0 -> {
                if (cajaDeMunicion - municionARestar > 0) {
                    cajaDeMunicion -= municionARestar
                    municion += municionARestar
                    println("Arma recargada")
                } else println("No se ha podido recargar el arma por falta de munición")
            }
        }
    }

    override fun toString(): String {
        return "Nombre: ${this.nombre} Municion: ${this.municion}, Tipo de Munición: ${this.tipodeMunicion}, Daño: ${this.danio}," +
                " Radio: ${this.radio.tipo} "
    }
}