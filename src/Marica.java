public class Marica {
    private String name;
    private String surname;
    private int age;

    public Marica(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public String toString(){
        return name + " " + surname + " " + age;
    }
}
