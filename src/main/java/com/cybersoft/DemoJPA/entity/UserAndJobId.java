package com.cybersoft.DemoJPA.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;

//@Embeddable
public class UserAndJobId implements Serializable {
    @Column(name = "user_id")
    int userId;
    @Column(name = "job_id")
    int jobId;

    public UserAndJobId() {
    }
}
