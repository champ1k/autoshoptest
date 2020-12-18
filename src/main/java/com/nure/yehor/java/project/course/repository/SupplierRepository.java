package com.nure.yehor.java.project.course.repository;

import com.nure.yehor.java.project.course.entities.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
