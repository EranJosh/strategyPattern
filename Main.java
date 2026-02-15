public class Main {
    public static void main(String[] args) {
        Knight knight = new Knight();
        Wizard wizard = new Wizard();
        Archer archer = new Archer();

        System.out.println("=== Knight ===");
        knight.attack();
        knight.defend();

        System.out.println("\n=== Wizard ===");
        wizard.attack();
        wizard.defend();

        System.out.println("\n=== Archer ===");
        archer.attack();
        archer.defend();
    }
}