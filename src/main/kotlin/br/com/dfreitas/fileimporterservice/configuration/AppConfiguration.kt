package br.com.dfreitas.fileimporterservice.configuration

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@Configuration
class AppConfiguration {

    /**
     * Bean to define how to jackson library will be serializer and deserializer LocalDate and LocalDateTime API.
     * The format defined is "yyyy-MM-dd" and "yyyy-MM-dd HH:mm:ss"
     */
    @Bean
    @Primary
    fun objectMapper(): ObjectMapper {
        val timeModule = JavaTimeModule()

        timeModule.addDeserializer(LocalDate::class.java,
                LocalDateDeserializer(DateTimeFormatter.ofPattern("yyyy-MM-dd")))

        timeModule.addDeserializer(LocalDateTime::class.java,
                LocalDateTimeDeserializer(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))

        timeModule.addSerializer(LocalDate::class.java,
                LocalDateSerializer(DateTimeFormatter.ofPattern("yyyy-MM-dd")))

        timeModule.addSerializer(LocalDateTime::class.java,
                LocalDateTimeSerializer(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))

        return ObjectMapper()
                //.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
                .setSerializationInclusion(JsonInclude.Include.NON_NULL)
                .registerModule(timeModule)
                .registerModule(ParameterNamesModule())
                .registerModule(Jdk8Module())

    }
}