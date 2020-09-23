package br.com.digitalhouse.dominio

import java.math.BigDecimal

class Livro ( codigo: String, titulo: String, autor: String, anoDeLancamento: Int, preco: BigDecimal,
              descricao: String, qtdEstoque: Int ) : Item(codigo, preco, descricao, qtdEstoque)