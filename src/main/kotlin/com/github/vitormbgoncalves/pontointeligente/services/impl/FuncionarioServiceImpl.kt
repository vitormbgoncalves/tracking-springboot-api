package com.github.vitormbgoncalves.pontointeligente.services.impl

import com.github.vitormbgoncalves.pontointeligente.documents.Funcionario
import com.github.vitormbgoncalves.pontointeligente.repositories.FuncionarioRepository
import com.github.vitormbgoncalves.pontointeligente.services.FuncionarioService
import org.springframework.stereotype.Service

@Service
class FuncionarioServiceImpl(val funcionarioRepository: FuncionarioRepository) : FuncionarioService {
  override fun persistir(funcionario: Funcionario): Funcionario = funcionarioRepository.save(funcionario)

  override fun buscarPorCpf(cpf: String): Funcionario? = funcionarioRepository.findByCpf(cpf)

  override fun buscarPorEmail(email: String): Funcionario? = funcionarioRepository.findByEmail(email)

  override fun buscarPorId(id: String): Funcionario? = funcionarioRepository.findById(id).get()
}