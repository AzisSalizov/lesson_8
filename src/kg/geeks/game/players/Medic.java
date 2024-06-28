package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Medic extends Hero {
    int healAmount = RPG_Game.random.nextInt(10) + 1;

    public Medic(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.HEAL);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (Hero hero : heroes) {
            if (hero.getHealth() < 100 && hero.getHealth() > 0 && hero != this) {
                hero.setHealth(hero.getHealth() + healAmount);
                System.out.println("Medic  healed " +  hero.getName() + " on " + healAmount + " amount health " + hero.getHealth() + " health");
                break;
            }
        }
    }

}
