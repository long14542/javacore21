package LOL;

import java.util.ArrayList;

public class Team {
    private String name1;
    private String name2;
    private ArrayList<Figure> figures;

    public Team(String name1, String name2, ArrayList<Figure> figures) {
        this.name1 = name1;
        this.name2 = name2;
        this.figures = figures;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name) {
        this.name1 = name;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public ArrayList<Figure> getFigures() {
        return figures;
    }

    public void setFigures(ArrayList<Figure> figures) {
        this.figures = figures;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name1='" + name1 + '\'' +
                ", name2='" + name2 + '\'' +
                ", figures=" + figures +
                '}';
    }
}
