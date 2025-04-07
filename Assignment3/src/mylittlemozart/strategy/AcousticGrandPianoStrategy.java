package mylittlemozart.strategy;

import mylittlemozart.MidiEventData;
import mylittlemozart.strategy.InstrumentStrategy;

public class AcousticGrandPianoStrategy implements InstrumentStrategy {
    public MidiEventData applyInstrument(MidiEventData original) {
        original.setInstrument(0);
        return original;
    }
}
