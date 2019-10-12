abstract class bike{
bike() {
System.out.println("Bike is created");
}
final int price=80000;
abstract void fuel();
abstract void speed();
void show(){
System.out.println("Enjoy the ride");
}
}
class honda extends bike 
{
 int speed=120;
void fuel(){
System.out.println("Run on petrol");
}
void speed( ){
System.out.println("Speed is"+speed);
}
void price(){
System.out.println("price of honda"+(price+2000));
}
public static void main(String args[ ]){
 honda o = new honda();
o.fuel();
o.price();
o.speed();
o.show();
}
}