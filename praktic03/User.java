package praktic03;

import java.util.List;

public class User implements Comparable<User> {
    private String firstName;
    private String lastName;
    private Integer age;
    private Personal subordinates;

    public Personal getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<User> subordinates) {
        this.subordinates = new Personal(subordinates);

    }

    public User(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {

        return String.format("Имя: %s, Фамилия: %s, Возраст: %d\n", firstName, lastName, age);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;

    }

    @Override
    public int compareTo(User o) {
        return (this.firstName + this.lastName).compareTo(o.firstName + o.lastName);
        // if (this.age == o.age) {
        // return 0;
        // }
        // if (this.age < o.age) {
        // return -1;
        // }
        // return 1;
    }

}
