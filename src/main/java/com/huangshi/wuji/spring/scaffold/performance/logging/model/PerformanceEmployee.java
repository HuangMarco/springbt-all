package com.huangshi.wuji.spring.scaffold.performance.logging.model;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class PerformanceEmployee implements Serializable {

    private static final long serialVersionUID = 5517244812959569947L;

    private Long id;
    private String firstName;
    private String lastName;

    public PerformanceEmployee() {
        super();
    }

    public PerformanceEmployee(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }
}
