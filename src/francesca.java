public class francesca {

    private String name;
    private String surname;
    private int age;

    public francesca(String n, String s, int a){
        this.name = n;
        this.surname = s;
        this.age = a;
    }

    public String toString(){
        return name + " " + surname + " " + age;
    }
}
