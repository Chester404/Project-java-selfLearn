import java.util.List;

public class Student {

    private List<Double> grades;

    public Student(List<Double> a){
         grades = a;
    }

    public Double getAverageGrade(){
        double result=0.0;

        for(int i=0; i < grades.size(); i++){
            result += grades.get(i);
        }
        result = result/grades.size();

        return result;
    }

}
