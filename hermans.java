class hermans{
  int age;
  String name;
  hermans( ) {
     }
  hermans(int a, String nm) {
   age=a;
   name= nm;
  }
  public static void main(String args[ ]) {
    hermans h1 = new hermans( );
   hermans h2= new hermans(21,"Herminder Singh");
  hermans h3= new hermans( 22," Darshpreet Singh");
  System.out.println("Age:=="+ h1.age+ "Name:=="+ h1.name);
  System.out.println("Age:=="+ h2.age+ "Name:=="+ h2.name);
  System.out.println("Age:=="+ h3.age+ "Name:=="+ h3.name);
    }
}

//Output ---C:\Users\dell.D6GHDKR2\Desktop>javac hermans.java

//C:\Users\dell.D6GHDKR2\Desktop>java hermans
//Age:==0Name:==null
//Age:==21Name:==Herminder Singh
//Age:==22Name:== Darshpreet Singh

  
   