package com.dmg.emulator.gb;

public final class CPU {
    public int A, F, B, C, D, E, H, L;
    public int SP = 0xFFFE;
    public int PC = 0x0100;

    private final Bus bus;

    public CPU(Bus bus) {
        this.bus = bus;
    }

    private int fetch8(){
        int v = bus.read(PC);
        PC = (PC + 1) & 0xFFFF
    }
}
