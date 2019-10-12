// write a program of swapping the two number using call by value....
 class sheetal {
public static void  main(String args[ ]) {
int a=10;
int b=20;
pqr obj =new pqr( );
System.out.println("Before passing argument " );
System.out.println("value of a" +a);
System.out.println("value of b" +b);

System.out.println(" Now calling the method: ");
obj.sum(a,b);

System.out.println("After passing argument " );
System.out.println("value of a after calling" +a);
System.out.println("value of b after calling" +b);
}
}
class pqr {
 void sum(int x,int y){
   
System.out.println("value of x before incrementing :" +x);

System.out.println("value of y before incrementing :"+ y );

x=x+50;
y=y+50;

System.out.println("value of x after incrementing :" +x);
System.out.println("value of y after incrementing :" +y);
}
}



