package com.springLearning.cources.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cource {
@Id
   private long courceid;
   private String coursename;
   private String Courcedesc;

    public long getCourceid() {
        return courceid;
    }

    public void setCourceid(long courceid) {
        this.courceid = courceid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getCourcedesc() {
        return Courcedesc;
    }

    public void setCourcedesc(String courcedesc) {
        Courcedesc = courcedesc;
    }
}
