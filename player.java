import java.util.Scanner;
class Player{
    String name;
    int average;
    char team;

    Player( String name,int average,char team){
        this.name = name;
        this.average= average;
        this.team= team;
    }
    void change(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your average: ");
        int average = input.nextInt();
        System.out.print("Enter your team: ");
        char team = input.next().charAt(0);
    }
    
    void display(){
        System.out.println("This is your name: "+ name);
        System.out.println("This is your average: "+ average);
        System.out.println("This is your team: "+ team);

    }
    public static void main(String []args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your average: ");
        int average = input.nextInt();
        System.out.print("Enter your team: ");
        char team = input.next().charAt(0);

        Player p1 = new Player(name, average,team);
        p1.change();
        p1.display();
        
        System.out.println("You can type here again to change the data: ");
        Player p2 = new Player(name, average,team);
        p2.change();
        p2.display();
        
        

    }


}