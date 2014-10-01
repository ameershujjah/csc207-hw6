package com.farevee.groceries;
/**
 * The BulkItem class that implement Item.
 * @author Ameer
 *
 */
public class BulkItem
    implements Item
{
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  /**
   * The BulkFood in the {@link BulkItem}.
   */
  BulkFood food;

  /**
   * The units of the item.
   */
  Units unit;

  /**
   * The amount of the item.
   */
  int amount;

  /**
   * The weight of the item.
   */
  Weight weight;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+
  /**
   * Builds a new BulkItem.
   * @param food the type of BulkItem, an object of type {@link BulkFood}.
   * @param unit the units of the BulkItem, an object of type {@link Units}.
   * @param amount the amount of the BulkItem
   */
  public BulkItem(BulkFood food, Units unit, int amount)
  {
    this.food = food;
    this.unit = unit;
    this.amount = amount;
    //Decrement supply
    this.food.decrementSupply(this.amount);
  } // BulkItem(BulkFood, Units, int)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  /**
   * Returns the weight of the BulkItem.
   * @return Weight the weight of the BulkItem built using the item's unit and amount.
   */
  public Weight getWeight()
  {
    return new Weight(this.unit, this.amount);
  } // getWeight()

  public int getPrice()
  {
    return this.amount * this.food.pricePerUnit;
  } // getPrice()

  public String toString()
  {
    return this.amount + " " + this.unit + " of " + this.food.name;
  } // toString()

  public boolean equals(Object obj)
  {
    if (obj instanceof BulkItem)
      {
        BulkItem that = (BulkItem) obj;
        if ((this.food.equals(that.food)) && (this.unit.equals(that.unit))
            && (this.amount == that.amount)
            && (this.weight.equals(that.weight)))
          {
            return true;
          } // if the two objects have the same fields
      } // if the two objects are the same type
    return false;
  } // equals(Object)

} // Class BulkItem
