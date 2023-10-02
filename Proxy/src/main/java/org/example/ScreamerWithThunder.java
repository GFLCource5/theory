package org.example;

public class ScreamerWithThunder implements Screamer{
    
    private final Screamer screamer;

    public ScreamerWithThunder(Screamer screamer) {
        this.screamer = screamer;
    }

    @Override
    public String scream() {
        return screamer.scream() + "\n *sound of thunder*";
    }
}
