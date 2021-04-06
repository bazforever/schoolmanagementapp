package school.managment.system;

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;



    //create teacher object
    //values of the teacher

    public Teacher(int id, String name, int salary ){
        this.id = id;
        this.name = name;
        this.salary= salary;
        this.salaryEarned = 0;

    }
    // will return the id , name, and salry of the teacher
    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary( int salary){
        this.salary = salary;

    }
    //removed from the total money earned by the school

    public void recieveSalary(int salary){
        salaryEarned+= salary;
        School.updateTotalMoneySpent(salary);

    }

}
