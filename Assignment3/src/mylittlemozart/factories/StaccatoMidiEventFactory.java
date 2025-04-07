package mylittlemozart.factories;

import mylittlemozart.MidiEventData;

/**
 * Factory for creating staccato MIDI events (shorter duration).
 */
public class StaccatoMidiEventFactory extends MidiEventFactoryAbstract {
    @Override
    public MidiEventData createNoteOffEvent(MidiEventData baseEvent) {
        MidiEventData event = new MidiEventData(
            baseEvent.getStartEndTick() + 5, // Short duration
            0,
            baseEvent.getNote(),
            baseEvent.getChannel(),
            baseEvent.getInstrument(),
            0 // Note Off
        );
        return event;
    }
}
