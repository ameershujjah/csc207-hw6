package com.farevee.groceries;

public class test
{

  public static void main(String[] args)
    throws Exception
  {
    // Prepare for input and output
    //PrintWriter pen = new PrintWriter(System.out, true);
    BulkFood bananas = new BulkFood("bananas", Units.POUND, 50, 20);
    BulkItem bI = new BulkItem(bananas, Units.POUND, 3);
    System.out.println(bI.toString());
    System.out.println(bI.getPrice());
    Package p = new Package("oreos", new Weight(Units.OUNCE, 12), 399);
    System.out.println(p.toString());

  }

}
