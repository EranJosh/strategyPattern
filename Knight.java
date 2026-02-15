public class Knight extends Character {
    public Knight() {
        super(new SwingSword());
        addDefenseStrategy(new Shield());
        addDefenseStrategy(new Dodge());
        addDefenseStrategy(new CreateMagic());
    }
}