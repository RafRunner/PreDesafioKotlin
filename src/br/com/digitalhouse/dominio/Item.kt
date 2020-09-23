package br.com.digitalhouse.dominio

import java.lang.Exception
import java.math.BigDecimal

open class Item(val codigo: String, preco: BigDecimal, val descricao: String, qtdEstoque: Int) {

    var preco: BigDecimal = BigDecimal.ZERO
        set(value) {
            if (value.compareTo(BigDecimal.ZERO) <= 0) {
                throw Exception("Valor inválido, deve ser maior que zero")
            }

            field = value
        }
    var qtdEstoque: Int = 0
        set(value) {
            if (value <= 0) {
                throw Exception("Quantidade inválida, deve ser maior que zero")
            }

            field = value
        }

    init {
        this.preco = preco
        this.qtdEstoque = qtdEstoque
    }
}