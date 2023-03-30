package sinder;

import java.util.ArrayList;
import java.util.Scanner;
import common.Utils;
import users.Human;
import users.Robot;
public class Main {
    
    public static void main(String[] args) {
        ArrayList<Human> Humans = new ArrayList<>();
        ArrayList<Robot> Robots = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Name");
        String name = sc.nextLine();
        
        
        System.out.println("Age");
        int age = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Gender");
        String gender = sc.nextLine();
        
        System.out.println("Phone");
        int phone = sc.nextInt();
        
        Human humano = new Human(name, age, gender, phone);
        
        Humans.add(humano);
        System.out.println(Humans);
        
        String [] nomes_lista= {"Jose","Manel","Antonio","Duarte","Andre"}; //Name's List
        
        String[] interest_list = { "Música", "Desporto", "Video Jogos", "Cinema", "Teatro", "Ciência", "Viagens",
    			"Literatura", "Empreendorismo", "Séries", "Humor" };
        
        //Creation of robots
        for (int i =0;i<50;i++) {
        	name = nomes_lista[Utils.generateRandomNumber(0, 4)];
        	age = Utils.generateRandomNumber(18, 65);
        	gender = "male";
        	phone = Utils.generateRandomNumber(111111111, 999999999);
        	Robot robot = new Robot(name, age, gender, phone);
        	Robots.add(robot);
        }
        
        //Print of ArrayList
        for (int i =0;i<Robots.size();i++) {
			System.out.println(Robots.get(i));
		}
    }
    
}
