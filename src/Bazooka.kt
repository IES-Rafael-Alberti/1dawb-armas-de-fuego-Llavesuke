class Bazooka(municion: Int, tipoDeMunicion: String, danio: Int, radio: TipoRadio): ArmaDeFuego("Bazooka Fortnite", municion, 3, tipoDeMunicion), Disparos {
    override var danio = danio
        set(value) {
            try {
                require(value in 10..30) {"DAÑO INTRODUCIDO INVALIDO"}
                field = value
            } catch (e: IllegalArgumentException){
                println(e.message)
            }
        }

    override var radio = radio
        set(value) {
            try {
                require(value.tipo == "Intermedio" || value.tipo == "Enorme") {"RADIO INTRODUCIDO INVALIDO"}
                field = value
            } catch (e: IllegalArgumentException){
                println(e.message)
            }
        }
}