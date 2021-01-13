package com.github.vitormbgoncalves.pontointeligente.repositories

import com.github.vitormbgoncalves.pontointeligente.documents.Funcionario
import org.springframework.data.mongodb.repository.MongoRepository

interface FuncionarioRepository : MongoRepository<Funcionario, String>{

  fun findByEmail(email: String): Funcionario?

  fun findByCpf(cpf: String): Funcionario?

  fun findById(): Funcionario?
}