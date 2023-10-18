import java.util.*;


/*

                        -Analysis-
The problem here is that we are trying to copy information from Student
1 into student 2, and in order to do this we will have to have a cloneable interface.
Which essentially serves to make sure we do not change the information in 
the 1st student object.

                        -Design-
First we develop a student class and inside the student class add variables to 
store arguments passed in by the constructor. Create getters to return each variable
value back to the user.

                       -Assumption-
We should not worry about spaces inside the input, or any other special characters.

*/
	//write your code here

 class Student implements Cloneable{
    private String rollNo;
    private String name;
    
    
    Student(String rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }
    
    //getters
    public String getRollNo(){
        return this.rollNo;
    }
    
    public String getName(){
        return this.name;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    
}
class DriverMain
{
    public static void main (String[] args){    
        try{  
            Scanner scanner = new Scanner(System.in);
            String roll = scanner.nextLine();
            String name = scanner.nextLine();
            Student s1=new Student(roll,name);  
            Student s2=(Student)s1.clone();  
            System.out.println(s2.getRollNo());
            System.out.print(s2.getName());

        }catch(CloneNotSupportedException c){}  

    }  
    
}