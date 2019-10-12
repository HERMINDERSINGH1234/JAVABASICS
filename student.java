// the class name should be same as the constructor name ...
 //class student{
 
 //  student( )
   //   {
  // System.out.println("We are in the constructor");
    //  }
     //public static void main(String args[ ]){
     //student stu=new student( );
       //  }
    // }
//Program 2-->
 class student {
        int age;
       String name;
        student( )   // this is the constructor..
         {
          System.out.println("We are in the constructor");
          // method1--System.out.println("Age:==" +age+ "Name:==" +name); 
            }
         public static void main(String args[ ]) {
           student stu = new student( );
// this is the method 2 for call the initialize value...
      System.out.println("Age:==" +stu.age+ "Name:==" +stu.name); 
     }
  }

      


