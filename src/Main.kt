class Examen(nombres: Array<String>){
    val RespuestasCorrectas: CharArray = charArrayOf('a','c','b','a','d','b','b','c','a','a','b','d')
    val notas: FloatArray = FloatArray(4)
    var contadorExam: Int = 0

    val respuestasEstudiante = arrayOf(
        charArrayOf('a','c','b','a','d','b','b','c','a','a','b','d'),
        charArrayOf('b','c','b','d','d','b','b','a','b','d','b','d'),
        charArrayOf('c','c','b','a','a','b','c','c','a','a','b','c'),
        charArrayOf('a','c','b','a','d','b','b','c','a','a','b','c')
    )

    fun leerRespuestas(){


    }
}

fun main() {
val c = Examen(arrayOf("Marta", "Pedro", "Juan", "Maria"))

}