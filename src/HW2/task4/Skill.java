package HW2.task4;

import lombok.Getter;

@Getter
public class Skill {
    private String title;
    private int experience;

    public Skill() {
    }

    public Skill(String title, int experience) {
        this.title = title;
        this.experience = experience;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "title='" + title + '\'' +
                ", experience=" + experience +
                '}';
    }
}