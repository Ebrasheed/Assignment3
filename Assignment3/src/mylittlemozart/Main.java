package mylittlemozart;

import mylittlemozart.factories.*;
import mylittlemozart.strategy.*;


import java.io.*;
import java.util.*;

/**
 * Main class to demonstrate MIDI transformation using factory and strategy patterns.
 */
public class Main {
    public static void main(String[] args) {
        try {
            // Load original events
            ArrayList<MidiEventData> events = MidiCsvParser.parseCsv("files/mystery_song.csv");

            // Apply strategies
            InstrumentStrategy instrumentStrategy = new TrumpetStrategy();
            PitchStrategy pitchStrategy = new HigherPitchStrategy();
            MidiEventFactory factory = new LegatoMidiEventFactory();

            // Processed event list
            ArrayList<MidiEventData> transformedEvents = new ArrayList<>();

            for (MidiEventData event : events) {
                MidiEventData transformed = instrumentStrategy.applyInstrument(event);
                transformed = pitchStrategy.applyPitch(transformed);

                if (event.getNoteOnOff() == 1) {
                    transformedEvents.add(factory.createNoteOnEvent(transformed));
                } else {
                    transformedEvents.add(factory.createNoteOffEvent(transformed));
                }
            }

            // Print result
            for (MidiEventData event : transformedEvents) {
                System.out.printf("%d, %d, %d, %d, %d, %d\n",
                    event.getStartEndTick(),
                    event.getVelocity(),
                    event.getNote(),
                    event.getChannel(),
                    event.getInstrument(),
                    event.getNoteOnOff());
            }

        } catch (IOException e) {
            System.err.println("Failed to read MIDI CSV file: " + e.getMessage());
        }
    }
}
