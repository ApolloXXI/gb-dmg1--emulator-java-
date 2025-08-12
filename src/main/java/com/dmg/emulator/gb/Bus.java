package com.dmg.emulator.gb;

public interface Bus {
    int read(int address);
    void write(int address, int value);
}
