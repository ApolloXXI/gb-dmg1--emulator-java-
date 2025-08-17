package com.dmg.emulator.gb;

import java.util.Arrays;


/*
A minimal memory map implementation that supports ROM reads and some RAM areas
enough to get a CPU stepping and the emulator loop ticking
 */
public class SimpleMMU {
    // Buffer for 0x0000 - 0x7FFF
    private final byte[] rom; // (0x0000 - 0x7FFF) 0 to 32 767 bytes
    // work RAM
    private final byte[] wram = new byte[0x2000]; // (0xC000 - 0xDFFF) 8 192 bytes
    // high RAM
    private final byte[] hram = new byte[0x7F]; // 0xFF80 - 0xFFFE
}
