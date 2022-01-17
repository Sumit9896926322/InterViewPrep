package oops;

public class abstraction {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.setPrice(10);
        System.out.println(p.price);
    }
}


//abstract method do not have a body
//abstract method should be in abstract class
//abstract class cannot be instantiated
abstract class Item{
    int price;
   abstract void setPrice(int price);
}

//all the methods inside interface is by default public and abstract
//interface can't have non-abstract method unlike abstract class
//multiple interface can be implemented
interface Person{
    abstract void setAge(int age);
}
interface Developer{
    abstract void setExperience(int years);
}
class Sumit implements Person,Developer{

    @Override
    public void setAge(int age) {

    }

    @Override
    public void setExperience(int years) {

    }
}
class Pen extends Item{
    @Override
    void setPrice(int price) {
        this.price = price;
    }
}