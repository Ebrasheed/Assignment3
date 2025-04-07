package mylittlemozart.strategy;

import mylittlemozart.MidiEventData;
import mylittlemozart.strategy.InstrumentStrategy;

/**
 * Sets the instrument to Electric Bass (value 33).
 */
public class ElectricBassGuitarStrategy implements InstrumentStrategy {
    public MidiEventData applyInstrument(MidiEventData original) {
        original.setInstrument(33);
        return original;
    }
}