package game.engine.cells;
import game.engine.monsters.Monster;
public class MonsterCell extends Cells {

    private Monster cellMonster;
    
    public MonsterCell(String name, Monster monster) {
        super(name);
        cellMonster = monster;
    }
}
