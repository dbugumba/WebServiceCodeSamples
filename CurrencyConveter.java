package com.clipnex;

/**
 * Converts a value from one currency to another. 
 * For example, it can be used to convert ten pounds sterling into 
 * an equivalent sum in American dollars or anyone of a range of other currencies.
 * 
 * @author Dennis Bugumba 
 * @version 1.0
 */
public class CurrencyConverter
{
   static int currencies = 7; // 0-7 i.e. 8 currencies in use.
   
  /**
   * Currency conversion array. These values would usually be held
   * in a database and updated on a very regular basis.
   * The eight currencies are:
   * 0 United Kingdom Pound 1 Australian Dollar
   * 2 Euro 3 Japanese Yen
   * 4 Swiss Franc 5 US Dollar
   * 6 Indian Rupee 7 Chinese Yuan
   **/
   static double [][] convertingArray = {
      { 
         // others to United Kingdom Pound:
         1.0000, 0.4438, 0.7561, 0.004748, 0.4670, 0.5128, 0.0130, 0.0941 
      },
      { 
         // others to Australian Dollar
        2.2530, 1.0000, 1.1705, 0.01208, 1.1250, 1.2730, 0.0204, 0.1503 
      },
      { 
         // others to Euro
        1.3226, 0.8543, 1.0000, 0.006282, 0.6179, 0.6784, 0.0149, 0.1118 
      },
      { 
         // others to Japanese Yen
         205.542, 82.7814, 159.157, 1.0000, 98.3418, 107.972, 1.5580, 12.667 
      },
      { 
         // others to Swiss Franc
         2.1406, 0.8888, 1.6181, 0.010166, 1.0000, 1.0977, 0.0184, 0.1445 
      },
      { 
         // others to US Dollar
         1.9499, 0.7855, 1.4740, 0.009260, 0.9108, 1.0000, 0.0203, 0.1521 
      },
      { 
         // others to Indian Rupee
         76.7316, 48.9931, 67.2526, 0.641843, 54.3248, 49.1750, 1.0000, 7.70845 
      },
      { 
         // others to Chinese Yuan
         10.6500, 6.6160, 9.3512, 0.0812574, 6.98185, 6.69279, 0.1297, 1.0000 
      }
   };
   
   /**
     * The convert method converts an amount 'value' from one
     * currency 'source' to some other 'target' currency. Both
     * source and target currencies are an integer 0-7 indicating
     * the currency to be used from the conversion array.
     */
   public static double convert(int source, int target, double value) 
   {
      double result = -1;
      if ( source >= 0 && source <= currencies && target >= 0 && target <= currencies)
      {
         result = convertingArray[target][source] * value;
      }
      return result;
   }
}
