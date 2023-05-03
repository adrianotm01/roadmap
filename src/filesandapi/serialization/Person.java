package filesandapi.serialization;

import java.io.Serializable;

public class Person implements Serializable {

    private String gender;

    private String name;

    private Integer age;

    public Person() {
    }

    public Person(String gender, String name, Integer age) {
        this.gender = gender;
        this.name = name;
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
