package fractions;

import java.text.NumberFormat;

/** Manages creation of Fractions and their centiles.
 *
 * @author {Your Name Here}
 */
public class Fraction {
  
  public final int numer;
  public final int denom;
  
  /** Constructor.
   *
   * @param numer Numerator
   * @param denom Denominator
   */
  public Fraction(int numer, int denom) {
    this.numer = numer;
    this.denom = denom;
  }
  
  /** Creates a fraction with 100 as denominator.
   *
   */
  public Fraction centile() {
    int numer = (this.numer * 100) / this.denom;
    /*
     * TODO Use the above value to create a Fraction
     *      representing the value as a centile, called
     *      "centile" (identifier)
     */
    return centile;
  }
  
  /** Formats the fraction as a percentage.
   *
   */
  public String fmtPercent() {
    NumberFormat fmt = NumberFormat.getPercentInstance();
    fmt.setMinimumFractionDigits(1);
    double quotient = this.numer / this.denom; // TODO Fix this line; something's not right...
    return fmt.format(quotient);
  }
  
  /** Creates the String form of a fraction.
   *
   */
  public String toString() {
    String fraction = // TODO Implement the string form of a fraction.
    return fraction;
  }
    
}