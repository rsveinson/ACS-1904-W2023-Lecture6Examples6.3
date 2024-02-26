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
          
<<<<<<< HEAD
       // let's see if we can figure out how to use this on it's own 
=======
       // let's see if we can figure out how to use this on it's own
>>>>>>> 59250abe7f70f4c8d58c67f1dc264a0500f3fdd1
       OrderByYear oby = new OrderByYear();
       System.out.println(oby.compare(people[0], people[1]));
       System.out.println(oby.compare(people[0], people[4]));
       
        
    }
}
