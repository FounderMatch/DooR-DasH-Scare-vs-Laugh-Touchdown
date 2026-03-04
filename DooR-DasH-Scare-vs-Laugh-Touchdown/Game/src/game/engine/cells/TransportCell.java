package game.engine.cells;
public abstract class TransportCell extends Cells {
    int effect;
    
    public TransportCell(String name, int effect) {
        super(name);
        this.effect = effect;
    }
     class ConveyorBelt extends TransportCell {
        public ConveyorBelt(String name, int effect) {
            super(name, effect); // effect is always positive
    }
}
    class ContaminationSock extends TransportCell {
        public ContaminationSock(String name, int effect) {
            super(name, effect); // effect is always negative
    }
}
}
