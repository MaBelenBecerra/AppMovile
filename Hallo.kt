fun saludarPersona(saludo: String = "Hola", nombreCompleto: String) {
    println("$saludo, $nombreCompleto")
    
}

fun obtenerMensajeGenero(genero: String) {
    println("Mi genero es $genero")
}

fun main() {
    val nombreCompleto = "Maria Belen Becerra Rivera"
    val nombreMateria = "Aplicaciones Moviles"

    println("$nombreCompleto, $nombreMateria.")
    
    var peso: Int = 60
	println("Mi peso: $peso kg")

	var altura: Double = 1.69
	println("Mi altura: $altura m")

	var edad: Int = 21
	println("Mi edad: $edad años")

	var esEdadPar: Boolean = edad % 2 == 0
	println("¿Mi edad es par?: $esEdadPar")

	var genero: String = "Femenino"
	println("Mi genero: $genero")
    
    
    saludarPersona(nombreCompleto = "Maria Belen Becerra Rivera")
    obtenerMensajeGenero(genero)
}

