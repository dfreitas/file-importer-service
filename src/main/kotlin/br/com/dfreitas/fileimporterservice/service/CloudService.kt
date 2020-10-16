package br.com.dfreitas.fileimporterservice.service

interface CloudService {
    fun fileUpload(bucketName: String, fileName: String, fileContent: ByteArray, profileName: String, region: String): Boolean

}