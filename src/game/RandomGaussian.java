package game;
import java.util.Random;

/**
 https://stackoverflow.com/questions/29389412/generating-numbers-which-follow-normal-distribution-in-java
 http://www.javapractices.com/topic/TopicAction.do?Id=62
 Generate pseudo-random floating point values, with an
 approximately Gaussian (normal) distribution.

 Many physical measurements have an approximately Gaussian
 distribution; this provides a way of simulating such values.
 */
public final class RandomGaussian {

    public static void main(String... aArgs){
        RandomGaussian gaussian = new RandomGaussian();
        double MEAN = 100.0f;
        double VARIANCE = 5.0f;
        for (int idx = 1; idx <= 10; ++idx){
            log("Generated : " + gaussian.getGaussian(MEAN, VARIANCE));
        }
    }

    private Random fRandom = new Random();

    private double getGaussian(double aMean, double aVariance){
        return aMean + fRandom.nextGaussian() * aVariance;
    }

    private static void log(Object aMsg){
        System.out.println(String.valueOf(aMsg));
    }
}