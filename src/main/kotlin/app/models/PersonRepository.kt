package app.models

import org.springframework.data.repository.CrudRepository
import java.util.Optional

interface PersonRepository : CrudRepository<Person, Long> {
    fun findByLastName(lastName: String): List<Person>
    //override fun findById(id: Long): Optional<Person>
}