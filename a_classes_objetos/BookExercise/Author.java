package a_classes_objetos.BookExercise;

enum Gender {
    MASCULINE, FEMININE
}

public class Author {
    private String firstName;
    private String lastName;
    private Gender gender;
    private int age;

    public Author(String firstName, String lastName, Gender gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
