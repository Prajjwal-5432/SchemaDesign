package com.crio.crioschema.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.Date;

@Entity
public class ModuleExam extends BaseModel {
    @ManyToOne
    private Module module;

    // ME : E
    // 1 : 1 (one module exam is related to one exam)
    // M : 1 (one exam can be in many modules)
    @ManyToOne
    private Exam exam;
    private Date dateOfExam;
}

//if the type of an attribute of a class is
//a data type that is also being persisted
// => we are talking about relation between two classes
//=> we must specify what is the cardinaltiy of relation
//   so that Spring Boot can create tables appropriately

//Cardinality between ModuleExam and Module
//1 moduleexam can belong to only one module
//1 module can have many exams;
//ModuleExam : Module
// so for module exam 1:1
// for Module M : 1