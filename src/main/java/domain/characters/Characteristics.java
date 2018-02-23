package domain.characters;

import java.util.Map;
import java.util.Objects;

public class Characteristics {

    private Map<PhysicalCharacteristics, Integer> physicalCharacteristics;
    private Map<PsychologicalCharacteristics, Integer> psychologicalCharacteristics;
    private Map<MentalCharacteristics, Integer> mentalCharacteristics;

    public Map<PhysicalCharacteristics, Integer> getPhysicalCharacteristics() {
        return physicalCharacteristics;
    }

    public void setPhysicalCharacteristics(Map<PhysicalCharacteristics, Integer> physicalCharacteristics) {
        this.physicalCharacteristics = physicalCharacteristics;
    }

    public Map<PsychologicalCharacteristics, Integer> getPsychologicalCharacteristics() {
        return psychologicalCharacteristics;
    }

    public void setPsychologicalCharacteristics(Map<PsychologicalCharacteristics, Integer> psychologicalCharacteristics) {
        this.psychologicalCharacteristics = psychologicalCharacteristics;
    }

    public Map<MentalCharacteristics, Integer> getMentalCharacteristics() {
        return mentalCharacteristics;
    }

    public void setMentalCharacteristics(Map<MentalCharacteristics, Integer> mentalCharacteristics) {
        this.mentalCharacteristics = mentalCharacteristics;
    }

    @Override
    public String toString() {
        return "Characteristics{" +
                "physicalCharacteristics=" + physicalCharacteristics +
                ", psychologicalCharacteristics=" + psychologicalCharacteristics +
                ", mentalCharacteristics=" + mentalCharacteristics +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Characteristics that = (Characteristics) o;
        return Objects.equals(physicalCharacteristics, that.physicalCharacteristics) &&
                Objects.equals(psychologicalCharacteristics, that.psychologicalCharacteristics) &&
                Objects.equals(mentalCharacteristics, that.mentalCharacteristics);
    }

    @Override
    public int hashCode() {

        return Objects.hash(physicalCharacteristics, psychologicalCharacteristics, mentalCharacteristics);
    }

    enum PhysicalCharacteristics {
        STANCE, //RANGED, MELEE
        STRENGTH, //Hitpoint damage dealt per successful melee strike
        FOCUS, //Hitpoint damage dealt per successful ranged strike
        DEXTERITY, //Increases the chance of a successful melee strike & decreases the chance of being successfully struck in melee
        OBSERVATION, //Increases the chance of a successful ranged attack strike & decreases the chance of being successfully struck by ranged attacks
        DEFENCE, //Reduces both spell and weapon damage taken. Doesn't improve with level.
        LUCK, //Probability, as a fraction of 255, that a creature will do a double attack/cast in a single swing or make two Skill rolls against an enemy swing. Doesn't improve with level.
        HEALTH, //Maximum trauma rating at Level 10.
        WALKING_SPEED,//The creature's speed on a scale of 0 (Immobile) to 255, about a quarter of the map's width per second
        HUNGER,//Chickens demanded ∕ Meal Time turn interval
        SLEEP_HEALING//Hitpoints regained per turn in Lair.
    }

    enum PsychologicalCharacteristics {
        GREED, // --> can lead to cupidity & avarice. Impacts Salary: amount per Payday at Level 10, which occurs every 10,000 Turns, about 9 minutes real-time.
        LUST,// --> can result to kinkiness & abuse. Kinky: marked by unconventional sexual preferences or behavior, as fetishism, sadomasochism, or the like.
        GLUTTONY,// --> can result to famine & selfishness
        SLOTH,// --> can result to passivity & despair
        WRATH,// --> can result to impatience & revenge
        ENVY,// --> can result to jealousy & narcissism
        PRIDE,// --> can result to sulking & vainglory . All sulky Creatures can start moping around the Dungeon. This task increases their Anger rapidly.
        CHASTITY,//Purity, abstinence  <> Lust
        TEMPERANCE,// Humanity, equanimity 	<> Gluttony
        CHARITY,// Will, benevolence, generosity, sacrifice  <>	Greed
        DILIGENCE,//Persistence, Effort, ethics <> 	Sloth
        PATIENCE, // Forgiveness, mercy <> 	Wrath
        KINDNESS, //Satisfaction, compassion <> 	Envy
        HUMILITY// Bravery, modesty, reverence 	<> Pride
    }

    enum MentalCharacteristics {
        LIBRARY_SKILL,//Research Points contributed per turn to the current project - scales with Level.
        WORKSHOP_SKILL,//MFG Points contributed per turn to the current project - scales with Level.
        TRAINING_SKILL,//Experience points gained per turn while Training.
        TRAINING_COST,//Gold deducted per 64 turns in Training.
        SCAVENGE_SKILL,//Points contributed per turn towards Scavenging a target - scales with Level.
        SCAVENGE_COST,//Gold deducted per 64 turns while Scavenging.
        SLEEP_ANGER,//Annoyance, on a scale of 0 or negative (Happy) to 5000 (Angry), per turn Sleeping. Positive for Horned Reapers.
        SLAP_ANGER,//Annoyance when the creature is slapped. Varies greatly. Negative for Mistresses.
        PRAYING_SKILL // Annoyance per turn using Temple. Positive for Vampires. Not listed because it's extremely fast for all creatures, generally ten to fifty times faster than Sleep, so as to make no difference comparing.
    }
}
