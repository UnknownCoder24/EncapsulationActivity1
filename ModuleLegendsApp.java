/* 
	TODO:
	Package declaration if necessary 	 
*/


import java.util.Scanner;

/* 
	TODO:
	Import statements if necessary 
*/

class ModuleLegendsApp {
	
	public static void main(String[] args){
		
		Duel newDuel = new Duel();		// creates duel where heroes can fight
		
		// creates three hero options to choose from
		Hero darna = new Hero(Hero.DARNA);
		Hero captain = new Hero(Hero.CAPTAIN_BARBELL);
		Hero panday = new Hero(Hero.PANDAY);

		Hero[] heroOptions = {darna, captain, panday};
		
		Scanner scan=new Scanner(System.in);
		int choice = 0;
		int heroIndex = 0;

		do{
			System.out.println("\n\t********MENU********");
			System.out.println("\t[1] Add Hero");
			System.out.println("\t[2] Begin Duel");
			System.out.println("\t[3] Display Duel Info");
			System.out.println("\t[0] EXIT");
			System.out.print("Choice: ");
			
			try {
				choice = scan.nextInt();
			} catch(Exception e) {
				System.out.println("Invalid input.");
				System.exit(1);
			}
			
			switch(choice){
				case 1: 
						
						System.out.println("\n\nChoose a hero:\n");
						for(int i=0;i<heroOptions.length;i++) {
							System.out.println("\t["+(i+1)+"] " + heroOptions[i].getName());
						}
						System.out.print("Choice: ");
						
						try {
							heroIndex = scan.nextInt();
						} catch(Exception e) {
							System.out.println("Invalid input.");
							System.exit(1);
						}
						
						// add chosen hero to duel
						if(heroIndex > 0 && heroIndex <= heroOptions.length) {
							// add hero to the duel
							newDuel.addHero(heroOptions[heroIndex-1]);
						} else System.out.println("Invalid choice.");
						break;
						
				case 2: System.out.print("\n\nEnter no. of rounds: ");
						int rounds = scan.nextInt();
						// start the duel
						newDuel.begin(rounds);
						break;

				case 3: newDuel.viewState();
						break;
				case 0: break;
				default: System.out.println("Invalid choice!");
			}
			
		}while(choice!=0);

	}
}