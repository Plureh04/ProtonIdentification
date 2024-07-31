import org.jlab.groot.fitter.ParallelSliceFitter;
import org.jlab.groot.math.F1D;
import org.jlab.jnp.hipo4.io.*;
import org.jlab.jnp.hipo4.data.*;
import org.jlab.groot.data.*;
import org.jlab.groot.ui.*;
import org.jlab.clas.physics.*;
import org.jlab.groot.data.H1F;
import java.util.ArrayList;

public class Chi2Pid extends BvM {
    /*
    chi2pid - this is the chi-squared of the particle identification.
    Make H1F histograms of Chi2pid for each particle
    Fit it with a Gaussian function
    Determine the cut limits of +/- 3 sigma
    Vertex Positions -
    find the vx, vy, and vz information for each particle. It will be the electron and the proton.
    make H1F histograms of vx, vy, and vz.
    for vx and vy, fit the histograms with a gaussian and find the 3*sigma range for a cut.
    Deep inelastic scattering cuts - in order to ensure that the electron broke up the target nucleon into quarks, we apply DIS cuts.  They are
    Q^2 > 1 GeV^2
    W > 2 GeV
    y < 0.85
    There is an example on the documentation wiki for calculating Q^2, W, and nu.
    Remember that y = nu/E_beam.  In this case, E_beam is 11 GeV.
    Make H1F histograms of Q^2, W, and y.  Apply the cuts to your analysis.
     */


    }

