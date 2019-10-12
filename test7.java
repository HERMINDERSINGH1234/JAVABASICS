//Question == WAP using the getName , setName, getId()
class thread1 extends Thread{
public void run(){
System.out.println("Running");
}
}
class test7 {
public static void main(String args[]){
thread1 th1 =new thread1();
thread1 th2 = new thread1();
System.out.println("Name of the th1:" + th1.getName());
System.out.println("Name of the th2:" + th2.getName());
System.out.println("The Id of the th1: "+ th1.getId());
System.out.println("The Id of the th1: "+ th2.getId());
th1.start();
th2.start();
 th1.setName("MyThread1");
System.out.println("Name of the th1:" + th1.getName());
System.out.println("Name of the th2:" + th2.getName());
System.out.println("The Id of the th1: "+ th1.getId());
System.out.println("The Id of the th1: "+ th2.getId());
}
}

//C:\Users\dell.D6GHDKR2\Desktop>java test7
//Name of the th1:Thread-0
//Name of the th2:Thread-1
//The Id of the th1: 13
//The id of the th1: 14
//Running
//Running
// this is what we get the id and the name of the thread...
// and now we have to set the name of the thread...

// then after setting the name..
//C:\Users\dell.D6GHDKR2\Desktop>javac test7.java

//C:\Users\dell.D6GHDKR2\Desktop>java test7
//Name of the th1:Thread-0
//Name of the th2:Thread-1
//The Id of the th1: 13
//The Id of the th1: 14
//Name of the th1:MyThread1
//Running
//Name of the th2:Thread-1
//Running
//The Id of the th1: 13
//The Id of the th1: 14

