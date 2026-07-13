package Java_Polymorphism;

class GameCharacter {
    String characterName;

    GameCharacter(String n) {
        characterName = n;
    }

    void performAttack() {
    }
}

class Warrior extends GameCharacter {
    Warrior(String n) {
        super(n);
    }

    void performAttack() {
        System.out.println(characterName + " Sword");
    }
}

class Mage extends GameCharacter {
    Mage(String n) {
        super(n);
    }

    void performAttack() {
        System.out.println(characterName + " Magic");
    }
}

class Archer extends GameCharacter {
    Archer(String n) {
        super(n);
    }

    void performAttack() {
        System.out.println(characterName + " Arrow");
    }
}

public class AdventureGameCharacterSystem {
    static void startBattle(GameCharacter[] c) {
        int w = 0, m = 0, a = 0;
        for (GameCharacter g : c) {
            g.performAttack();
            if (g instanceof Warrior) w++;
            else if (g instanceof Mage) m++;
            else if (g instanceof Archer) a++;
        }
        System.out.println(w + " " + m + " " + a);
    }

    public static void main(String[] args) {
        startBattle(new GameCharacter[]{new Warrior("W"), new Mage("M"), new Archer("A"), new Warrior("X")});
    }
}