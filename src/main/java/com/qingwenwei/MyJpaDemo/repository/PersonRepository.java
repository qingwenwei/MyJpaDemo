package com.qingwenwei.MyJpaDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qingwenwei.MyJpaDemo.entity.Person;

public interface PersonRepository extends JpaRepository<Person,Long>{

}
