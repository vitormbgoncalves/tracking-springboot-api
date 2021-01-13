package com.github.vitormbgoncalves.pontointeligente.repositories

import com.github.vitormbgoncalves.pontointeligente.documents.Empresa
import org.springframework.data.mongodb.repository.MongoRepository

interface EmpresaRepository: MongoRepository<Empresa, String> {

  fun findByCnpj(cnpj: String) : Empresa?
}