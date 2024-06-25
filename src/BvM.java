import org.jlab.jnp.hipo4.io.*;
import org.jlab.jnp.hipo4.data.*;
import org.jlab.groot.data.*;
import org.jlab.groot.graphics.*;
import org.jlab.groot.math.*;
import org.jlab.groot.ui.*;
import org.jlab.clas.physics.*;
import org.jlab.clas.physics.LorentzVector;
import org.jlab.clas.physics.PhysicsEvent;
import org.jlab.clas.physics.Particle;
import org.jlab.clas.physics.EventFilter;

public class BvM {
    //Create constants for the electron and proton particle
    private static final int ELECTRON_PID = 11;
    private static final int PROTON_PID = 14;
    private static final int MIN_PARTICLE_COUNT = 4;
    //create
    public static void main(String[] args){

        HipoReader reader = new HipoReader();
        reader.open("/home/reh1/myOutput.hipo");
        SchemaFactory factory = reader.getSchemaFactory();
        Bank particles;
        particles = new Bank(factory.getSchema("REC::Particle"));
        Event event = new Event();
        while (reader.hasNext()) {
            reader.nextEvent(event);
            event.read(particles);
            if (particles.getRows() > 0) {
                particles.show();
                break;
            }
        }
    }
}
