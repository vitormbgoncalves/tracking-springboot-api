package com.github.vitormbgoncalves.pontointeligente.services

import com.github.vitormbgoncalves.pontointeligente.documents.Empresa


interface EmpresaService {
  fun buscarPorCNPJ(cnpj: String): Empresa?
  fun persistir(empresa: Empresa): Empresa
}