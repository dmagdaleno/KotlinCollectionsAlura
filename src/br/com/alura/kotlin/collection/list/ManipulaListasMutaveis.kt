package br.com.alura.kotlin.collection.list

fun main() {

    val prateleira = PrateleiraMutavel(genero = "Literatura", livros = listaDeLivros())

    println(prateleira.livrosOrdenadosPorAutor())
    println(prateleira.livrosOrdenadosPorAnoPublicacao())

    val porAutor: List<Livro> = prateleira.livrosOrdenadosPorAutor()
    val porAnoPublicacao: List<Livro> = prateleira.livrosOrdenadosPorAnoPublicacao()

    println(porAutor)
    println(porAnoPublicacao)

}

private fun PrateleiraMutavel.livrosOrdenadosPorAutor(): List<Livro> {
    this.livros.sortBy { it.autor }
    return this.livros
}

private fun PrateleiraMutavel.livrosOrdenadosPorAnoPublicacao(): List<Livro> {
    this.livros.sortBy { it.anoPublicacao }
    return this.livros
}