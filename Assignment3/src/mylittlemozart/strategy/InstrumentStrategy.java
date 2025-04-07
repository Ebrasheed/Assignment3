package mylittlemozart.strategy;

import mylittlemozart.MidiEventData;

/**
 * Strategy interface for applying different instruments to MIDI events.
 */
public interface InstrumentStrategy {
    MidiEventData applyInstrument(MidiEventData original);
}
