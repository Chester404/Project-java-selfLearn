import java.util.ArrayList;
import java.util.List;

public class Bag<T> {

    List<T> items = new ArrayList<>();

    public void addItem(T item){
        //method to add student
        items.add(item);
    }

    public void removeItem(T item){
        //method to remove a student
        items.remove(item);
    }

    public void clearAllItem(){
        //method to remove all students
        items.clear();
    }

}
