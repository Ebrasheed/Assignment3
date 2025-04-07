package mylittlemozart;

import java.io.*;
import java.util.*;

/**
 * Parses a MIDI event CSV file into a list of MidiEventData objects.
 */
public class MidiCsvParser {
	public static ArrayList<MidiEventData> parseCsv(String path) throws IOException {
	    ArrayList<MidiEventData> events = new ArrayList<>();
	    BufferedReader reader = new BufferedReader(new FileReader(path));
	    String line;

	    while ((line = reader.readLine()) != null) {
	        if (line.trim().isEmpty()) continue;

	        String[] parts = line.split(",");
	        if (parts.length < 6) continue;

	        String eventType = parts[1].trim();
	        if (!eventType.equals("Note_on_c") && !eventType.equals("Note_off_c")) continue;

	        try {
	            int tick = Integer.parseInt(parts[0].trim());
	            int channel = Integer.parseInt(parts[2].trim());
	            int note = Integer.parseInt(parts[3].trim());
	            int velocity = Integer.parseInt(parts[4].trim());
	            int instrument = Integer.parseInt(parts[5].trim()); // now using your 6th column
	            int noteOnOff = eventType.equals("Note_on_c") ? 1 : 0;

	            MidiEventData event = new MidiEventData(tick, velocity, note, channel, instrument, noteOnOff);
	            events.add(event);
	        } catch (NumberFormatException e) {
	            System.err.println("Skipping bad line: " + line);
	        }
	    }

	    reader.close();
	    return events;
	}
}