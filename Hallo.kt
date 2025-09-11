
class Persona(
	val nombreCompleto: String,
	val nombreMateria: String,
	var peso: Int,
	var altura: Double,
	var edad: Int,
	var genero: String
) {
	fun esMayorDeEdad(): Boolean {
		return edad >= 18
	}

	fun saludar(saludo: String = "Hola") {
		println("$saludo, $nombreCompleto")
	}

	fun mostrarGenero() {
		println("Mi genero es $genero")
	}

	fun mostrarDatos() {
		println("$nombreCompleto, $nombreMateria.")
		println("Mi peso: $peso kg")
		println("Mi altura: $altura m")
		println("Mi edad: $edad años")
		val esEdadPar: Boolean = edad % 2 == 0
		println("¿Mi edad es par?: $esEdadPar")
		mostrarGenero()
		println("¿Soy mayor de edad?: ${esMayorDeEdad()}")
	}
}

fun main() {
	val persona = Persona(
		nombreCompleto = "Maria Belen Becerra Rivera",
		nombreMateria = "Aplicaciones Moviles",
		peso = 60,
		altura = 1.69,
		edad = 21,
		genero = "Femenino"
	)
	persona.mostrarDatos()
	persona.saludar()
}

