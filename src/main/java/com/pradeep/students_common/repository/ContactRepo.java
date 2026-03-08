package com.pradeep.students_common.repository;

import com.pradeep.students_common.entities.ContactInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepo extends JpaRepository<ContactInfo, String> {
}
