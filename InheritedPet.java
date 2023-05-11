/*
 * Activity 4.9.1
 */
public class InheritedPet
{
  public static void main(String[] args)
  {
    System.out.println("my cat");
    Cat myCat = new Cat();
    myCat.setName("Romeo");
    myCat.purr();
    myCat.eat();
    myCat.sleep();
    
    System.out.println("my dog");
    Dog myDog = new Dog();
    myDog.setName("Juliette");
    myDog.walk();
    myDog.eat();
    myDog.sleep();

    System.out.println("my guinea pig");
    GuineaPig myGuineaPig = new GuineaPig();
    myGuineaPig.setName("chub");
    myGuineaPig.whistle();
    myGuineaPig.Squeak();
    myGuineaPig.eat();
    myGuineaPig.sleep();


    System.out.println("my gerbil");
    Gerbil myGerbil = new Gerbil();
    myGerbil.setName("chub");
    myGerbil.purr();
    myGerbil.Squeak();
    myGerbil.eat();
    myGerbil.sleep();

    
  }
}