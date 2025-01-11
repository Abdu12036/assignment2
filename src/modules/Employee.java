package modules;

public class Employee extends Person{
    private String position;
    private double salary;

    public Employee() {super();};

    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public int getID(){
        return super.getID();
    }

    @Override
    public String toString() {
        return "Employee: " + super.toString();
    }

    @Override
    public double getPaymentAmount(){
        return getSalary();
    }

    @Override
    public int compareTo(Person other) {
        if (other.getPaymentAmount() > this.getPaymentAmount()) {
            return 1;
        }
        else if(other.getPaymentAmount() < this.getPaymentAmount()) {
            return -1;
        }
        return 0;
    }

}
