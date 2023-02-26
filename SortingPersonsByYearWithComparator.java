import java.util.Arrays;
public class SortingPersonsByYearWithComparator
{
   public static void main(String[] args){
       Person [] people = {
           new Person("Mary", 1957), 
           new Person("Terry",1972), 
           new Person ("Beke", 1957),
           new Person("Sammy",1972), 
           new Person("Linda", 1971)};
           
       // sort with a comparator
       /* note that the comparator is called with a 
        * new comparator object
        * new OrderByYear
        * the parameter is passed to the array
        */
       Arrays.sort(people, new OrderByYear());
      
       
       for (Person p: people)
          System.out.println(p.getYear() + " "+p);
    }
}
