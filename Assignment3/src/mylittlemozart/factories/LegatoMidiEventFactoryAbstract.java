package mylittlemozart.factories;
import mylittlemozart.MidiEventData;


public class LegatoMidiEventFactoryAbstract extends MidiEventFactoryAbstract {
	 /**
     * Creates a legato-style note on event.
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
     * Creates a legato-style note off event with extended duration.
     */
    public MidiEventData createNoteOffEvent(MidiEventData original) {
        return new MidiEventData(
            original.getStartEndTick() + 150,
            0,
            original.getNote(),
            original.getChannel(),
            original.getInstrument(),
            0
        );
    }

}
