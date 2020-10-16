package br.com.dfreitas.fileimporterservice.repository

import br.com.dfreitas.fileimporterservice.domain.Importer
import org.springframework.data.mongodb.repository.MongoRepository

interface ImporterRepository: MongoRepository<Importer, String> {

}