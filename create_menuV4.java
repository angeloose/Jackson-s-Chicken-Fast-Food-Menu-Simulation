import java.util.Scanner;
import java.util.Random;

public class create_menuV4
{   
    static Scanner scan = new Scanner(System.in);
    static int input = 0, q=0;
    static int a1 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0;
    static int b1 = 0, b2 = 0, b3 = 0, b4 = 0, b5 = 0, b6 = 0;
    static int c1p = 0, c1s = 0, c1d = 0, c1f = 0, c2 = 0, c3l = 0, c3s = 0, c3m = 0, c4 = 0;
    static int d1c = 0, d1v = 0, d1cj = 0, d1s = 0,  d2c = 0, d2o = 0, d3 = 0;
    static String Str, d3f; //daily cake flavor
    static double total=0.0;
    
    public static void main (String[] args)
    {       
        periodicflavor();
        System.out.println ("+=-Welcome to Jackson's Chicken!-=+");
         System.out.println ("Please navigate the menu using the number keys.");
         System.out.println ("=================================================");
         
          System.out.println ("---[Main Menu]---");
          System.out.println ("1. Meals");
          System.out.println ("2. Sides");
          System.out.println ("3. Refreshments");
          System.out.println ("4. Delights");
          System.out.println ("^^^New Cake Flavor!^^^");
          System.out.println (" ");
          System.out.println ("0. End Order");
          System.out.println ("Current total payment: $"+total+"0");
        input=scan.nextInt(); 
   
          
        while (input!=0) {
         if (input >= 1 && input <=4) {
          if (input == 1) {
          section1();
          }
          if (input == 2) { 
          section2();
          }
          if (input == 3) { 
          section3();
          }
          if (input == 4) {
          section4();
          }
         }
         else {
              System.out.println ("--------------------------------------------");
              System.out.println ("***Please input a number between 0 and 4.***");
              System.out.println ("--------------------------------------------");
         }
            System.out.println (" ");
            System.out.println ("---[Main Menu]---");
            System.out.println ("1. Meals");
            System.out.println ("2. Sides");
            System.out.println ("3. Refreshments");
            System.out.println ("4. Delights");
            System.out.println ("^^^New Cake Flavor!^^^"); 
            System.out.println (" ");
            System.out.println ("0. End Order");
            System.out.println ("Current total payment: $"+total+"0");
         input=input=scan.nextInt();
        }
        System.out.println (" ");
        System.out.println ("Final Receipt");
        System.out.println ("-------------------------------------------");
        finalizeorder();
        System.out.println ("-------------------------------------------");
        System.out.println ("Your total payment will be $"+total+"0.");
        System.out.println ("Thank you for choosing Jackson's Chicken!");                
    }
    
    public static void section1()
    {
           System.out.println (" ");
           System.out.println ("===[Meals]===");
           System.out.println ("1. Brown Bag Chicken  -  $4.50");
           System.out.println ("2. Chicken Sandwich   -  $4.00"); 
           System.out.println ("3. The Jaxwich        -  $5.00"); 
           System.out.println ("4. Jackies            -  $4.00"); 
           System.out.println ("5. Lil Tenders        -  $3.00"); 
           System.out.println (" ");
           System.out.println ("0. Return");
           System.out.println ("Current total payment: $"+total+"0");
        input=scan.nextInt();
        while (input!=0) {
         if (input >= 1 && input <=5) {
           if (input == 1) {
                quantity();
                total=total + (4.50*q); 
                a1 = a1 + q;
           } 
            if (input == 2) {
                quantity();
                total=total + (4.00*q);
                a2 = a2 + q;
           }
            if (input == 3) {
                quantity();
                total=total + (5.00*q); 
                a3 = a3 + q;
           }
            if (input == 4) {
                quantity();
                total=total + (4.00*q); 
                a4 = a4 + q;
           }
            if (input == 5) {
                quantity();
                total=total + (3.00*q); 
                a5 = a5 + q;
           }
          }
         else {
              System.out.println ("--------------------------------------------");
              System.out.println ("***Please input a number between 0 and 5.***");
              System.out.println ("--------------------------------------------");
         }
            System.out.println (" ");
            System.out.println ("===[Meals]===");
            System.out.println ("1. Brown Bag Chicken  -  $4.50");
            System.out.println ("2. Chicken Sandwich   -  $4.00"); 
            System.out.println ("3. The Jaxwich        -  $5.00"); 
            System.out.println ("4. Jackies            -  $4.00"); 
            System.out.println ("5. Lil Tenders        -  $3.00"); 
            System.out.println (" ");
            System.out.println ("0. Return");
            System.out.println ("Current total payment: $"+total+"0");
         input=scan.nextInt();
        }
        return;
    }
    
    public static void section2()
    {
             System.out.println (" ");
           System.out.println ("===[Sides]===");
           System.out.println ("1. Waffle Fries       -  $1.50");
           System.out.println ("2. Jax Fries          -  $2.00"); 
           System.out.println ("3. Lil Nuggets        -  $2.00"); 
           System.out.println ("4. Kids Mac           -  $2.00"); 
           System.out.println ("5. Jaxan Toast        -  $1.00");
           System.out.println ("6. Coleslaw           -  $1.00"); 
           System.out.println (" ");
           System.out.println ("0. Return");
           System.out.println ("Current total payment: $"+total+"0");
        input=scan.nextInt();
        while (input!=0) {
         if (input >= 1 && input <=6) {
           if (input == 1) {
                quantity();
                total=total + (1.50*q); 
                b1 = b1 + q;
           } 
            if (input == 2) {
                quantity();
                total=total + (2.00*q);
                b2 = b2 + q;
           }
            if (input == 3) {
                quantity();
                total=total + (2.00*q); 
                b3 = b3 + q;
           }
            if (input == 4) {
                quantity();
                total=total + (2.00*q); 
                b4 = b4 + q;
           }
            if (input == 5) {
                quantity();
                total=total + (1.00*q); 
                b5 = b5 + q; 
           }
            if (input == 6) {
                quantity();
                total=total + (1.00*q); 
                b6 = b6 + q;
           }
          }
         else {
              System.out.println ("--------------------------------------------");
              System.out.println ("***Please input a number between 0 and 6.***");
              System.out.println ("--------------------------------------------");
         }
            System.out.println (" ");
           System.out.println ("===[Sides]===");
           System.out.println ("1. Waffle Fries       -  $1.50");
           System.out.println ("2. Jax Fries          -  $2.00"); 
           System.out.println ("3. Lil Nuggets        -  $2.00"); 
           System.out.println ("4. Kids Mac           -  $2.00"); 
           System.out.println ("5. Jaxan Toast        -  $1.00");
           System.out.println ("6. Coleslaw           -  $1.00"); 
           System.out.println (" ");
           System.out.println ("0. Return");
            System.out.println ("Current total payment: $"+total+"0");
         input=scan.nextInt();
        }
        return;       
        
    }
    
    public static void section3()
    {
          System.out.println (" ");
           System.out.println ("===[Refreshments]===");
           System.out.println ("1. Fountain Drink     -  $1.00");
           System.out.println ("2. Iced Tea           -  $1.50"); 
           System.out.println ("3. Lemonade           -  $1.50"); 
           System.out.println ("4. Bottled Water      -  $0.50"); 
           System.out.println (" ");
           System.out.println ("0. Return");
           System.out.println ("Current total payment: $"+total+"0");
        input=scan.nextInt();
        while (input!=0) {
         if (input >= 1 && input <=4) {
           if (input == 1) {
               while (input!=0) {
                System.out.println ("What type of drink?");
                    System.out.println ("1. Pepsi");
                    System.out.println ("2. Sprite"); 
                    System.out.println ("3. Dr. Pepper"); 
                    System.out.println ("4. Fanta");
                    System.out.println (" ");
                    System.out.println ("0. Return");
                    input=scan.nextInt();
                if (input == 1) {
                        quantity();             
                        c1p = c1p + q;
                        zero();
                } 
                if (input == 2) {
                        quantity();  
                        c1s = c1s + q;
                        zero();
                } 
                if (input == 3) {
                        quantity();  
                        c1d = c1d + q;
                        zero();
                } 
                if (input == 4) {
                        quantity();
                        c1f = c1f + q;
                        zero();
                } 
                if (input<0 || input>4) {
                        System.out.println ("--------------------------------------------");
                        System.out.println ("***Please input a number between 0 and 4.***");
                        System.out.println ("--------------------------------------------");   
                }
                total=total + (1.00*q);
              }
           } 
            if (input == 2) {
                quantity();
                total=total + (1.50*q);
                c2 = c2 + q;
           }
            if (input == 3) {
                while (input!=0) {
                System.out.println ("What type of Lemonade?");
                    System.out.println ("1. Original/Lemon");
                    System.out.println ("2. Strawberry"); 
                    System.out.println ("3. Melon"); 
                    System.out.println (" ");
                    System.out.println ("0. Return");
                    input=scan.nextInt();
                if (input == 1) {
                        quantity();             
                        c3l = c3l + q;
                        zero();
                } 
                if (input == 2) {
                        quantity();  
                        c3s = c3s + q;
                        zero();
                } 
                if (input == 3) {
                        quantity();  
                        c3m = c3m + q;
                        zero();
                } 
                if (input<0 || input>3) {
                        System.out.println ("--------------------------------------------");
                        System.out.println ("***Please input a number between 0 and 3.***");
                        System.out.println ("--------------------------------------------");   
                }
                total=total + (1.50*q);
                
              }
           }
            if (input == 4) {
                quantity();
                total=total + (0.50*q); 
                c4 = c4 + q;
           }
         }
         else {
              System.out.println ("--------------------------------------------");
              System.out.println ("***Please input a number between 0 and 4.***");
              System.out.println ("--------------------------------------------");
         }
           System.out.println (" "); 
            System.out.println ("===[Refreshments]===");
            System.out.println ("1. Fountain Drink     -  $1.00");
            System.out.println ("2. Iced Tea           -  $1.50"); 
            System.out.println ("3. Lemonade           -  $1.50"); 
            System.out.println ("4. Bottled Water      -  $0.50"); 
            System.out.println (" ");
            System.out.println ("0. Return");
            System.out.println ("Current total payment: $"+total+"0");
         input=scan.nextInt();
        }
        return;    
        
    }
    
    public static void section4()
    {
        System.out.println (" "); 
            System.out.println ("===[Delights]===");
            System.out.println ("1. Milkshake          -  $3.00");
            System.out.println ("2. Cookies  (1 Each)  -  $1.00"); 
            System.out.println ("3. Shortcake          -  $3.50");
            System.out.println ("^^^Today's Flavor: " + d3f + " ^^^");  
            System.out.println (" ");
            System.out.println ("0. Return");
            System.out.println ("Current total payment: $"+total+"0");
         input=scan.nextInt();
        while (input!=0) {
          if (input >= 1 && input <=3) {
             if (input == 1) {
              while (input!=0) {
                System.out.println ("What type of Shake?");
                 System.out.println ("1. Chocolate");
                 System.out.println ("2. Vanilla"); 
                 System.out.println ("3. Cookies N Jack"); 
                 System.out.println ("4. Strawberry");
                 System.out.println (" ");
                 System.out.println ("0. Return");
                 input=scan.nextInt();
              
                if (input == 1) {
                    quantity();             
                    d1c = d1c + q;
                    zero();
                } 
                if (input == 2) {
                    quantity();  
                    d1v = d1v + q;
                    zero();
                } 
                if (input == 3) {
                    quantity();  
                    d1cj = d1cj + q;
                    zero();
                } 
                if (input == 4) {
                    quantity();
                    d1s = d1s + q;
                    zero();
                } 
                if (input<0 || input>4)  {
                    System.out.println ("--------------------------------------------");
                    System.out.println ("***Please input a number between 0 and 4.***");
                    System.out.println ("--------------------------------------------");
                }
                total=total + (3.00*q);
             } 
           } 
           if (input == 2) {
             while (input !=0) {
                System.out.println ("Which type of Cookie?");
                 System.out.println ("1. Chocolate Chip");
                 System.out.println ("2. Oatmeal Raisin"); 
                 System.out.println (" ");
                 System.out.println ("0. Return");
                 input=scan.nextInt();
                if (input == 1) {
                     quantity();             
                     d2c = d2c + q;
                     zero();
                } 
                if (input == 2) {
                     quantity();  
                     d2o = d2o + q;
                     zero();
                } 
                if (input<0 || input>2) {
                     System.out.println ("--------------------------------------------");
                     System.out.println ("***Please input a number between 0 and 2.***");
                     System.out.println ("--------------------------------------------");
                 }
                total=total + (1.00*q);
             }
           }
           if (input == 3) {
                System.out.println ("Today's cake flavor is " + d3f + ".");
                quantity();
                total=total + (3.50*q);
                d3 = d3 + q;
               }
         }
           else {
              System.out.println ("--------------------------------------------");
              System.out.println ("***Please input a number between 0 and 3.***");
              System.out.println ("--------------------------------------------");
         }
         
           System.out.println (" "); 
          System.out.println ("===[Delights]===");
            System.out.println ("1. Milkshake          -  $3.00");
            System.out.println ("2. Cookies  (1 Each)  -  $1.00"); 
            System.out.println ("3. Shortcake          -  $3.50");
            System.out.println ("^^^Today's Flavor: " + d3f + " ^^^"); 
            System.out.println (" ");
            System.out.println ("0. Return");
            System.out.println ("Current total payment: $"+total+"0");
         input=scan.nextInt();
        }
        return;    
        
        
    }
    
    public static void zero() 
    {
        input = 0;
        return;
    }
    
    public static void periodicflavor()
    {
        // simulate if a cumstomer came on a different day and the flavor for cake changed periodically 
        Random Rnd = new Random();
        int x = 0;
        String [] specialList = {"Jack Special", "Strawberry Supreme", "Caramel Crunch", "Mango Madness", "Banana Bomb"};
        x = Rnd.nextInt(5); 
        d3f = specialList[x];
        return;
    }
    
    public static void quantity()
    {
         System.out.println ("How many?");
         System.out.println ("(Press '0' to go back.)");
         q=scan.nextInt();
        while (q!=0) { 
         if (q>0 && q<10) {
              System.out.println ("***Adding " + q + " order(s)...***");
              return;
         }
         else if (q==0){
              return;
            }
         else {
              System.out.println ("--------------------------------------------");
              System.out.println ("***Please input a number between 0 and 9.***");
              System.out.println ("--------------------------------------------");
         }
          System.out.println ("How many?");
          System.out.println ("(Press '0' to go back.)");
          q=scan.nextInt();
         // System.out.println (input);
         }
        return;
    }
    
    public static void finalizeorder()
    {
        int [] mealsInt = {a1, a2, a3, a4, a5};
        String [] mealsList = {"Brown Bag Chicken", "Chicken Sandwich", "Jaxwich", "Jackies", "Lil Tenders"};
        double [] mealsCost = {4.5, 4.0, 5.0, 4.0, 3.0};
        for (int i=0 ; i <= mealsInt.length - 1; i++ ) {
            if (mealsInt[i] > 0) {
             System.out.println (mealsInt[i] + " " + mealsList[i] + "(s)" + " $" + mealsCost[i]*mealsInt[i] + "0");
            }
        }
        
        int [] sidesInt = {b1, b2, b3, b4, b5, b6};
        String [] sidesList = {"Waffle Fries", "Jax Fries", "Lil Nuggets", "Kids Mac", "Jaxan Toast", "Coleslaw"};
        double [] sidesCost = {1.5, 2.0, 2.0, 2.0, 1.0, 1.0};
        for (int i=0 ; i <= sidesInt.length - 1; i++ ) {
            if (sidesInt[i] > 0) {
             System.out.println (sidesInt[i] + " " + sidesList[i] + "(s)" + " $" + sidesCost[i]*sidesInt[i] + "0");
            }
        }
        
        int [] refreshmentsInt = {c1p, c1s, c1d, c1f, c2, c3l, c3s, c3m, c4};
        String [] refreshmentsList = {"Pepsi", "Sprite", "Dr. Pepper", "Fanta", "Iced Tea", "Original Lemonade", "Strawberry Lemonade", "Melon Lemonade", "Water Bottle"};
        double [] refreshmentsCost = {1.0, 1.0, 1.0, 1.0, 1.5, 1.5, 1.5, 1.5, 0.5};
        for (int i=0 ; i <= refreshmentsInt.length - 1; i++ ) {
            if (refreshmentsInt[i] > 0) {
             System.out.println (refreshmentsInt[i] + " " + refreshmentsList[i] + "(s)" + " $" + refreshmentsCost[i]*refreshmentsInt[i] + "0");
            }
        }
        
        int [] delightsInt = {d1c, d1v, d1cj, d1s, d2c, d2o};
        String [] delightsList = {"Chocolate Shake", "Vanilla Shake", "Cookies N Jack Shake", "Strawberry Shake", "Chocolate Chip Cookie", "Oatmeal Raisin Cookie"};
        double [] delightsCost = {3.0, 3.0, 3.0, 3.0, 1.0, 1.0};
        for (int i=0 ; i <= delightsInt.length - 1; i++ ) {
            if (delightsInt[i] > 0) {
             System.out.println (delightsInt[i] + " " + delightsList[i] + "(s)" + " $" + delightsCost[i]*delightsInt[i] + "0");
            }
        }
         if (d3 > 0) {
            System.out.println (d3 + " " + d3f + " Short Cake(s)" + " $" + 3.5*d3 + "0");
         } 

    }
}
