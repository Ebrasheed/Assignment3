package mylittlemozart.strategy;

import mylittlemozart.MidiEventData;
import mylittlemozart.strategy.InstrumentStrategy;

/**
 * Sets the instrument to Acoustic Grand Piano (value 0).
 */
public class AcousticGrandPianoStrategy implements InstrumentStrategy {
    public MidiEventData applyInstrument(MidiEventData original) {
        original.setInstrument(0);
        return original;
    }
}
