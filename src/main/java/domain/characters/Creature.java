package domain.characters;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
public abstract class Creature {
    private String name;
    private Integer level;
    private Characteristics characteristics;
    private Moods moods;
    private Long health;

    public Creature(String name, Integer level, Characteristics characteristics, Moods moods, Long health) {
        this.name = name;
        this.level = level;
        this.characteristics = characteristics;
        this.moods = moods;
        this.health = health;
    }

    public abstract void dig();
    public abstract void fight();
    public abstract void flee();
    public abstract void destroy();
    public abstract void eat();
    public abstract void study();
    public abstract void manufacture();
    public abstract void train();
    public abstract void scavenge();
    public abstract void sleep();
    public abstract void protect();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Characteristics getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(Characteristics characteristics) {
        this.characteristics = characteristics;
    }

    public Moods getMoods() {
        return moods;
    }

    public void setMoods(Moods moods) {
        this.moods = moods;
    }

    public Long getHealth() {
        return health;
    }

    public void setHealth(Long health) {
        this.health = health;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Creature creature = (Creature) o;
        return Objects.equals(name, creature.name) &&
                Objects.equals(level, creature.level) &&
                Objects.equals(characteristics, creature.characteristics) &&
                Objects.equals(moods, creature.moods) &&
                Objects.equals(health, creature.health);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, level, characteristics, moods, health);
    }

    @Override
    public String toString() {
        return "Creature{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", characteristics=" + characteristics +
                ", moods=" + moods +
                ", health=" + health +
                '}';
    }
}
