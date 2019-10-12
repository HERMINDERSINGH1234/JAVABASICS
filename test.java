//
//Question --To print the sequence of the thread in a loop using the runnable //interface.
class thread1 implements Runnable
{
public void run( ) {
for( int i=0;i<5;i++) {
System.out.println("Thread 1:"+i);
         }
   }
}
class thread2  implements Runnable
{
public void run(){
for( int i=0;i<5;i++){
System.out.println("Thread 2:"+i);
}
}
}
 class test {
public static void main(String args[]){
thread1 th1= new thread1();
thread2 th2= new thread2();
// in the runnable interface is not having the start method to call
// it is only having the run(); method to call..
th1.run();
th2.run();
      }
}


//output is ==
//C:\Users\dell.D6GHDKR2\Desktop>javac test.java

//C:\Users\dell.D6GHDKR2\Desktop>java test
//Thread 1:0
//Thread 1:1
//Thread 1:2
//Thread 1:3
//Thread 1:4
//Thread 2:0
//Thread 2:1
//Thread 2:2
//Thread 2:3
//Thread 2:4

//C:\Users\dell.D6GHDKR2\Desktop>