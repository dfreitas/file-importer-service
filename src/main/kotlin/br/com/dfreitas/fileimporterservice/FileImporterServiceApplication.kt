package br.com.dfreitas.fileimporterservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FileImporterServiceApplication

fun main(args: Array<String>) {
    runApplication<FileImporterServiceApplication>(*args)
}
