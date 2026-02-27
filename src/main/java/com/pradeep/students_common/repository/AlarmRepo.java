package com.pradeep.students_common.repository;

import com.pradeep.students_common.entities.Alarm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlarmRepo extends JpaRepository<Alarm, Long> {

}
