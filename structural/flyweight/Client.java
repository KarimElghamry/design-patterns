package structural.flyweight;

import structural.flyweight.graphics.CharacterFactory;
import structural.flyweight.graphics.Graphic;

public class Client {
    public static void main(String[] args) {
        // init flyweight factory
        final CharacterFactory characterFactory = new CharacterFactory();

        // getting flyweights
        final Graphic a1 = characterFactory.getCharacter("a");
        final Graphic a2 = characterFactory.getCharacter("a");
        final Graphic b1 = characterFactory.getCharacter("b");
        final Graphic b2 = characterFactory.getCharacter("b");

        // passing extrinsic state
        a1.Draw(0, 0);
        a2.Draw(1, 0);

        // proof that the same objects are shared
        System.out.println(a1 == a2);
        System.out.println(b1 == b2);
    }
}
