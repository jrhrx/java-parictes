public class Main {
    public static void main (String[] args){
        
        //This is comment
        String  name="hrithik ";
        String saurname="Gaikwad";
        String fullname = name + saurname ;
        int x=12;
        int y=15;
         /*this is change value */
        System.out.println(fullname);
        System.out.println(name);
        System.out.println(x+y);
        System.out.println(x>y);
        if (x>y){
            System.out.println("x is greater than y");
        }
        else{
            System.out.println("y is grater than x");
        }
        int day = 5;
        switch (day) {
          case 1:
            System.out.println("Monday");
            break;
          case 2:
            System.out.println("Tuesday");
            break;
          case 3:
            System.out.println("Wednesday");
            break;
          case 4:
            System.out.println("Thursday");
            break;
          case 5:
            System.out.println("Friday");
            break;
          case 6:
            System.out.println("Saturday");
            break;
          case 7:
            System.out.println("Sunday");
            break;
        }
      
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
          System.out.println(i);
        }
        int[][] mynumber={ {1,2,3,4,5},{7,8,9} };
        int z=mynumber[1][1];
        System.out.println(z);
        
    }
  
} 

