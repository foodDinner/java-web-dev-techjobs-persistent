package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
public class Skill extends AbstractEntity {

    @Id
    @GeneratedValue

    @NotBlank(message = "Required field")
    @Size(min = 3, max = 120, message = "Must be between 3 and 120 characters!")
    private String skill;

    public Skill(String skill) {
        super();
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return skill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Skill skill1 = (Skill) o;
        return Objects.equals(skill, skill1.skill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), skill);
    }
}