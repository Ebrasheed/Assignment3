package mylittlemozart.factories;

import mylittlemozart.MidiEventData;

public class StaccatoMidiEventFactoryAbstract extends MidiEventFactoryAbstract {

    /**
     * Creates a staccato-style note on event.
     */
    public MidiEventData createNoteOnEvent(MidiEventData original) {
        return new MidiEventData(
            original.getStartEndTick(),
            original.getVelocity(),
            original.getNote(),
            original.getChannel(),
            original.getInstrument(),
            1
        );
    }

    /**
     * Creates a staccato-style note off event with short duration.
     */
    public MidiEventData createNoteOffEvent(MidiEventData original) {
        return new MidiEventData(
            original.getStartEndTick() + 50,
            0,
            original.getNote(),
            original.getChannel(),
            original.getInstrument(),
            0
        );
    }
}

