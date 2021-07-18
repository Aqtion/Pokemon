

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Move {
	private int power;
	private Type type;
	private Pokemon pokemon;
	public static final int DAMAGE_MULTIPLY = 2;
	public static final int DAMAGE_DIVIDE = 5;
	public static final int DAMAGE_ADD = 2;
	public static final int TOTAL_DAMAGE_DIVIDE = 50;
	public static final int TOTAL_DAMAGE_ADD = 2;
	public Move(int power) {
		this.power=power;
	}
	public int calcDamage(Pokemon attackingPokemon, Pokemon opposingPokemon) {
		int level = pokemon.getLevel();
		int atk = pokemon.getAttack();
		int def = pokemon.getDefense();
		int firstPart = ((DAMAGE_MULTIPLY*level)/DAMAGE_DIVIDE)+DAMAGE_ADD;
		int secondPart = (power*(atk/def));
		int thirdPart = (firstPart*secondPart)/(TOTAL_DAMAGE_DIVIDE);
		int totalDamage = thirdPart+TOTAL_DAMAGE_ADD;
		return totalDamage;
	}
}
