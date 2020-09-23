package br.com.digitalhouse.dominio

import java.math.BigDecimal

class ColecaoDeLivro (livros: MutableList<Livro>, codigo: String, preco: BigDecimal, descricao: String, qtdEstoque: Int ) :
                      Item(codigo, preco, descricao, qtdEstoque) {

}