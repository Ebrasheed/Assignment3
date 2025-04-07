package mylittlemozart.strategy;

import mylittlemozart.MidiEventData;
import mylittlemozart.strategy.PitchStrategy;

/**
 * Increases pitch by one octave.
 */
public class HigherPitchStrategy implements PitchStrategy {
    public MidiEventData applyPitch(MidiEventData original) {
        original.setNote(original.getNote() + 12);
        return original;
    }
}