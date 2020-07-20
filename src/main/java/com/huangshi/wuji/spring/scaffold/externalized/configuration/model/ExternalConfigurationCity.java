package com.huangshi.wuji.spring.scaffold.externalized.configuration.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Getter
@Setter
@Component
public class ExternalConfigurationCity {

    private Long id;
    private String name;
    private int population;

    public ExternalConfigurationCity() { }

    public ExternalConfigurationCity(Long id, String name, int population) {
        this.id = id;
        this.name = name;
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExternalConfigurationCity city = (ExternalConfigurationCity) o;
        return population == city.population &&
                Objects.equals(id, city.id) &&
                Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, population);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ExternalConfigurationCity{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", population=").append(population);
        sb.append('}');
        return sb.toString();
    }


}
