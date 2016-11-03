/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.glaive.json;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author yy
 */
public class MetaData {
    private String name;
    private int age;
    private String position;
    private BigDecimal salary;
    private List<String> skills;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public List<String> getSkills() {
        return skills;
    }
    
    public MetaData()
    {
    }

    public MetaData(String name, int age, String position, BigDecimal salary, List<String> skills) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.skills = skills;
    }
    
    
}
