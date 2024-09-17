package HW4.task2;

class Skill {
    String title;
    int exp;

    public Skill(String title, int exp) {
        this.title = title;
        this.exp = exp;
    }

    @Override
    public String toString() {
        return title + " (exp: " + exp + ")";
    }
}