package software.ulpgc;

import java.time.LocalDate;

public class Person {
    public static final int daysPerPerson = 365;
    public final String name;
    public final LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        return toDays(LocalDate.now().toEpochDay() - birthDate.toEpochDay());
    }

    private int toDays(long days) {
        return (int) (days / daysPerPerson);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", age" + getAge() +
                '}';
    }
}
