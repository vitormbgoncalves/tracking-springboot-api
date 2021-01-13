package com.github.vitormbgoncalves.pontointeligente.repositories

import com.github.vitormbgoncalves.pontointeligente.documents.Lancamento
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.repository.MongoRepository

interface LancamentoRepository : MongoRepository<Lancamento, String> {

  fun findByFuncionarioId(FuncionarioId: String, pageable: Pageable): Page<Lancamento>
}