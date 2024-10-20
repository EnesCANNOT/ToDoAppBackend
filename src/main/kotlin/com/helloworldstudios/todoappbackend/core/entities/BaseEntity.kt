package com.helloworldstudios.todoappbackend.core.entities

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import java.time.Instant
import java.util.*

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
open class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long? = null

    @Column(name = "createdDate")
    var createdDate: Date? = null

    @Column(name = "updatedDate")
    var updatedDate: Date? = null

    @Column(name = "deletedDate")
    var deletedDate: Date? = null

    @PrePersist
    fun onCreate() {
        createdDate = Date.from(Instant.now())
        println(createdDate)
    }

    @PreUpdate
    fun onUpdate() {
        updatedDate = Date.from(Instant.now())
        println(updatedDate)
    }
}