// write the program to show the concept of the Single Inheritance using the two class person and employee......
class Person{
//public static void main(String args[ ])
  //{
//System.out.println("HELLO WORLD");
  //    }
int age ;
String name;
String Address;
void input ( )
   {
      age=24;
      name="Herman";
      Address="AAA";
     }
 void show( ){
      System.out.println("AGE:==" +age);
        System.out.println("Name :==" +name);
       System.out.println("Address ==" +Address);
       }
   }
class emp extends Person
      {
    int eid;
     String department ;
     double salary;
    void insert( ) {
     eid=101;
     department="CSE";
    salary=1000.0;
                  }
    void display( ){
     System.out.println("EMPLOYEEID:==" +eid);
      System.out.println("department:=="+department); 
    System.out.println("Salary:==" + salary);
                  }
  }
 public class abcd {
  public static void main(String args[ ]){
      emp e=new emp();
      e.input( );
      e.show( );
      e.insert( );
      e.display( );
         }
     }

