package pokemon.states.info;

public class Pokemon {
	public static final int CONSTANT_LEVEL_ADD = 101;
	public static final int MULTIPLY_LEVEL = 5;
	public static final int XP_NEEDED_MULTIPLY = 150;
	public static final int BASE_MULTIPLY = 3;
	public static final int BASE_ADD = 1;
	private int currentHP;
	private int hp;
	private int atk;
	private int def;
	private int xp;
	private int level;
	private PokemonType type;
	private Move[] moves;
	
	public Pokemon(int hp, int atk, int def, int xp, int level, Move[] moves) {
		this.hp=hp;
		this.atk=atk;
		this.def=def;
		this.xp=xp;
		this.level=level;
		this.moves = moves;
	}
	public void defeatedPokemon(int opponentLevel) {
		int XPGained = calculateXPGained(opponentLevel);
		xp+=XPGained;
		while(xp>=level*XP_NEEDED_MULTIPLY) {
			xp-=level*XP_NEEDED_MULTIPLY;
			levelUP();
		}
	}
	public void levelUP() {
		level++;
		int hpChange = generateFactor();
		hp+=hpChange;
		currentHP+=hpChange;
		atk+=generateFactor();
		def+=generateFactor();
	}
	public void heal() {
		currentHP=hp;
	}
	public void takeDamage(int amountDamageTaken) {
		currentHP-=amountDamageTaken;
		currentHP=Math.max(currentHP, 0);
	}
	public boolean isFainted() {
		return currentHP<=0;
	}
	private int generateFactor() {
		int factor = (int)(Math.random()*BASE_MULTIPLY)+BASE_ADD;
		return factor;
	}
	private int calculateXPGained (int opponentLevel){
		int XP = (opponentLevel-level)+CONSTANT_LEVEL_ADD;
		XP*=MULTIPLY_LEVEL;
		return XP;
	}
	public int getLevel() { 
	    return level;
	}
	public int getAttack() {
		return atk;
	}
	public int getDefense() {
		return def;
	}
	public int getCurrentHP() {
		return currentHP;
	}
	public Move[] getMoves() {
		return moves;
	}
}
