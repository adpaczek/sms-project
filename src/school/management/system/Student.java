package school.management.system;

//This class is responsible for keeping the track os students fees, name, grade & fees paid
public class Student {
    private int id; //unique
    private String name;
    private int grade;
    private double feesPaid;
    private double feesTotal;

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30000;
    }

    //used to update student's grade (when promoted)
    public void setGrade(int grade) {

        this.grade = grade;
    }

    //add the fees to the fees paid
    //the school is going to receive the funds
    public void payFees(double fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);

    }

    //return student's id
    public int getId() {

        return id;
    }

    //return student's name
    public String getName() {

        return name;
    }

    //return student's grade
    public int getGrade() {

        return grade;
    }

    //return student's fees paid
    public double getFeesPaid() {

        return feesPaid;
    }

    //return student's total fees
    public double getFeesTotal() {

        return feesTotal;
    }

    public double getRemainigFees() {
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name: " + name + "\nTotal fees paid so far: " + feesPaid + "$";
    }
}

