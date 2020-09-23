package br.com.digitalhouse.dominio

import java.math.BigDecimal

class Livro (codigo: String, val titulo: String, val autor: String, val anoDeLancamento: Int, preco: BigDecimal,
              descricao: String, qtdEstoque: Int)
    : Item(codigo, preco, descricao, qtdEstoque) {

    override fun toString(): String {
        return "Livro(${super.toString()}, titulo='$titulo', autor='$autor', anoDeLancamento=$anoDeLancamento)"
    }
}