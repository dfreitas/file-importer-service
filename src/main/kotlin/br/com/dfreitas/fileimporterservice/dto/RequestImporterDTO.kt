package br.com.dfreitas.fileimporterservice.dto

import com.fasterxml.jackson.annotation.JsonFormat
import org.springframework.data.annotation.Id
import java.time.LocalDateTime

data class RequestImporterDTO (val type: String, val condition: String ){

}