package br.com.digitalhouse.dominio

import java.math.BigDecimal

class ColecaoDeLivro (val livros: MutableList<Livro>, codigo: String, preco: BigDecimal, descricao: String, qtdEstoque: Int )
    : Item(codigo, preco, descricao, qtdEstoque){

    override fun toString(): String {
        return "ColecaoDeLivro(${super.toString()}, livros=$livros)"
    }
}