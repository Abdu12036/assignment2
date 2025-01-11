package modules;

public class Student extends Person{
    private double gpa;

    public Student(){super();};

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa(){
        return gpa;
    }

    public int getID(){
        return super.getID();
    }

    @Override
    public String toString(){
        return "Student: " + super.toString();
    }

    @Override
    public double getPaymentAmount(){
        if(gpa>2.67){
            return 36660;
        }
        else return 0;
    }

    @Override
    public int compareTo(Person other) {
        if (other.getPaymentAmount()>this.getPaymentAmount()) {
            return 1;
        }
        else if (other.getPaymentAmount()<this.getPaymentAmount()) {
            return -1;
        }
        return 0;
    }
}
