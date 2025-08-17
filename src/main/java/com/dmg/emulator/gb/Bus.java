package com.dmg.emulator.gb;

/**
 * The CPU never touches raw arrays; It always goes through a Bus so
 * later we can swap in sophisticated MMUs
 * */
public interface Bus {
    /**
     * Contract for reading one byte from a 16-bit address
     * @param address a 16 bit address
     * @return an int ranging from 0-255
     * */
    int read(int address);

    /***
     * Contract for writing one byte to a 16-bit address;
     * @param address a 16 bit address
     * @param value value to be written at address, should be masked to 0-255
     */
    void write(int address, int value);
}
