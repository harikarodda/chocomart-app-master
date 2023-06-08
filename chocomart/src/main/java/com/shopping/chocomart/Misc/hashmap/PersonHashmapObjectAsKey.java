package com.shopping.chocomart.Misc.hashmap;

public class PersonHashmapObjectAsKey {
    private String name;
    private int age;

    // Constructor
    public PersonHashmapObjectAsKey(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters

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

    // Implementing equals() method
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersonHashmapObjectAsKey)) {
            return false;
        }
        PersonHashmapObjectAsKey other = (PersonHashmapObjectAsKey) obj;
        return name.equals(other.name) && age == other.age;
    }

    // Implementing hashCode() method
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + age;
        return result;
    }
}
