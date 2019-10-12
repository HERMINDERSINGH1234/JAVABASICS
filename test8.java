//Question == WAP using of the getPriority and the set Priority of the java ,,..
class thread1 extends Thread{
public void run(){
System.out.println("Running!!!");
System.out.println("Running Thread Priority is: " + Thread.currentThread().getPriority());
   }
 }
class test8 {
public static void main(String args[]){
thread1  th1 = new thread1();
thread1 th2 = new thread1();
th1.setPriority(Thread.MIN_PRIORITY);
th2.setPriority(Thread.MAX_PRIORITY);
th1.start();
th2.start();
}
}

//Output = Running!!!
//Running!!!
//Running Thread Priority is: 5
//Running Thread Priority is: 5

//C:\Users\dell.D6GHDKR2\Desktop>

// then after when the priority is set then 
//C:\Users\dell.D6GHDKR2\Desktop>javac test8.java

//C:\Users\dell.D6GHDKR2\Desktop>java test8
//Running!!!
//Running!!!
//Running Thread Priority is: 1
//Running Thread Priority is: 10

//C:\Users\dell.D6GHDKR2\Desktop>

