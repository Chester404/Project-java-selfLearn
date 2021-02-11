import java.util.ArrayList;
import java.util.List;

public class Register {

    private List<Nameable>  students;


    public Register(List<Nameable> students){
        this.students = students;
    }

    public List<String> getRegister(){
        List<String> names = new ArrayList<>();

        for(Nameable students: students ){
            names.add(students.getName());
        }
        return names;
    }

    public List<String> getRegisterByLevel(Level studentlevel){
            List<String> studentNames= new ArrayList<>();

        for(Nameable student: students){
            if(((Student)student).getLevel().equals( studentlevel)){
                studentNames.add(student.getName());
            };
        }
        return studentNames;
    }

//    public String printReport(){
//
//        String combinedNames = "";
//
//        for(Nameable student: students){
//            for(((Student)student).getLevel().equals(Level.LEVEL100)){
//            }
//        }
//        return;
//    }

}
