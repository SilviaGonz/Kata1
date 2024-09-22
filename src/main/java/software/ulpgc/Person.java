package software.ulpgc;

import java.time.LocalDate;

public class Person {
    public static final int daysPerPerson = 365;
    public final String name;
    public final LocalDate birthDate;

    public Person(LocalDate birthDate, String name) {
        this.birthDate = birthDate;
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getName() {
        return name;
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
                "birthDate=" + birthDate +
                "age =" + getAge() +
                ", name='" + name + '\'' +
                '}';
    }
}
