package br.com.digitalhouse

import br.com.digitalhouse.aplicacao.Aplicacao
import br.com.digitalhouse.dominio.ColecaoDeLivro
import br.com.digitalhouse.dominio.Livro
import java.math.BigDecimal

fun main() {

    val livro1 = Livro("123","Harry Potter","JKR",2000, BigDecimal(40),"Aventura/Fantasia", 10)
    val livro2 = Livro("456", "Senhor do Anéis", "Tolkien", 1954, BigDecimal(60), "Aventura/Fantasia", 1)
    val colecao1 = ColecaoDeLivro(mutableListOf(livro1, livro2), "789", BigDecimal(70), "Coleção de Fantasia",10)

    val app = Aplicacao()

    app.cadastrarLivro(livro1)
    app.cadastrarLivro(livro2)
    app.cadastrarColecao(colecao1)

    println(app.consultarLivroPorCodigo("123"))
    println(app.consultarLivroPorCodigo("000"))


    app.efetuarVenda("456")
    app.efetuarVenda("456")
    app.efetuarVenda("789")
    app.efetuarVenda("111")

}
