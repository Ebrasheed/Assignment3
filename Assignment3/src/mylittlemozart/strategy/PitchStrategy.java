package mylittlemozart.strategy;

import mylittlemozart.MidiEventData;

public interface PitchStrategy {
    MidiEventData applyPitch(MidiEventData original);
}
