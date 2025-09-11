
enum class Genero {
	Mujer, Hombre, Otro
}

fun saludo(mensaje: String, nombre: String) {
	println("$mensaje $nombre")
}

fun generoComoTexto(genero: Genero): String {
	return when (genero) {
		Genero.Hombre -> "Hombre"
		Genero.Mujer -> "Mujer"
		Genero.Otro -> "Otro"
	}
}

fun mostrarGenero(genero: Genero) {
	println("Mi genero es: ${generoComoTexto(genero)}")
}

fun main() {
	val nombre = "Maria Belen Becerra Rivera"
	saludo("Hola a todos, yo soy:", nombre) //Hola a todos, yo soy: Maria Belen Becerra Rivera
	val materia = "Aplicaciones Moviles"
	println("La materia es: $materia")
	val peso : Int = 60
	val altura : Double = 1.69
	var edad : Int = 21
	println("Yo peso: $peso kg")
	println("Y mido: $altura metros")
	println("Tengo $edad años")
	var es_par : Boolean = (edad % 2 == 0)
	if (es_par) { println("Mi edad es par.") }
	else { println("Mi edad es impar.") }
	val genero = Genero.Mujer
	println(generoComoTexto(genero))
}

