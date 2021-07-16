package pokemon.states;

public abstract class GameState {
	private PokemonInfo myPokemonInfo;
	private TrainerInfo myTrainerInfo;
	private LocationInfo locationInfo;
	
	public GameState(PokemonInfo myPokemonInfo, TrainerInfo myTrainerInfo, LocationInfo locationInfo) {
		this.myPokemonInfo = myPokemonInfo;
		this.myTrainerInfo = myTrainerInfo;
		this.locationInfo = locationInfo;
		
		
	}
}
