package domain.character;

import java.util.Map;
import java.util.Objects;

public class Moods {

    private Map<BasicMood, Integer> basicMoods;
    private Map<Behaviour, Integer> behaviours;

    public Map<BasicMood, Integer> getBasicMoods() {
        return basicMoods;
    }

    public void setBasicMoods(Map<BasicMood, Integer> basicMoods) {
        this.basicMoods = basicMoods;
    }

    public Map<Behaviour, Integer> getBehaviours() {
        return behaviours;
    }

    public void setBehaviours(Map<Behaviour, Integer> behaviours) {
        this.behaviours = behaviours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moods moods = (Moods) o;
        return Objects.equals(basicMoods, moods.basicMoods) &&
                Objects.equals(behaviours, moods.behaviours);
    }

    @Override
    public int hashCode() {

        return Objects.hash(basicMoods, behaviours);
    }

    @Override
    public String toString() {
        return "Moods{" +
                "basicMoods=" + basicMoods +
                ", behaviours=" + behaviours +
                '}';
    }

    enum BasicMood {
        TRUST, // ACCEPTANCE --> ADMIRATION
        JOY, // SERENITY --> ECSTASY
        ANTICIPATION, // INTEREST --> VIGILANCE
        ANGER, // ANNOYANCE --> RAGE
        DISGUST, // BOREDOM --> LOATHING
        SADNESS, // PENSIVENESS --> GRIEF
        SURPRISE, //DISTRACTION --> AMAZEMENT
        FEAR //APPREHENSION --> TERROR
    }

    enum Behaviour {
        //POSITIVE
        LOVING, // TRUST + JOY
        CURIOUS, // TRUST + ANTICIPATION
        AWE, // TRUST + SURPRISE
        LOYAL, // JOY + ANTICIPATION
        WONDER, // JOY + SURPRISE
        AMAZED, // ANTICIPATION + SURPRISE
        ANXIOUS, // ANTICIPATION + FEAR
        SUBMISSIVE, // TRUST + FEAR
        SEEKING_COMFORT, // TRUST + SADNESS
        //NEUTRAL
        CYNICAL, // JOY + ANGER
        MELANCHOLIC, // JOY + SADNESS
        MASOCHISTIC, // JOY + FEAR
        DRAMATIC, // ANGER + SADNESS
        IMPULSIVE, // ANGER + FEAR
        REMORSEFUL, // DISGUST + SADNESS
        SHAMEFUL, // DISGUST + SURPRISE
        INDIFFERENT, // DISGUST + FEAR
        CONFUSED,//FEAR + SURPRISE
        DISAPPOINTED, // ANTICIPATION + SADNESS
        //NEGATIVE
        REBELLIOUS, // TRUST + ANGER
        BETRAYING, // TRUST + DISGUST
        MORBID, // JOY + DISGUST
        AGGRESSIVE, // ANTICIPATION + ANGER
        BETRAYED, // ANTICIPATION + DISGUST
        CONTEMPTIBLE, // ANGER + DISGUST
        OUTRAGED, // ANGER + SURPRISE
        DISAPPROVING, // SADNESS + SURPRISE
        STRESSED // SADNESS + FEAR
    }
}
