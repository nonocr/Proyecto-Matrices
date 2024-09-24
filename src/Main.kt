class Examen( val nombres: Array<String>){
    val plantilla = charArrayOf('a','c','b','a','d','b','b','c','a','a','b','d')
    val notas = FloatArray(4)
    var contador = 0
    val respuestas = Array(4) { CharArray(12) }


    fun leerRespuestas(RespuestasEstudiante: CharArray){
        if (contador < 4) {
            respuestas[contador] = RespuestasEstudiante
            contador++
    }

    fun calcularNota(){
        for (f in 0 until 4) {
            var correctas = 0
            for (c in 0 until 12) {
                if (respuestas[f][c] == plantilla[c]) {
                    correctas++
                }
                notas[f] = (correctas.toFloat() / 12 * 100)
    }

    fun promedioGrupo(): Float{
        return notas.average().toFloat()
    }

    fun mayorNota(){
        var notaMayor = 0
        for (i in 1 until notas.size) {
            if (notas[i] > notas[notaMayor]) {
                notaMayor = i
    }
            println(notaMayor)

    fun toString(){
        for (i in 0 until 4){
            println("Estudiante: ${nombres[f]} Respuestas: ${respuestas[f]} Nota: ${notas[f]}")
            when {
                notas[i] >= 70 -> println("Aprobó")
                notas[i] >= 60 -> println("Aplazó")
            }
        }
    }
        }}}}}}


