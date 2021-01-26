package com.github.vitormbgoncalves.pontointeligente.controllers

import com.github.vitormbgoncalves.pontointeligente.documents.Empresa
import com.github.vitormbgoncalves.pontointeligente.dtos.EmpresaDto
import com.github.vitormbgoncalves.pontointeligente.response.Response
import com.github.vitormbgoncalves.pontointeligente.services.EmpresaService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/empresas")
class EmpresaController(val empresaService: EmpresaService) {

  @GetMapping(value = ["/cnpj/{cnpj}"])
  fun buscaPorCnpj(@PathVariable("cnpj") cnpj: String): ResponseEntity<Response<EmpresaDto>> {
    val response: Response<EmpresaDto> = Response<EmpresaDto>()
    val empresa: Empresa? = empresaService.buscarPorCNPJ(cnpj)

    if(empresa == null) {
      response.erros.add("Empresa Não encontrada para o CNPJ ${cnpj}")
      return ResponseEntity.badRequest().body(response)
    }

    response.data = converterEmpresaDto(empresa)
    return ResponseEntity.ok(response)
  }

  private fun converterEmpresaDto(empresa: Empresa): EmpresaDto =
    EmpresaDto(empresa.razaoSocial, empresa.cnpj, empresa.id)
}