package mylittlemozart.factories;

import mylittlemozart.MidiEventData;


public class StandardMidiEventFactoryAbstract extends MidiEventFactoryAbstract {

    /**
     * Creates a standard note on event.
     */
    public MidiEventData createNoteOnEvent(MidiEventData original) {
        return new MidiEventData(
            original.getStartEndTick(),
            original.getVelocity(),
            original.getNote(),
            original.getChannel(),
            original.getInstrument(),
            1 // Note on
        );
    }

    /**
     * Creates a standard note off event with a fixed offset.
     */
    public MidiEventData createNoteOffEvent(MidiEventData original) {
        return new MidiEventData(
            original.getStartEndTick() + 100,
            0,
            original.getNote(),
            original.getChannel(),
            original.getInstrument(),
            0 // Note off
        );
    }
}
