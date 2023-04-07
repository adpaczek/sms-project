package school.management.system;

//this class is responsible for keeping the track of teacher's information
public class Teacher {

    private int id;
    private String name;
    private int salary;
    private String subject;
    private int salaryEarned;

    public Teacher(int id, String name, int salary, String subject) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Teacher's name: " + name + "\nSubject: " + subject + "\nMonthly salary: " + salary + "\nSalary earned: " + salaryEarned;
    }
}
