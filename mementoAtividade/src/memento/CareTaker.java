package memento;

import java.util.ArrayList;

public class CareTaker {
    private ArrayList<Memento<String>> states;

    public CareTaker(){
        states = new ArrayList<>();
    }

    public void addMemento(Memento<String> memento){
        states.add(memento);
    }

    public Memento<String> getLastMemento(){
        if(states.isEmpty()){
            return new Memento<String>("");
        }
        Memento<String> savedState = states.get(states.size() - 1);
        states.remove(states.size() - 1);
        return savedState;
    }
}
