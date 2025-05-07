package com.bellamyphan.microservice_school.repository;

import com.bellamyphan.microservice_school.model.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {
    // Jpa will automatically implement the basic CRUD operations
}
