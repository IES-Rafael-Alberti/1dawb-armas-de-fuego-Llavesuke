class Casa(val nombre: String, val m2: Int): Disparos {

    override fun dispara() {
        println("TOOOOOOOOOOOOMA CONFETTI")
    }
    override fun toString(): String {
        return "Casa $nombre m2: $m2"
    }
}