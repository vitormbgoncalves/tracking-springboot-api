package com.github.vitormbgoncalves.pontointeligente.services

import com.github.vitormbgoncalves.pontointeligente.documents.Funcionario


interface FuncionarioService {

  fun persistir(funcionario: Funcionario): Funcionario
  fun buscarPorCpf(cpf: String): Funcionario?
  fun buscarPorEmail(email: String): Funcionario?
  fun buscarPorId(id: String): Funcionario?
}