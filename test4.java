//Question == program for the making of the thread using the sleep method..
class thread1 extends Thread {
public void run( ){
for(int i=0;i<5;i++) {
 try { 
    Thread.sleep(500);  
       }
catch (InterruptedException e)
{ // e.printStackTrace
}

System.out.println("Thread1 :"+i);
                    }
        }
}
class thread2 extends Thread {
public void run(){
for(int i=0;i<5;i++){
System.out.println("Thread2 :"+i);
                   }
        }
    }
 class test4 {
public static void main(String args[]){
thread1 th1= new thread1();
thread2 th2 = new thread2();
th1.start();
th2.start();

    }
}

//C:\Users\dell.D6GHDKR2\Desktop>javac test4.java

//C:\Users\dell.D6GHDKR2\Desktop>java test4
//Thread2 :0
//Thread2 :1
//Thread2 :2
//Thread2 :3
//Thread2 :4
//Thread1 :0
//Thread1 :1
//Thread1 :2
//Thread1 :3
//Thread1 :4

