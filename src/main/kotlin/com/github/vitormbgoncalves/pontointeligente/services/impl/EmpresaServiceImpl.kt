package com.github.vitormbgoncalves.pontointeligente.services.impl

import com.github.vitormbgoncalves.pontointeligente.documents.Empresa
import com.github.vitormbgoncalves.pontointeligente.repositories.EmpresaRepository
import com.github.vitormbgoncalves.pontointeligente.services.EmpresaService
import org.springframework.stereotype.Service

@Service
class EmpresaServiceImpl(val empresaRepository: EmpresaRepository) : EmpresaService {
  override fun buscarPorCNPJ(cnpj: String): Empresa? = empresaRepository.findByCnpj(cnpj)

  override fun persistir(empresa: Empresa): Empresa = empresaRepository.save(empresa)
}