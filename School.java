package school.managment.system;
//many students, and teachers, using arraylist


import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private   static int totalMoneyEarned;
    private   static int totalMoneySpent;

    /**
     * new school object is created
     * @param teachers list of school in the school
     * @param students list of school students
     */

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned= 0;
        totalMoneySpent = 0;
    }

    // will return the list of teacher
    public List<Teacher> getTeachers() {
        return teachers;
    }
     // add teacher to the school
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    // will return the list of student in the school
    public List<Student> getStudents() {
        return students;
    }
    // add students to the school
    //student to be added
    public void addStudents(Student student) {
        students.add(student);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    // the money earned by the school
    //moneyearned money supposed to be added
    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    //update the money update by the school: salaries
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent -= moneySpent;
    }
}
