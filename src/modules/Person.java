package modules;

public abstract class Person implements Payable, Comparable<Person> {
    private String name;
    private String surname;
    private static int id_gen = 0;
    private int id;

    public Person() { id = id_gen++; };

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        id = id_gen++;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }

    public int getID(){
        return id;
    }

    public String toString(){
        return id + "." + name + " " + surname;
    }

    public String getPosition(){
        return "Student";
    }

    @Override
    public abstract double getPaymentAmount();

}
