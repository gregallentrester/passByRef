package net.greg.examples.salient;


// Prinary link: https://www.javadude.com/articles/passbyvalue.htm
// https://www.geeksforgeeks.org/g-fact-31-java-is-strictly-pass-by-value/
// https://www.infoworld.com/article/3512039/does-java-pass-by-reference-or-pass-by-value.html
public class PassByReference {

  public static void main(String[] args) {
    new PassByReference().demo();
  }


  private void demo() {

    System.err.println("\n\nPassByReference\n\n");


    Dog topDog = new Dog("Max");

    System.err.println(
      "\nBefore, topDog.getName(): " +
      topDog.getName());

    changeName(topDog);

    System.err.println(
      "\n\nAfter, topDog.getName(): " +
      topDog.getName());
  }


  private void changeName(Dog ref) {

    ref.setName("Fred");

    System.err.println(
      "\n\nIn attemptNameChange(), " +
      "\nref.getName(): " + ref.getName());
  }
}
