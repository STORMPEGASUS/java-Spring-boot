package com.maven.Hibernate;


import jakarta.persistence.Embeddable;

@Embeddable
public class CertificateStud {

    private String courseName;
    private String duration;

    @Override
    public String toString() {
        return "CertificateStud{" +
                "courseName='" + courseName + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }

    public CertificateStud(){}

    public CertificateStud(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
