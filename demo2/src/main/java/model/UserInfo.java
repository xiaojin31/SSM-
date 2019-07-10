package model;

import javax.persistence.criteria.CriteriaBuilder;

public class UserInfo {
    private Integer id;
    private String nickName;
    private String password;
    private String phone;
    private Integer age;
    private Integer gender;

    public UserInfo(){}

    public UserInfo(Integer id, String nickName, String password, String phone, Integer age, Integer gender) {
        this.id = id;
        this.nickName = nickName;
        this.password = password;
        this.phone = phone;
        this.age = age;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

}
