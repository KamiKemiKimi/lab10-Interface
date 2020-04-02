/**
   This program demonstrates the measurable Country class.
*/
import java.util.*;

public class MeasurableTester
{
   public static void main(String[] args)
   {
      Measurable[] countries = new Measurable[3];
      countries[0] = new Country("Uruguay", 176220);
      countries[1] = new Country("Thailand", 513120);
      countries[2] = new Country("Belgium", 30510);

      Measurable maxCountry = Measurable.max(countries);
      System.out.println("Maximum area: " + maxCountry.getMeasurement());
      System.out.println("Expected: 513120.0");
      System.out.println("The average surface area of these countries are: "+ Measurable.average(countries));
      System.out.println();
      System.out.println();



      Measurable[] midterms = new Measurable[5];
      midterms[0] = new Midterm(30, "Bob");
      midterms[1] = new Midterm(80, "Paul");
      midterms[2] = new Midterm(75, "Alex");
      midterms[3] = new Midterm(92, "Fed");
      midterms[4] = new Midterm(89, "Tim");

      Measurable maxMidterm = Measurable.max(midterms);
      System.out.println("Max score: " + maxMidterm.getMeasurement());
      System.out.println("Expected: 92.0");
      System.out.println("The average score of the midterms are: " + Measurable.average(midterms));
      System.out.println();
      System.out.println();



      Country [] countries2 = new Country[5];
      countries2[0] = new Country("Uruguay", 176220);
      countries2[1] = new Country("Thailand", 513120);
      countries2[2] = new Country("Belgium", 30510);
      countries2[3] = new Country("China", 4834997);
      countries2[4] = new Country("United States", 3642934);

      System.out.println("Unsorted");
      for (Country obj : countries2)
      {
         System.out.print(obj.getMeasurement());
         System.out.print("        ");
      }
      System.out.println();
      Arrays.sort(countries2);

      System.out.println("Sorted");
      for (Country obj : countries2)
      {
         System.out.print(obj.getMeasurement());
         System.out.print("        ");
      }


   }
}
