package com.helloworldstudios.todoappbackend.core.entities

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import java.time.LocalDateTime

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
    var createdDate: LocalDateTime? = null

    @Column(name = "updatedDate")
    var updatedDate: LocalDateTime? = null

    @Column(name = "deletedDate")
    var deletedDate: LocalDateTime? = null

    @PrePersist
    fun onCreate() {
        createdDate = LocalDateTime.now()
    }

    @PreUpdate
    fun onUpdate() {
        updatedDate = LocalDateTime.now()
    }
}