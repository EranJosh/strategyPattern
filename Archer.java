public class Archer extends Character {
    public Archer() {
        super(new ShootArrow());
        addDefenseStrategy(new Dodge());
    }
}