import java.util.Scanner;
import java.util.ArrayList;
public class hotelbilling {
  public static void main(String []args){
      String name="null";
      String ItemName="null";
      int ItemPrize=0;
      int ItemId=0;
      int ItemQuantity=0;
      int SubTotal=0;
      int GrandTotal=0;
       String choice="y";
       int Total=0;
       int tax=0;
      
       ArrayList<Bill>al =new ArrayList<Bill>();
      Scanner scanner =new Scanner(System.in);
      System.out.println("Welcome to Mom's cook hotel");
      while(choice.equalsIgnoreCase("y")){
      System.out.println("Dear Customer, Enter your name");
      name=scanner.nextLine();
      System.out.println(" Dear "+ name +" Todays menu special");
      System.out.println("___________________________________");
      System.out.println("ItemId     ItemName       ItemPrize");
      System.out.println(" 52      MushroomBiriyani    80 ");
      System.out.println(" 63      Mushroom65          90 ");
      System.out.println(" 58      WaterBottel         10 ");
      System.out.println("__________________________________");
      System.out.println("Enter the ItemID");
      ItemId=scanner.nextInt();
      System.out.println("Enter the ItemQuantity");
      ItemQuantity=scanner.nextInt();
      switch(ItemId){
          case 52: 
              ItemName="MushroomBiriyani";
              ItemPrize=80;
              SubTotal=ItemPrize*ItemQuantity;
              break;
          case 63:
              ItemName="Mushroom65";
              ItemPrize=90;
              SubTotal=ItemPrize*ItemQuantity;
              break;
          case 58:
              ItemName="WaterBottel";
              ItemPrize=10;
              SubTotal=ItemPrize*ItemQuantity;
              break;
          default: System.out.println("Invalid Choice ! please select betwwen above given ItemId numbers");
          break;
      }
      GrandTotal=SubTotal+GrandTotal;
      SubTotal=ItemPrize*ItemQuantity;
      System.out.println(" ItemName= "+ItemName+"  ItemPrize= "+ItemPrize+"   ItemQuantity="+ItemQuantity+"  SubTotal is= "+SubTotal);
      Bill b=new Bill(ItemId,ItemName,ItemPrize,ItemQuantity,SubTotal);
      al.add(b);
      while(true){
          System.out.println("Could you order anything more(y/n)");
          choice=scanner.next();
          if(choice.equalsIgnoreCase("y")||choice.equalsIgnoreCase("n")){
              break;
          }
          else{
              System.out.println("Enter a valid input");
          }
          
          }
      }
      int tipAmount=0;
      while(true){
          System.out.println(" Would you want give tip(y/n) ");
          String tip=scanner.next();
      
      if(tip.equalsIgnoreCase("y")){
          System.out.println("how much do you want to tip ");
          tipAmount=scanner.nextInt();
      }
      else if(tip.equalsIgnoreCase("n")){
          break;
      }else{
          System.out.println("Entera valid input" );
  }
      }
      System.out.println("_____________________________________________________");
      System.out.println("ItemId      ItemName            ItemPrize      ItemQuantity      SubTotal");
      System.out.println("_____________________________________________________");
      for(int i=0;i<=al.size()-1;i++){
              System.out.println(al.get(i));
      }
      System.out.println("______________________________________________________");
      System.out.println(" Dear "+name+" Your Final Bill is= "+GrandTotal);
       tax=(GrandTotal*5)/100;
      System.out.println("Tax amount is = "+tax);
      Total=GrandTotal+tax+tipAmount;
      System.out.println("Total payable amount is "+Total);
      System.out.println("Tip amount is given = "+tipAmount);
}
}
class Bill{
    int ItemId;
    String ItemName;
    int ItemPrize;
    int ItemQuantity;
    int SubTotal;
    
     public Bill(int ItemId,String ItemName,int ItemPrize,int ItemQuantity,int SubTotal){
         super();
        this.ItemId=ItemId;
        this.ItemName=ItemName;
        this.ItemPrize=ItemPrize;
        this.ItemQuantity=ItemQuantity;
        this.SubTotal=SubTotal;
     }  
        public String toString(){
            return ItemId+"        "+ItemName+"        "+ItemPrize+"        "+ItemQuantity+"        "+SubTotal;
        
    }
}
