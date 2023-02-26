public class Person implements Comparable<Person>, Player {
    private String name;
    private int year; // year of birth
    private String position;
    private int jerseyNumber;
    
    public Person(String n, int y) {
        name = n;
        year = y; 
    }
    
    // methods of the Player interface
    public String getName(){
        return name;
    }
    public String getPosition(){
        return position;
    }
    public int getJerseyNumber(){
        return jerseyNumber;
    }
    public void setPosition(String p){
        position = p;
    }
    public void setJerseyNumber(int j){
        jerseyNumber = j;
    }
    
    // methods of the Comparable interface
    public int compareTo (Person p) {
        return name.compareTo(p.name);
    }
    
    // original methods of Person
    public void setName(String n){
        name = n;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int y){
        year = y;
    }
    public String toString(){
        return name;
    }
}
