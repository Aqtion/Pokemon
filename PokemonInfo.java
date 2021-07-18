public class PokemonInfo {
	private Pokemon[] party;
	public static final int PARTY_SIZE = 6;
	public PokemonInfo(Pokemon[] party) {
		this.party = party;
	}
	public void addPokemon(Pokemon pokemon) {
		for(int i=0; i<PARTY_SIZE; i++) {
			if(party[i]==null) {
				party[i]=pokemon;
			}
		}
	}
}
