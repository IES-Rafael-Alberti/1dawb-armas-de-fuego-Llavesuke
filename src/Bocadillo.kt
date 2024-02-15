class Bocadillo(val ingredientes: List<String>): Disparos {

    override fun dispara() {
        println("QUE OLOR A JAMON LOCO")
    }
    override fun toString(): String {
        return "${ingredientes.joinToString { ", " }}"
    }
}