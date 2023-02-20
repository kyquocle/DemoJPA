package com.cybersoft.DemoJPA.entity;

import javax.persistence.*;

@Entity(name = "sub_job")
@IdClass(UserAndJobId.class)
public class SubJob {
//    @EmbeddedId
//    private UserAndJobId id;
//    @Column(name = "name_subjob")
//    private String nameSubJob;
//
//    public UserAndJobId getId() {
//        return id;
//    }
//
//    public void setId(UserAndJobId id) {
//        this.id = id;
//    }
//
//    public String getNameSubJob() {
//        return nameSubJob;
//    }
//
//    public void setNameSubJob(String nameSubJob) {
//        this.nameSubJob = nameSubJob;
//    }

    @Id
    private int userId;
    @Id
    private int jobId;
}

