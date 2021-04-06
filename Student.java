package school.managment.system;
// keeping track of the student, fees, name, grade, paid
//

public class Student {
    private int id;
    private String name;
    private int grade;

    private int feesPaid;
    private int feesTotal;

    // the constructor will create a new student to initialize the values

    /**
     * fees paid initially are 0
     * fees = $30000
     * @param id
     * @param name
     * @param grade
     */

    public Student( int id, String name, int grade){
        this.feesPaid = 0;
        this.feesTotal= 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;

    }
    //alter student grade . setter will always be void and getter wil be returning data type

    /**
     * update student grade
     * @param grade new grade of the student
     */
    public void setGrade(int grade){
        this.grade = grade;
    }
    // create another setter method to update the fees

    /**
     *
     * @param fees the fees that the stuedent pays
     */

    public void payFees(int fees){
    feesPaid+= fees;
    School.updateTotalMoneyEarned(feesPaid);


    }
    // get id will return the id of the stuedent
    public int getId() {
        return id;
    }
    // getname will return the name of the student
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }


    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }
    public int getRemaingFees(){
        return feesTotal - feesPaid;

    }

}
