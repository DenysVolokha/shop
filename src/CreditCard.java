public class CreditCard {
   private String namberCard;
   private String cw;
   private String shelаLife;
   private float balanceCard;
   CreditCard (String namberCard, String civ, String shelаLife, float amount ){
       this.namberCard = namberCard;
       this.cw = civ;
       this.shelаLife = shelаLife;
       this.balanceCard = amount;
   }

    public String getNamberCard() {
        return namberCard;
    }

    public float getBalanceCard() {
        return balanceCard;
    }

    public String getCw() {
        return cw;
    }

    public String getShelаLife() {
        return shelаLife;
    }
}
