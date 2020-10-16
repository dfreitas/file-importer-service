package br.com.dfreitas.fileimporterservice.controller

import br.com.dfreitas.fileimporterservice.service.ImporterService
import org.springframework.web.bind.annotation.RestController

@RestController
class ImporterController(private val service: ImporterService) {
}