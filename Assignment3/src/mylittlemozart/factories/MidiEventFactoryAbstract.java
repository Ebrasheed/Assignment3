package mylittlemozart.factories;

import mylittlemozart.MidiEventData;

public abstract class MidiEventFactoryAbstract implements MidiEventFactory {
    public MidiEventData createNoteOnEvent(MidiEventData baseEvent) {
        MidiEventData event = new MidiEventData(
                baseEvent.getStartEndTick(),
                baseEvent.getVelocity(),
                baseEvent.getNote(),
                baseEvent.getChannel(),
                baseEvent.getInstrument(),
                1 // Note On
        );
        return event;
    }

    public MidiEventData createNoteOffEvent(MidiEventData baseEvent) {
        MidiEventData event = new MidiEventData(
                baseEvent.getStartEndTick() + 10,
                0,
                baseEvent.getNote(),
                baseEvent.getChannel(),
                baseEvent.getInstrument(),
                0 // Note Off
        );
        return event;
    }
}

