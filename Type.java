package pokemon.states.info;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Type {
	private String type;
	private static Map<Type, List<String>> superEffective = new HashMap<Type, List<String>>();
	public Type(String type) {
		this.type = type;
	}
	static {
		superEffective.put(new Type("Bug"), new ArrayList<String>(Arrays.asList("Grass", "Dark", "Psychic")));
		superEffective.put(new Type("Dark"), new ArrayList<String>(Arrays.asList("Ghost","Psychic")));
		superEffective.put(new Type("Dragon"), new ArrayList<String>(Arrays.asList("Dragon")));
		superEffective.put(new Type("Electric"), new ArrayList<String>(Arrays.asList("Flying", "Water")));
		superEffective.put(new Type("Fairy"), new ArrayList<String>(Arrays.asList("Fighting", "Dark", "Dragon")));
		superEffective.put(new Type("Fire"), new ArrayList<String>(Arrays.asList("Grass", "Bug", "Ice", "Steel")));
		superEffective.put(new Type("Flying"), new ArrayList<String>(Arrays.asList("Bug", "Fighting", "Grass")));
		superEffective.put(new Type("Ghost"), new ArrayList<String>(Arrays.asList("Ghost", "Psychic")));
		superEffective.put(new Type("Grass"), new ArrayList<String>(Arrays.asList("Ground", "Rock", "Water")));
		superEffective.put(new Type("Ground"), new ArrayList<String>(Arrays.asList("Electric", "Fire", "Poison", "Rock", "Steel")));
		superEffective.put(new Type("Ice"), new ArrayList<String>(Arrays.asList("Dragon", "Flying", "Grass", "Ground")));
		superEffective.put(new Type("Poison"), new ArrayList<String>(Arrays.asList("Fairy", "Grass")));
		superEffective.put(new Type("Psychic"), new ArrayList<String>(Arrays.asList("Fighting", "Poison")));
		superEffective.put(new Type("Rock"), new ArrayList<String>(Arrays.asList("Bug", "Fire", "Flying", "Ice")));
		superEffective.put(new Type("Steel"), new ArrayList<String>(Arrays.asList("Fairy", "Ice", "Rock")));
		superEffective.put(new Type("Water"), new ArrayList<String>(Arrays.asList("Fire", "Ground", "Rock")));
		
	}
}
