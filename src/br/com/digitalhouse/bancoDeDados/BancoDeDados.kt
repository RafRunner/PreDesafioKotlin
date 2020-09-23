package br.com.digitalhouse.bancoDeDados

import br.com.digitalhouse.dominio.ColecaoDeLivro
import br.com.digitalhouse.dominio.Item
import br.com.digitalhouse.dominio.Livro
import java.lang.Exception

class BancoDeDados {

    val livros: MutableList<Livro> = mutableListOf()
    val colecoes: MutableList<ColecaoDeLivro> = mutableListOf()

    fun cadastrarLivro(livro: Livro) {
        for (l in livros) {
            if (l.codigo == livro.codigo) {
                throw Exception("Livro com mesmo código já cadastrado!")
            }
        }

        livros.add(livro)
    }

    fun cadastrarColecao(colecao: ColecaoDeLivro) {
        for (c in colecoes) {
            if (c.codigo == colecao.codigo) {
                throw Exception("Coleção com mesmo código já cadastrado!")
            }
        }

        colecoes.add(colecao)
    }

    fun consultarLivroPorCodigo(codigo: String): Item? {
        for (l in livros) {
            if (l.codigo == codigo) {
                return l
            }
        }

        for (c in colecoes) {
            if (c.codigo == codigo) {
                return c
            }
        }

        return null
    }

    fun registraVenda(codigo: String) {
        for (l in livros) {
            if (l.codigo == codigo) {
                l.qtdEstoque--
            }
        }

        for (c in colecoes) {
            if (c.codigo == codigo) {
                c.qtdEstoque--
            }
        }
    }
}