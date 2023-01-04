package net.javaguides.studentmanagmentsystem.repository;

import net.javaguides.studentmanagmentsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {

}
