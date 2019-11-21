import java.util.Scanner;
class SwordNames{
    String firstName(char name1){
        switch(name1){
            case 'A':return "King";
                    
            case 'B':return "Kingdom";
                    
            case 'C':return "Power";
                    
            case 'D':return "Throne";
                    
            case 'E':return "War";
                    
            case 'F':return "Blood";
                    
            case 'G':return "Noble";
                    
            case 'H':return "Wealth";
                    
            case 'I':return "Lord";
                    
            case 'J':return "Dragon";
                    
            case 'K':return "Trust";
                    
            case 'L':return "Heart";
                    
            case 'M':return "Night";
                    
            case 'N':return "Undead";
                    
            case 'O':return "Protection";
                    
            case 'P':return "Oath";
                    
            case 'Q':return "Betrayal";
                    
            case 'R':return "Dark";
                    
            case 'S':return "Light";
                    
            case 'T':return "Death";
                    
            case 'U':return "Beast";
                    
            case 'V':return "Queen";
                    
            case 'W':return "Castle";
                    
            case 'X':return "Prince";
                    
            case 'Y':return "Peace";
                    
            case 'Z':return "Lineage";
                    
            default:return "Invalid!!Error";
        }
    }
    String secondName(int bday){
        switch(bday){
            case 1:return "Killer";
                    
            case 2:return "Slayer";
                    
            case 3:return "Protector";
                    
            case 4:return "Destroyer";
                    
            case 5:return "Halter";
                    
            case 6:return "Giver";
                    
            case 7:return "Dealer";
                    
            case 8:return "Provider";
                    
            case 9:return "Stinger";
                    
            case 10:return "Bringer";
                    
            case 11:return "Taker";
                    
            case 12:return "Striker";
                    
            case 13:return "Shatterer";
                    
            case 14:return "Finisher";
                    
            case 15:return "Torturer";
                    
            case 16:return "Waster";
                    
            case 17:return "Defender";
                    
            case 18:return "Guardian";
                    
            case 19:return "Watcher";
                    
            case 20:return "Keeper";
                    
            case 21:return "Abolisher";
                    
            case 22:return "Wielder";
                    
            case 23:return "Gainer";
                    
            case 24:return "Slasher";
                    
            case 25:return "Breaker";
                    
            case 26:return "Piercer";
                    
            case 27:return "Crusher";
                    
            case 28:return "Defeater";
                    
            case 29:return "Divider";
                    
            case 30:return "Dispatcher";
                    
            case 31:return "Punisher";
                    
            default:return "Invalid day of the month!";
        }
    }
}

class SwordNameGenerator{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your first name:");
        char name=input.next().charAt(0);
        System.out.print("\nEnter the day of your birth:");
        int dob=input.nextInt();
        SwordNames S=new SwordNames();
        String n1=S.firstName(name);
        String n2=S.secondName(dob);
        if(n1=="Invalid!!Error" && n2=="Invalid day of the month!"){
            System.out.println("Okay so you are ineligible !! Go fetch the mead...");
            System.exit(0);
        }
        if(n1=="Invalid!!Error"){ 
            System.out.println("Punctuation ,please!");
            System.exit(0);
        }
        if(n2=="Invalid day of the month!"){
            System.out.println(n2);
            System.exit(0);
        }
        System.out.println("\nYour Legendary Sword Name is : "+n1+n2);
    }
}            
