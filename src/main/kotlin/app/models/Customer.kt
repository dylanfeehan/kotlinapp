package app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
data class Customer(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,
    val firstName: String,
    val lastName: String
) {
    constructor() : this(null, "", "")

    override fun toString(): String {
        return "Customer[id=$id, firstName='$firstName', lastName='$lastName']"
    }
}