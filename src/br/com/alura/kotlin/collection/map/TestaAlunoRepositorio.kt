package br.com.alura.kotlin.collection.map

fun main() {

    val repositorio = AlunoRepositorio()

    val fernando = Aluno(
        rm = "RM101",
        nome = "Fernando",
        sobreNome = "Silva"
    )

    repositorio.adiciona(fernando)

    println(repositorio.carregaTodos())

}