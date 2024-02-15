class Pistola(municion: Int, tipoDeMunicion: String, danio: Int, radio: TipoRadio): ArmaDeFuego("Pistola", municion, 1, tipoDeMunicion), Disparos {

    override var danio = danio
        set(value) {
            try {
                require(value in 1..5) {"DAÑO INTRODUCIDO INVALIDO"}
                field = value
            } catch (e: IllegalArgumentException){
                println(e.message)
            }
        }

    override var radio = radio
        set(value) {
            try {
                require(value.tipo == "Reducido" || value.tipo == "Corto") {"RADIO INTRODUCIDO INVALIDO"}
                field = value
            } catch (e: IllegalArgumentException){
                println(e.message)
            }
        }

    init {
        this.radio = radio
        this.danio = danio
    }


}