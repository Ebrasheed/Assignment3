package mylittlemozart.strategy;

import mylittlemozart.MidiEventData;
import mylittlemozart.strategy.PitchStrategy;

/**
 * Lowers pitch by one octave.
 */
public class LowerPitchStrategy implements PitchStrategy {
    public MidiEventData applyPitch(MidiEventData original) {
        original.setNote(original.getNote() - 12);
        return original;
    }
}