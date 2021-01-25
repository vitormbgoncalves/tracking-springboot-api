package com.github.vitormbgoncalves.pontointeligente.dtos

import javax.validation.constraints.Email
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.Size

class FuncionarioDto (

  @get:NotEmpty(message = "Nome não pode ser vazio.")
  @get:Size(min = 3, max = 200, message = "Nome deve conter entre 3 e 200 caracteres.")
  val nome: String = "",

  @get:NotEmpty(message = "Email não pode ser vazio.")
  @get:Size(min = 5, max = 200, message = "Nome deve conter entre 5 e 200 caracteres.")
  @get:Email(message = "Email inválido.")
  val email: String = "",

  val senha: String? = null,
  val valorHora: String? = null,
  val qtdHorasTrabalhoDia: String? = null,
  val qtdHorasAlmoco: String? = null,
  val id: String? = null
)