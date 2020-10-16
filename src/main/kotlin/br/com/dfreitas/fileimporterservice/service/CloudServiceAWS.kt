package br.com.dfreitas.fileimporterservice.service

import org.springframework.stereotype.Component

@Component
class CloudServiceAWS: CloudService {
    override fun fileUpload(bucketName: String, fileName: String, fileContent: ByteArray, profileName: String, region: String): Boolean {
        TODO("Not yet implemented")
    }
}