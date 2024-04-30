package RegisterForm;

public class Student {

    private String name;
    private String email;
    private char gender;
    private String city;
    private int age;
    private String language[];

    public Student(String name, String email, char gender, String city, int age, String[] language) {

        this.name = name;
        this.email = email;
        this.gender = gender;
        this.city = city;
        this.age = age;
        this.language = language;
    }

    // name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // gender
    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // city
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // age
    public int setAge() {
        return age;
    }

    public void getAge(int age) {
        this.age = age;
    }

    // language
    public String[] getLanguages() {
        return language;
    }

    public void setLanguages(String[] language) {
        this.language = language;
    }
}
