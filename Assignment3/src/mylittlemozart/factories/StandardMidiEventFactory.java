package mylittlemozart.factories;

import mylittlemozart.MidiEventData;

/**
 * Factory for creating standard MIDI events.
 */
public class StandardMidiEventFactory extends MidiEventFactoryAbstract {
    @Override
    public MidiEventData createNoteOnEvent(MidiEventData baseEvent) {
        return super.createNoteOnEvent(baseEvent);
    }

    @Override
    public MidiEventData createNoteOffEvent(MidiEventData baseEvent) {
        return super.createNoteOffEvent(baseEvent);
    }
}
