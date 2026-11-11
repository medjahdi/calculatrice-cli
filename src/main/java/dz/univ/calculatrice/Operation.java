package dz.univ.calculatrice;
 
public interface Operation {
    double execute(double first, double second);
 
    String symbol();
}
