package QuanLy;

import Enum.Gender;

public class Person {
    private String name;
    private int age;
    private String id;
    private Gender gender;
    
    
    public Person() {
    }
    public Person(String name, int age, int g, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.gender = Gender.__getGender(g);
        
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setGender(int g)
    {
        this.gender = Gender.__getGender(g);
    }
    public Gender getGender(){
        return this.gender;
    }

    
}
