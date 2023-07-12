package com.crio.crioschema.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class StudentModuleExam extends BaseModel {
    //SME : S
    // 1 : 1 (one sme can be related to only one student)
    // M : 1 (one student can be related to many module exams)
    @ManyToOne
    private Student student;

    //SME : ME
    //1 : 1 (one sme can be present in one module exam)
    //M : 1 (one me can have many student module)
    @ManyToOne
    private ModuleExam moduleExam;
    private int marks;
}
