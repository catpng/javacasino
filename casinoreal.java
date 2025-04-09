import javax.swing.JOptionPane;
import java.util.Random;

public class casinoreal{
  public static void main(String[]args){
    int token = 100;
    int change = 0;
    
    String user = JOptionPane.showInputDialog("Username: ");   
    int count = 0;
    String option = "";
    
    while (count<3){
      String password = JOptionPane.showInputDialog("Password ");
      if (password.equals("secret")){
        
        JOptionPane.showMessageDialog(null,"Welcome "+user+"!");
        option  = JOptionPane.showInputDialog(" a. dice b. roulette c. reset password d. cash out");
        break;
      }
      else{
        JOptionPane.showMessageDialog(null,"invalid");
        count =  count+1;
      }
    }
    
    Random random = new Random();
    
    String firstlastAlphabet = "abcdefghijklmnopqrstuvwxyz";
    int firstNum = random.nextInt(26);
    String first = firstlastAlphabet.substring(firstNum,(firstNum+1));
    if (firstNum%2==0){
      first = first.toUpperCase();
    }
    
    String Alphabet = "abcdefghijklmnopqrstuvwxyz1234567890";
    int twoNum = random.nextInt(36);
    String two = Alphabet.substring(twoNum,(twoNum+1));
    if ((twoNum-10)%2==0){
      two = two.toUpperCase();
    }

    int threeNum = random.nextInt(36);
    String three = Alphabet.substring(threeNum,(threeNum+1));
    if ((threeNum-10)%2==0){
      three = three.toUpperCase();
    }
    
    int fourNum = random.nextInt(36);
    String four = Alphabet.substring(fourNum,(fourNum+1));
    if ((fourNum-10)%2==0){
      four = four.toUpperCase();
    }

    int fiveNum = random.nextInt(36);
    String five = Alphabet.substring(fiveNum,(fiveNum+1));
    if ((fiveNum-10)%2==0){
      five = five.toUpperCase();
    }
    
    int lastNum = random.nextInt(26);
    String last = firstlastAlphabet.substring(lastNum,(lastNum+1));
    if (lastNum%2==0){
      last = last.toUpperCase();
    }
    
    
    while (!option.equalsIgnoreCase("d")){
      if (option.equalsIgnoreCase("c")){
        String randPassword = first+two+three+four+five+last;
        JOptionPane.showMessageDialog(null,"New password: " + randPassword);
      }
      
      if (option.equalsIgnoreCase("a")){
        int sum = random.nextInt(6) + random.nextInt(6);
        String guess = JOptionPane.showInputDialog("Enter guess (4-12) ");
        int crapsGuess = Integer.parseInt(guess);
        if (crapsGuess == sum){
          JOptionPane.showMessageDialog(null,"Win");
        }
        
        else if ((sum == 2) || (sum == 3)){
          sum = random.nextInt(6)+random.nextInt(6);
          if (crapsGuess == sum){
            JOptionPane.showMessageDialog(null,"Win");
          }
          else{
            JOptionPane.showMessageDialog(null,"loss");
          }
        }
        
        else{
          JOptionPane.showMessageDialog(null,"loss");
        }
      }
      
      option  = JOptionPane.showInputDialog(" a. dice b. roulette c. reset password d. cash out");
    }
    
    if (option.equalsIgnoreCase("d")){
      JOptionPane.showMessageDialog(null,"Balance: " + token + "\nloss/gains: " + change);
      int a = (random.nextInt(50));
      int b = (random.nextInt(50));
      int c = (random.nextInt(10));
      int answer = a+b*c;
      int x= 0;
      while (x<3){
        String sol = JOptionPane.showInputDialog("What is " + a + "+" + b + "*" + c + "?");
        int solution = Integer.parseInt(sol);
        if (solution != answer){
          x=x+1;
          JOptionPane.showMessageDialog(null,"wrong");
        }
        else{
          JOptionPane.showMessageDialog(null,"cashed out \nthank you for using the virtual casino!");
          break;
        }
      }
    }
  }
}