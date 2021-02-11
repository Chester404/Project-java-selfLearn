import java.util.ArrayList;
import java.util.List;

public class BagOfStudents {

    //Student student;
    List<Student> studentList = new ArrayList<>();

    public void addStudent(Student student){
        //method to add student
        studentList.add(student);
    }

    public void removeStudent(Student student){
        //method to remove a student
        studentList.remove(student);
    }

    public void clearAllStudent(){
        //method to remove all students
        studentList.clear();
    }
}
