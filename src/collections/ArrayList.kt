package collections

data class Frutas (val nome: String, var preco: Double)

fun main(args: Array<String>) {
    val frutas = arrayListOf(Frutas("Banana", 1.50), Frutas("Morango", 3.20))

    for(fruta in frutas) {
        println("${fruta.nome} - R$ ${fruta.preco}")
    }
}