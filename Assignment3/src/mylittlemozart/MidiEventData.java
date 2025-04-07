package mylittlemozart;

/**
 * Represents a MIDI event extracted from CSV.
 */
public class MidiEventData {
    private int startEndTick;
    private int velocity;
    private int note;
    private int channel;
    private int instrument;
    private int noteOnOff;

    public MidiEventData(int startEndTick, int velocity, int note, int channel, int instrument, int noteOnOff) {
        this.startEndTick = startEndTick;
        this.velocity = velocity;
        this.note = note;
        this.channel = channel;
        this.instrument = instrument;
        this.noteOnOff = noteOnOff;
    }

    public int getStartEndTick() {
        return startEndTick;
    }

    public int getVelocity() {
        return velocity;
    }

    public int getNote() {
        return note;
    }

    public int getChannel() {
        return channel;
    }

    public int getInstrument() {
        return instrument;
    }

    public int getNoteOnOff() {
        return noteOnOff;
    }
    
    public void setNote(int note) {
    	this.note = note; 
    }

    public void setInstrument(int instrument) {
        this.instrument = instrument;
    }
}
    