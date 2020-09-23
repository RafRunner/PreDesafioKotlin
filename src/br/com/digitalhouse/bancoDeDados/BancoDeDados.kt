package br.com.digitalhouse.bancoDeDados

import br.com.digitalhouse.dominio.ColecaoDeLivro
import br.com.digitalhouse.dominio.Item
import br.com.digitalhouse.dominio.Livro
import java.lang.Exception

class BancoDeDados {

    val livros: MutableList<Livro> = mutableListOf()
    val colecoes: MutableList<ColecaoDeLivro> = mutableListOf()

    private fun checkSeNaoDuplicado(codigo: String) {
        if (livros.any { it.codigo == codigo }
                || colecoes.any { it.codigo == codigo }) {
            throw Exception("Livro ou Coleção com mesmo código já cadastrado!")
        }
    }

    fun cadastrarLivro(livro: Livro) {
        checkSeNaoDuplicado(livro.codigo)
        livros.add(livro)
    }

    fun cadastrarColecao(colecao: ColecaoDeLivro) {
        checkSeNaoDuplicado(colecao.codigo)
        colecoes.add(colecao)
    }

    fun consultarLivroPorCodigo(codigo: String): Item? {
        val livro = livros.find { it.codigo == codigo }
        if (livro != null) {
            return livro
        }

        return colecoes.find { it.codigo == codigo }
    }
}