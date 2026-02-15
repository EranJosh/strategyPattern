public class Wizard extends Character {
    public Wizard() {
        super(new CastSpell());
        addDefenseStrategy(new CreateMagic());
    }
}