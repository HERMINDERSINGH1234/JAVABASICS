// constructor overloading..
class darsh {
  int id;
  String name;
  int age;
  darsh( ) {
    }
  darsh(int sid,String nm)   {    
     id=sid;        
    name=nm;
    }
 darsh(int sid,String nm,int ag){
    id=sid;
    name=nm;
     age=ag;
   }
 public static void main(String args[ ]) {
  darsh d1= new darsh( );
  darsh d2= new darsh(123,"darshan");  
   darsh d3= new darsh(123,"dars",22);
is  d1.d