package com.company;

public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) throws IllegalNameLengthException {
        this.name = name;
        if (name.length() > 20) {
            throw new IllegalNameLengthException("Длина имени не может быть больше 20 символов");
        }
    }

    public void setAge(int age)  {
        this.age = age;
        if (age < 1 || age > 100){
            try {
                throw new IllegalAgeException ("Возраст не может между 1 и 100");
            } catch (IllegalAgeException e) {
                e.printStackTrace();
            }
        }
    }
}
