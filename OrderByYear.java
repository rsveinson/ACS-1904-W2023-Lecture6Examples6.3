import java.util.Comparator;
public class OrderByYear implements Comparator<Person> 
{
    public int compare(Person o1, Person o2) {
        //int rt;
        //String st = o1.getName() + o1.getYear();
        
        // if(o1.getYear()-o2.getYear() == 0){
            // rt = o1.compareTo(o2);
        // }else{
            // rt = o1.getYear()-o2.getYear();
        // }
        
        return o1.getYear() - o2.getYear();
        //return rt;        
        //return st.compareTo(o2.getName() + o2.getYear());
    }
} 