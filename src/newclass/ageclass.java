package newclass;

          public class ageclass {
              public static void main(String [] args) {
                  int age = 25;
                  int java = 83;
                  if ((age >= 20 && age <= 30) && java >= 80) {
                      System.out.println(age * 1.5 + java * 4.5);
                  } else if ((age >= 20 && age <= 30) && java <= 80) {
                      System.out.println(age * 1.5 + java * 4.5);
                  } else if (age > 30 && java > 80) {
                      System.out.println(age * 1.1 + java * 4.5);
                  } else if (age > 30 && java < 80) {
                      System.out.println(age * 1.1 + java * 3.5);
                  }   else{
                      System.out.println("Please enter age or java");

                  }


            }


}

