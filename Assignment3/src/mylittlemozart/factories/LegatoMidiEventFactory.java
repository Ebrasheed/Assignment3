package mylittlemozart.factories;

import mylittlemozart.MidiEventData;

/**
 * Factory for creating legato MIDI events (longer duration).
 */
public class LegatoMidiEventFactory extends MidiEventFactoryAbstract {
    @Override
    public MidiEventData createNoteOffEvent(MidiEventData baseEvent) {
        MidiEventData event = new MidiEventData(
            baseEvent.getStartEndTick() + 30,
            0,
            baseEvent.getNote(),
            baseEvent.getChannel(),
            baseEvent.getInstrument(),
            0 // Note Off
        );
        return event;
    }
}
