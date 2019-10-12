//Question == WAP to find out that the thread is the DeamonThread and 
//set any user defined set to the Deamon thread...
class thread1 extends Thread {
public void run(){
if(Thread.currentThread().isDaemon()){
System.out.println("Daemon thread is running ");
  }
else {
System.out.println("Thread is running...");
   }
}
}
class test9 {
public static void main(String args[]){
thread1 th1 = new thread1();
thread1 th2= new thread1();

th1.setDaemon(true);
th1.start();
th2.start();
}
}
 //output :==
//C:\Users\dell.D6GHDKR2\Desktop>java test9
//Thread is running...
//Thread is running...
 // so the no thread is deamon according to the above output ,,
// so to make it daemon..
// then the output ==
//C:\Users\dell.D6GHDKR2\Desktop>javac test9.java

//C:\Users\dell.D6GHDKR2\Desktop>java test9
//Daemon thread is running
//Thread is running...
