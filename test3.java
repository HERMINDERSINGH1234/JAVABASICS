//question == By using the thread class ?
class thread1 extends Thread
{
public void run( ) {
for(int i=0;i<5;i++){
System.out.println("thread 1: "+i);
     }
  }
}
class thread2 extends Thread
{
public void run( ) {
for(int i=0;i<5;i++){
System.out.println("thread 2: "+i);
      }
  }
}
 class test3 {
public static void main(String args[]){
thread1  th1 = new thread1();
thread2  th2= new thread2();
th1.start();
th2.start();
     }
}


//C:\Users\dell.D6GHDKR2\Desktop>javac test3.java

//C:\Users\dell.D6GHDKR2\Desktop>java test3
//thread 1: 0
//thread 2: 0
//thread 1: 1
//thread 2: 1
//thread 1: 2
//thread 1: 3
//thread 1: 4
//thread 2: 2
//thread 2: 3
//thread 2: 4
