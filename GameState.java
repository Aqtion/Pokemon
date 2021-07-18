public abstract class GameState {
	private PokemonInfo myPokemonInfo;
	private TrainerInfo myTrainerInfo;
	private LocationInfo locationInfo;
	public static final int EXPLORE_STATE = 1;
	public static final int BATTLE_STATE = 2;
	public static final int UNKNOWN_STATE = 0;
	private int state;
	public GameState(PokemonInfo myPokemonInfo, TrainerInfo myTrainerInfo, LocationInfo locationInfo) {
		this.myPokemonInfo = myPokemonInfo;
		this.myTrainerInfo = myTrainerInfo;
		this.locationInfo = locationInfo;
		
		
	}
	public PokemonInfo getPokemonInfo() {
		return myPokemonInfo;
	}
	public TrainerInfo getTrainerInfo() {
		return myTrainerInfo;
	}
	public LocationInfo getLocationInfo() {
		return locationInfo;
	}
	public int getState() {
		return state;
	}
	public void setState(int newState) {
		state = newState;
	}
}