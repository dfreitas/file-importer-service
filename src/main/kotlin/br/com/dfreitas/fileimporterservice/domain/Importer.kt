package br.com.dfreitas.fileimporterservice.domain

import br.com.dfreitas.fileimporterservice.dto.RequestImporterDTO
import com.fasterxml.jackson.annotation.JsonFormat
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document
data class Importer (
        @Id
        val id: String? = null,
        val type: String,
        val condition: String?,
        val originalFileName: String,
        val contentyType: String?,
        val fileName: String?,
        val idUser: String,
        val username: String,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
        val createdDate: LocalDateTime = LocalDateTime.now(),
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
        var modifiedDate: LocalDateTime = LocalDateTime.now(),
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
        var processedDate: LocalDateTime

) {

}