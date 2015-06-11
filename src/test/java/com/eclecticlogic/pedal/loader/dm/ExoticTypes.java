package com.eclecticlogic.pedal.loader.dm;

// Generated May 28, 2014 8:44:27 AM by Hibernate Tools 4.3.1

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;

import com.eclecticlogic.pedal.dialect.postgresql.CopyEmptyAsNull;
import com.eclecticlogic.pedal.provider.hibernate.ArrayType;
import com.eclecticlogic.pedal.provider.hibernate.dialect.PostgresqlArrayPrimitiveName;

/**
 * ExoticTypes generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "exotic_types")
public class ExoticTypes implements java.io.Serializable {

    private String login;
    private List<Boolean> countries;
    private Set<String> authorizations;
    private List<Long> scores;
    private List<Long> gpa;
    private Status status;
    private String custom;
    

    @Id
    @Column(name = "login", unique = true, nullable = false)
    public String getLogin() {
        return this.login;
    }


    public void setLogin(String login) {
        this.login = login;
    }


    @Column(name = "countries", nullable = false)
    @Type(type = "com.eclecticlogic.pedal.provider.hibernate.dialect.PostgresqlBitStringUserType")
    public List<Boolean> getCountries() {
        return this.countries;
    }


    public void setCountries(List<Boolean> countries) {
        this.countries = countries;
    }


    @Column(name = "authorizations", nullable = false)
    @Type(type = "com.eclecticlogic.pedal.provider.hibernate.SetType", parameters = @Parameter(name = ArrayType.DIALECT_PRIMITIVE_NAME, value = PostgresqlArrayPrimitiveName.STRING))
    public Set<String> getAuthorizations() {
        return this.authorizations;
    }


    public void setAuthorizations(Set<String> authorizations) {
        this.authorizations = authorizations;
    }


    @Column(name = "scores")
    @Type(type = "com.eclecticlogic.pedal.provider.hibernate.ListType", parameters = { @Parameter(name = ArrayType.DIALECT_PRIMITIVE_NAME, value = PostgresqlArrayPrimitiveName.LONG) })
    @CopyEmptyAsNull
    public List<Long> getScores() {
        return this.scores;
    }


    public void setScores(List<Long> scores) {
        this.scores = scores;
    }


    @Column(name = "gpa")
    @Type(type = "com.eclecticlogic.pedal.provider.hibernate.ListType", parameters = {
            @Parameter(name = ArrayType.DIALECT_PRIMITIVE_NAME, value = PostgresqlArrayPrimitiveName.LONG),
            @Parameter(name = ArrayType.EMPTY_IS_NULL, value = "false") })
    public List<Long> getGpa() {
        return gpa;
    }


    public void setGpa(List<Long> gpas) {
        this.gpa = gpas;
    }


    @Column(name = "status", nullable = false, length = 2)
    @Convert(converter = StatusConverter.class)
    public Status getStatus() {
        return status;
    }


    public void setStatus(Status status) {
        this.status = status;
    }


    @Column(name = "custom", nullable = false)
    public String getCustom() {
        return custom;
    }


    
    public void setCustom(String custom) {
        this.custom = custom;
    }

    
}