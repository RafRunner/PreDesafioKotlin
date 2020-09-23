package br.com.digitalhouse.aplicacao

import br.com.digitalhouse.bancoDeDados.BancoDeDados
import br.com.digitalhouse.dominio.ColecaoDeLivro
import br.com.digitalhouse.dominio.Item
import br.com.digitalhouse.dominio.Livro
import java.lang.Exception

class Aplicacao {

    private val banco: BancoDeDados = BancoDeDados()

    fun cadastrarLivro(livro: Livro) {

        try {
            banco.cadastrarLivro(livro)
            println("Livro cadastrado com sucesso.")
        }
        catch (e:Exception) {
            println("Erro ao cadastrar livro: ${e.message}")
        }
    }

    fun cadastrarColecao(colecao: ColecaoDeLivro) {
        try {
            banco.cadastrarColecao(colecao)
            println("Coleção cadastrada com sucesso.")
        }
        catch (e:Exception) {
            println("Erro ao cadastrar coleção: ${e.message}")
        }
    }

    fun consultarLivroPorCodigo(codigo: String): Item? {

        val item = banco.consultarLivroPorCodigo(codigo)

        if (item == null) {
            println("Livro não encontrado.")
        }

        return item
    }

    fun efetuarVenda(codigo: String) {

        val item = banco.consultarLivroPorCodigo(codigo)

        if (item == null) {
            println("Livro não encontrado.")
            return
        }
        if (item.qtdEstoque == 0) {
            println("Estoque esgotado.")
            return
        }
        item.qtdEstoque--
        println("Estoque atualizado com sucesso.")
    }
}