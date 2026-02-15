import java.util.ArrayList;
import java.util.List;

public class Character {
    private AttackStrategy attackStrategy;
    private List<DefenseStrategy> defenseStrategies;

    public Character(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
        this.defenseStrategies = new ArrayList<>();
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void addDefenseStrategy(DefenseStrategy defenseStrategy) {
        this.defenseStrategies.add(defenseStrategy);
    }

    public void attack() {
        attackStrategy.attack();
    }

    public void defend() {
        for (DefenseStrategy strategy : defenseStrategies) {
            strategy.defend();
        }
    }
}