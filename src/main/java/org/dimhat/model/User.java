package org.dimhat.model;

/**
 * @author : zwj
 * @data : 2016/10/25
 */
public class User {

    private Long id;

    private String name;

    private Integer age;

    public Long getId() {
        return id;
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

    public void setId(Long id) {
        this.id = id;
    }
}
