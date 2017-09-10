// double, double -> double (signature)
/*  Returns the price of an item, reduced by the given sale percentage
 * (purpose)
 * 
 * double salePrice1000() {
 *   return 0;  
 * }
 * (stub)
 */
/* doubleSalePrice1000() {
 *   ...price...
 *   ...discount...
 *   ...SALE_LIMIT...
 * }
 */




class Item {
  double price;
  double discount;
  
  static final int SALE_LIMIT = 1000;
  
  Item(double price, double discount){
    this.price = price;
    this.discount = discount;
  }
  
  double computeSalePrice() {
    return price * (1 - discount);
  }
  
  double salePrice1000() {
    if(price > SALE_LIMIT) {
      return computeSalePrice();
    }
    else {
      return this.price;
    }
  }
}