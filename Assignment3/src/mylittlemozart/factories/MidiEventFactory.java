package mylittlemozart.factories;

import mylittlemozart.MidiEventData;

public interface MidiEventFactory {
    MidiEventData createNoteOnEvent(MidiEventData baseEvent);
    MidiEventData createNoteOffEvent(MidiEventData baseEvent);
}