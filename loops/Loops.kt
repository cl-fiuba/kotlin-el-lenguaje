fun main() {

	val frutas = listOf("banana 🍌", "sandía 🍉", "durazno 🍑", "uvas 🍇")
	println("============ for loops")
	for (fruta in frutas) {
		println(fruta)
	}
	// otra opción
	for (indice in frutas.indices) {
		println("fruta en $indice es ${frutas[indice]}")
	}

	println("============ while loop")
	var indice = 0
	while (indice < frutas.size) {
		println("fruta en $indice es ${frutas[indice]}")
		indice++
	}
		
}

