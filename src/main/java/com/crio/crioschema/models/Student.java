package com.crio.crioschema.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

import java.util.List;

@Entity
public class Student extends BaseModel {
    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    private String password;

    //S : M
    //1 : M (one student can be enrolled in many modules)
    //M : 1 (one module can have many students)
    @ManyToMany(mappedBy = "enrolledStudents")
    private List<Module> enrolledModules;
}
