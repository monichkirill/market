package com.tms.model;

import com.tms.annotation.LogAnnotation;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;

@Scope("prototype")
@Component("adam")
public class User {
    private Long id;
    private String firstname;

    private Security securityInfo;

    @Autowired
    public User(@Qualifier(value = "security") Security securityInfo) {
        this.securityInfo = securityInfo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Security getSecurityInfo() {
        return securityInfo;
    }

    public void setSecurityInfo(Security securityInfo) {
        this.securityInfo = securityInfo;
    }

    @PostConstruct
    public void init() {
        System.out.println("Creating user bean ...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroing user bean ...");
    }

    @LogAnnotation
    public void showInfoAboutMe() {
        System.out.println("User info about me IN");
        printInfoAboutMe();
        System.out.println("User info about me OUT");
    }

    @LogAnnotation
    public void printInfoAboutMe() {
        System.out.println("User info print about me IN");
        System.out.println("User info print about me OUT");
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", securityInfo=" + securityInfo +
                '}';
    }
}