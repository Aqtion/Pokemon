import java.util.Scanner;

public class Game {
	private GameState gameState;
	public static final Pokemon[] STARTERS = new Pokemon[] {
			new Pokemon("Splagoon", 54, 59, 42, 0, 5, new Type("Water"), null),
			new Pokemon("Rakther", 47, 58, 45, 0, 5, new Type("Fire"), null),
			new Pokemon("Floracot", 52, 78, 65, 0, 5, new Type("Grass"), null)
	};
	public static final String[] GENDERS = new String[] {"Boy" ,"Girl", "Non-Binary"};
	public Game() {
		Pokemon[] party = new Pokemon[PokemonInfo.PARTY_SIZE];
		PokemonInfo pokemonInfo = new PokemonInfo(party);
		TrainerInfo trainerInfo = null;
		LocationInfo locationInfo = null;
		gameState = new GameState(pokemonInfo, trainerInfo, locationInfo);
		
	}
	public void run() {
		intro();
		chooseStarter();
		//TODO add rival battle + rival intializing
		while(true) {
			if(gameState.getState()==GameState.EXPLORE_STATE) {
				//TODO add explore state stuff thingies
			}
			else if(gameState.getState()==GameState.BATTLE_STATE){
				//TODO add battle state stuff thingies
			}
			else {
				throw new RuntimeException("State unknown.");
			}
		}
	}
	public void intro() {
		System.out.println("Hello there! Welcome to the world of pokémon! My name is Redwood! "
				+ "People call me the Pokémon Professor! This world is inhabited by creatures called Pokémon! "
				+ "For some people, Pokémon are pets. Others use them for fights. "
				+ "Myself...I study Pokémon as a profession.");
		System.out.println("So tell me, are you a boy, girl, or non-binary?\n>Boy\n>Girl\n>Non-Binary");
		//TODO make trainer info class
		Scanner getInput = new Scanner(System.in);
		String genderChosen = getInput.next();
		boolean validGenderChosen = false;
		while(!validGenderChosen) {
			for(String gender: GENDERS) {
				if(gender.equals(genderChosen)) {
					genderChosen = gender;
					validGenderChosen = true;
				}
			}
			if(!validGenderChosen) {
				System.out.println("You did not pick a valid gender, try again!");
				System.out.println("So tell me, are you a boy, girl, or non-binary?\\n>Boy\\n>Girl\\n>Non-Binary");
				genderChosen = getInput.next();
			}
		}
		System.out.println("And what is your name?");
		String name = getInput.next();
		//TODO make set trainer info function to pass in user inputted stuffs
		gameState.setTrainerInfo();
	}
	public void chooseStarter() {
		Scanner getInput = new Scanner(System.in);
		System.out.println("Which starter would you like?");
		for(Pokemon pokemon: STARTERS) {
			pokemon.printNameAndType();
		}
		String starterChosen = getInput.next();
		Pokemon chosenStarter = null;
		boolean validStarterChosen = false;
		while(!validStarterChosen) {
			for(Pokemon starter: STARTERS) {
				if(starter.getName().equals(starterChosen)) {
					chosenStarter = starter;
					validStarterChosen = true;
				}
			}
			if(!validStarterChosen) {
				System.out.println("You did not pick a valid starter, try again!");
				System.out.println("Which starter would you like?");
				starterChosen = getInput.next();
			}
		}
		gameState.getPokemonInfo().addPokemon(chosenStarter);
		System.out.println("You have chosen the starter: "+ chosenStarter.getName());
	
	}
	public void explore() {
		//TODO add get location function to locationInfo
		System.out.println("You are here: " + locationInfo.getLocation()+".");
		System.out.println("Where would you like to go?");
		//TODO connecting locations
		
	}
}
