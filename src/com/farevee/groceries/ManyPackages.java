package com.farevee.groceries;
/**
 * The class for ManyPackages.
 * @author Ameer
 *
 */
public class ManyPackages
    implements Item
{
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  
  /**
   * The package.
   */
  Package type;
  /**
   * The amount of packages.
   */
  int count;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+
  /**
   * Builds a new ManyPackages object.
   * @param type the {@link Package}.
   * @param count number of those packages.
   */
  public ManyPackages(Package type, int count)
  {
    this.type = type;
    this.count = count;
  } // ManyPackages(Package,int)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  /**
   * Returns the weight of the packages.
   * @return the {@link Weight} constructed using the {@link Package}'s unit and 
   * weight times the amount.
   */
  public Weight getWeight()
  {
    return new Weight(this.type.weight.unit, this.type.weight.amount
                                             * this.count);
  } // getWeight()

  /**
   * The function calculates the total price.
   * @return the total price calculated by multiplying the amount of the {@link Package} 
   * by it's price. 
   */
  public int getPrice()
  {
    return this.count * this.type.getPrice();
  } // getPrice()

  /**
   * Converts the object to a string so it can be printed.
   * @return a String composed of the count and the corresponding Package's details.
   */
  public String toString()
  {
    return this.count + " x " + this.type.toString();
  } // toString()

  /**
   * Checks if the object is equal to another object.
   * @return true, only if the two objects occupy the same space in memory. Otherwise
   * it is false.
   */
  public boolean equals(Object obj)
  {
    if (this == obj)
      {
        return true;
      } // if
    return false;
  } // equals(Object)
} // Class ManyPackages
