package net.greg.examples.salient;


// Prinary link: https://www.javadude.com/articles/passbyvalue.htm
// https://www.geeksforgeeks.org/g-fact-31-java-is-strictly-pass-by-value/
// https://www.infoworld.com/article/3512039/does-java-pass-by-reference-or-pass-by-value.html
public class Dog {

  public Dog(String value) {
    name = value;
  }


  private String name = "";
  public String getName() { return name; }
  public void setName(String value) { name = value; }
}
