package Wrapper.wrapper;

import Wrapper.Talking;

abstract class AbsTalking implements Talking {

    protected Talking talking;

    public AbsTalking(Talking talking) {
        this.talking = talking;
    }

    @Override
    public void printSayHello() {
        talking.printSayHello();
    }
}
