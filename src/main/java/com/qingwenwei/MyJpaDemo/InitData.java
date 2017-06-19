package com.qingwenwei.MyJpaDemo;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.qingwenwei.MyJpaDemo.entity.Person;
import com.qingwenwei.MyJpaDemo.repository.PersonRepository;  

@Component
public class InitData {
	
    protected static Logger logger = LoggerFactory.getLogger(InitData.class);  
	
    @Autowired
	private PersonRepository personRepository;
    
	@PostConstruct
	private void start() {
		Boolean flag = true;
		if(flag)	 {
			this.init();
		}
	}
	
	private void init() {
		logger.info("InitData:init()");
		this.initPerson();
	}
	
	private void initPerson(){
		Set<Person> people = new HashSet<Person>();
		
		Person person1 = new Person("aaa",20);
		Person person2 = new Person("bbb",21);
		Person person3 = new Person("ddd",23);
		
		people.add(person1);
		people.add(person2);
		people.add(person3);
		
		this.personRepository.save(people);
	}
	
	
}
