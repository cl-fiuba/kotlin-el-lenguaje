fun main() {
	val x = 10
	val y = 9
	if (x in 1..y+1) {
		println("El valor entra")
	}

	val lista = listOf(1, 23, 43, 21)
	if(-1 !in 0..lista.lastIndex) {
		println("-1 no está en el rango")
	}

	if (lista.size !in lista.indices) {
		println("El tamaño de la lista está fuera de rango también")
	}

	println("=========== Se puede iterar un range")
	for (x in -1..4) {
		println(x)
	}

	println("=========== O una progresión")
	for (x in -1..10 step 2) {
		println(x)
	}

	println("=========== Y yendo para abajo")
	for (x in 9 downTo 0 step 3) {
		println(x)
	}
	
}
