class college {
String cName="KIET";
void show( ){
System.out.println("COLLEGE NAME"+ cName);
             }
}
class student1 extends college 
    {
 String dept="CSE";
 void show( ) {
 System.out.println(" Department NAME"+ dept);
         }
public static void main(String args[ ])
                 {
 college C= new college( );
  C.show( );
college C= new student1( );
 C.show( );
   }
}
