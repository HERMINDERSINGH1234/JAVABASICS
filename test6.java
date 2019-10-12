//Question ==  Write the program of the thread using the join .....
//ans in this there are the three object of having the same thread so we want first the 
//thread 1 run completely then after the thread 2,3 will run further and the 2,3 will run //concurrently..

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

 class test6 {
public static void main(String args[]){
thread1 th1= new thread1();
thread1 th2 = new thread1();
thread1 th3= new thread1();
th1.start();
try{
 th1.join();
}
catch(InterruptedException e) { }

th2.start();
th3.start();
    }
}

//Output ==C:\Users\dell.D6GHDKR2\Desktop>java test6
//Thread1 :0
//Thread1 :1
//Thread1 :2
//Thread1 :3
//Thread1 :4
//Thread1 :0
//Thread1 :0
//Thread1 :1
//Thread1 :1
//Thread1 :2
//Thread1 :2
//Thread1 :3
//Thread1 :3
//Thread1 :4
//Thread1 :4