/* 
	TODO:
	Package declaration if necessary 	 
*/

import java.util.Random;

class Hero {
	/* 
		TODO:
		Provide the appropriate access modifiers for: the attributes and constants, the class and constructor
	*/
	String name;
	int life;
	int mana;
	boolean alive;
	Duel duel;			// to monitor which duel the hero was added to
	
	final static String DARNA = "Darna";
	final static String PANDAY = "Panday";
	final static String CAPTAIN_BARBELL = "Captain Barbell";
	final static String STARLA = "Starla";
	final static String VICTOR = "Victor Magtanggol";
	final static String PEDRO = "Pedro Penduko";
	final static int ATTACK_DAMAGE = 7;
	final static int RESPAWN_COST = 7;
	final static int RESPAWN_LIFE = 7;
	
	final static int MIN_LIFE = 15;
	final static int MAX_LIFE = 25;
	final static int MIN_MANNA = 10;
	final static int MAX_MANNA = 15;
	
	
	Hero(String name) {
		Random r = new Random();
		
		this.name = name;
		this.life = r.nextInt(Hero.MAX_LIFE-Hero.MIN_LIFE+1)+Hero.MIN_LIFE; // randomizes int values from 15-25
		this.mana = r.nextInt(Hero.MAX_MANNA-Hero.MIN_MANNA+1)+Hero.MIN_MANNA; // randomizes int values from 10-15
		this.alive = true;
	}
	
	/* 
		TODO:
		Complete displayState() and provide the most appropriate access modifier 
	*/

	//	void displayState() {}
	
	
	/* 
		TODO:
		Provide the most appropriate access modifier for this method
	*/
	void attack(Hero opponent) {
		System.out.println(this.name+" attacks "+opponent.name);
		
		if(opponent.life-Hero.ATTACK_DAMAGE>0)		
			opponent.life -= Hero.ATTACK_DAMAGE;
		
		else {					// if deducting 5 will result to 0 or negative
			System.out.println(">> Hero "+this.name+" has been slain!");
			
			opponent.life = 0;
			opponent.respawn();
		}
	}

	/* 
		TODO:
		Complete the code and provide the most appropriate access modifier for this method
		Note to properly encapsulate the attributes being accessed: Call the necessary setter(s) and getter(s)
	*/
	void respawn() {
		// check if the hero can afford respawn
			// reset life and manna
			// print respawned message
		// otherwise, hero is deads
		// number of heroes in the duel is decreased
	}

	/* 
		TODO:
		Create the necessary getter(s) to properly encapsulate this class
		Make sure to use the most appropriate access modifier(s)
	*/

	/* 
		TODO:
		Create the necessary setter(s) to properly encapsulate this class
		Make sure to use the most appropriate access modifier(s)
	*/

}

