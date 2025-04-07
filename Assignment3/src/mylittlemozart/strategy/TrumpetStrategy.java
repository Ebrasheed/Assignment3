package mylittlemozart.strategy;

import mylittlemozart.MidiEventData;
import mylittlemozart.strategy.InstrumentStrategy;

/**
 * Sets the instrument to Trumpet (value 56).
 */
public class TrumpetStrategy implements InstrumentStrategy {
    public MidiEventData applyInstrument(MidiEventData original) {
        original.setInstrument(56);
        return original;
    }
}