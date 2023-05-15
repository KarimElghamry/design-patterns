package structural.flyweight.graphics;

import java.util.HashMap;
import java.util.Map;

// Flyweight Factory
public class CharacterFactory {
    private final Map<String, Character> characterPool;

    public CharacterFactory() {
        this.characterPool = new HashMap<String, Character>();
    }

    public Character getCharacter(String c) {
        if (this.characterPool.containsKey(c))
            return this.characterPool.get(c);

        this.characterPool.put(c, new Character(c));
        return this.characterPool.get(c);
    }
}
