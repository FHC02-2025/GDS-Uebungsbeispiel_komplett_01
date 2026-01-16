package rec;

import java.util.ArrayList;
import java.util.List;

public class Ort {

    private String name;
    private List<Ort> nachbarn;

    public Ort(String name) {
        this.name = name;
        this.nachbarn = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Ort> getNachbarn() {
        return nachbarn;
    }

    public void addNachbar(Ort o) {
        nachbarn.add(o);
    }

    @Override
    public String toString() {
        return name;
    }
}