class Rifle(municion: Int, tipoDeMunicion: String, danio: Int, radio: TipoRadio): ArmaDeFuego("Rifle", municion, 2, tipoDeMunicion), Disparos {
    override var danio = danio
        set(value) {
            try {
                require(value in 5..10) {"DAÑO INTRODUCIDO INVALIDO"}
                field = value
            } catch (e: IllegalArgumentException){
                println(e.message)
            }
        }

    override var radio = radio
        set(value) {
            try {
                require(value.tipo == "Intermedio" || value.tipo == "Corto") {"RADIO INTRODUCIDO INVALIDO"}
                field = value
            } catch (e: IllegalArgumentException){
                println(e.message)
            }
        }
}