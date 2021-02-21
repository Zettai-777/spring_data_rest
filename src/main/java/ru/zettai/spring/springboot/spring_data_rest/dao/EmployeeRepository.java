package ru.zettai.spring.springboot.spring_data_rest.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.zettai.spring.springboot.spring_data_rest.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
