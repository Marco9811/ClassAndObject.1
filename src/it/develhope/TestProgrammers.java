package it.develhope;

public class TestProgrammers {
    public static void main(String[] args) {
      Programmer marco = new Programmer();
      marco.name = "Marco";
      marco.age = 25;
      marco.wearsGlasses = true;
      marco.drinkCofee();
      marco.printDetails();
      Programmer luca = new Programmer();
      luca.name = "Luca";
      luca.age = 22;
      luca.wearsGlasses = false;
      luca.drinkCofee();
      luca.hasGlasses();
    }
}
