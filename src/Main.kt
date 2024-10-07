
    import kotlin.math.roundToInt
class Examen(val nombres: Array<String>) {
    val plantilla: Array<Char> = arrayOf('a', 'c', 'b', 'a', 'd', 'b', 'b', 'c', 'a', 'a', 'b', 'd')
    var notas = FloatArray(4)
    val respuestas= Array(4) { CharArray(12) }
    var contador = 0

    fun leerRespuestas(respuestasEstudiante: CharArray) {
        if (contador < 4) {
            respuestas[contador] = respuestasEstudiante
            contador++
        }
    }

    fun calculaNota(respuestas: Array<CharArray>, plantilla: Array<Char>, notas: FloatArray) {
        for (f in respuestas.indices) {
            var correctas = 0
            for (c in respuestas[f].indices) {
                if (respuestas[f][c] == plantilla[c]) {
                    correctas++
                }
            }
            notas[f] = (correctas * 100/12.0f)
        }
    }

    fun promedioGrupo(): Float {
        return notas.average().toFloat()
    }

    fun NotaMayor(): String {
        var mayor = notas[0]
        var nombre = 0
        for (i in notas.indices) {
            if (notas[i] > mayor) {
                mayor = notas[i]
                nombre = i
            }
        }
        return nombres[nombre]
    }

    fun ToString() {
            println("________________________________________________________________________________")
        for (i in 0 until 4) {
            calculaNota(respuestas, plantilla, notas)
            val estados = estadoNota(notas)
            println("Estudiante: ${nombres[i]} Respuestas: ${respuestas[i].joinToString(" ")}  Notas: ${(notas[i] * 100.0).roundToInt() / 100.0} ${estados[i]}")
        }
            println()
            println("Promedio del grupo: ${promedioGrupo()}")
            val MejorNota = NotaMayor()
            println("El estudiante con mayor nota es $MejorNota.")
            println("________________________________________________________________________________")
    }

    fun estadoNota(notas: FloatArray): Array<String> {
        val estados = Array(notas.size) {""}
        for (i in notas.indices) {
            estados[i] = when {
                notas[i] >= 70.0f -> "Aprobó"
                notas[i] < 70.0f && notas[i] >= 60.0f -> "Aplazó"
                else -> "Reprobó"
            }
        }
        return estados
    }
}

fun main() {
    val Examen = Examen(arrayOf("Marta", "Pedro", "Juan ", "María"))

    Examen.leerRespuestas(charArrayOf('a', 'c', 'b', 'a', 'd', 'b', 'b', 'c', 'a', 'a', 'b', 'd'))
    Examen.leerRespuestas(charArrayOf('b', 'c', 'b', 'd', 'd', 'b', 'b', 'a', 'b', 'd', 'b', 'd'))
    Examen.leerRespuestas(charArrayOf('c', 'c', 'b', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'b', 'c'))
    Examen.leerRespuestas(charArrayOf('c', 'c', 'b', 'a', 'd', 'b', 'b', 'c', 'a', 'a', 'b', 'c'))

    Examen.ToString()
}
