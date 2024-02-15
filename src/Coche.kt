class Coche(val marca: String, val modelo: String, val caballos: Int): Disparos {

    override fun dispara() {
        println("LUCES XENON MAXIMA POTENCIA EN TUS OJOS")
    }
    override fun toString(): String {
        return "Marca: $marca, Modelo: $modelo, Caballos: $caballos"
    }
}