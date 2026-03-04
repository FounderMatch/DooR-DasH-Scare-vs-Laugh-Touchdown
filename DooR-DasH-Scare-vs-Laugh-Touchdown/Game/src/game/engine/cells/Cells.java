package game.engine.cells;

import game.engine.monsters.Monster;

public class Cells {

    
    private String name;
    public Monster monster;
    
    public Cells(String name) {
        this.name = name;
        monster = null;
    }
    public String getName(){
        return name;
    }
    public Monster getMonster(){
        return monster;
    }
    public void setMonster(Monster m){
        monster=m;
    }
}
