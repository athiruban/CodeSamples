import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Collection;
import java.util.ArrayList;

class Student{

    private String name;
    private int    age;

    Student(){
        name="Athiruban SM";
        age =25;
    }

    Student(String name, int age){
        this.name = name;
        this.age  = age;
    }
    
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public int hashCode(){
        return age;
    }

    public boolean equals(Object anotherStud){
        
        if (anotherStud instanceof Student){
            Student anotherStudent = (Student) anotherStud;
            
            if (this.name == anotherStudent.name && this.age == anotherStudent.age){
                System.out.println("Objects are equal!");
                return true;
            }
        }

        System.out.println("Objects are not equal!");
        return false;
    }
}

class TestMain1{

    public static void main(String args[]){
        //List<Student> studList = new ArrayList<Student>();
        Set<Student> studList = new HashSet<Student>();
        studList.add(new Student("Steve Jobs", 64));
        studList.add(new Student("Steve Jobs", 64));
        studList.add(new Student("Steve Jobs", 64));
        CollectionHelper.displayCollection(studList);
        /*
         * >Objects are not equal!<
         * >Name: Steve Jobs, Age: 64<
         * >Objects are equal!<
         * >Objects are equal!<
         */
    }

    public static class CollectionHelper{
        public static void displayCollection(Collection col){
            //List<Student> list = (List<Student>) col;
            Set<Student> list = (Set<Student>) col;
            for(Student stud : list){
                System.out.println("Name: "+ stud.getName() + ", Age: "+ stud.getAge());
            }
        }
    }
}

