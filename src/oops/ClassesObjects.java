package oops;

import oops.encapsolation.Encapsulation;

class Movie{
    //static is class property that is specific to class not object
    //static properties can be accessed by className.staticProperty(Movie.movieCount)
    static int movieCount = 0;
    //class Property
    String name;
    int rating;
    int playCount = 0;
    Movie(){
        //default constructor, java creates automatically if not created
        System.out.println("Create new movie");
        movieCount++;
    }
    //parameterised constructor
    Movie(String name,int rating){
        //Usage of this
        this();// 1.calling default constructor
        this.name = name;//2.access class properties for individual object with this keyword
        this.rating = rating;
        this.playCount++;
    }

    //class Methods
    void isStreaming(){
        System.out.println(this.name+ " movie is streaming");
    }
}

//extends keyword state inheritance,extend property of base class
class BollywoodMovie extends Movie{
    String language;
    BollywoodMovie(){
        System.out.println("new bollywood movie is created");
    }
    BollywoodMovie(String name, int rating){
        super(name,rating);
        this.language = "hindi";
    }
     void isStreaming(){
         System.out.println(this.name+" Streaming in hindi language");
     }
}
public class ClassesObjects extends Encapsulation{
    public static void main(String[] args) {
        Movie avengers = new Movie("Avengers",10);
        Movie Flames = new Movie("Flames",10);
        Movie Venom = new Movie("Venom",10);
        avengers.isStreaming();

        System.out.println(Movie.movieCount+" "+Flames.playCount+" "+avengers.playCount);

        BollywoodMovie shershah = new BollywoodMovie("Shershah",10);
        System.out.println(shershah.rating);

        ClassesObjects obj = new ClassesObjects();
        System.out.println(obj.a);
    }

}

