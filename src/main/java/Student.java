import java.util.List;

public class Student implements Nameable, HasLevel {

    private List<Double> grades;
    private String name;
    private Level studentLevel;

    public Student(List<Double> a){
         grades = a;
    }

    public Student(List<Double> a, Level studentLevel){
        grades = a;
        this.studentLevel = studentLevel;
    }

    public Double getAverageGrade(){
        double result=0.0;

        for(int i=0; i < grades.size(); i++){
            result += grades.get(i);
        }
        result = result/grades.size();

        return result;
    }

    @Override
    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Level  getLevel(){
        return studentLevel;
    }
}
