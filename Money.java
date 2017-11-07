package moneyconverter;

/**
 *
 * @author danielhiggins
 */
public class Money {
    public Money(){
        
    }
    //Sample currency's
    
    public double USDtoEuro(double d){
        double n;
        n = d * .87835;
        return n;
    }
    
    public double EurotoUSD(double e){
        double n;
        n = e * 1.11315;
        return n;
    }
    
    public double USDtoJyen(double d){
        double n;
        n = d * 103.911;
        return n;
    }
    public double JyentoUSD(double y){
        double n;
        n = y * .0963;
        return n;
    }
    public double USDtoPeso(double d){
        double n;
        n = d * 18.9443;
        return n;
    }
    public double PesotoUSD(double p){
        double n;
        n = p * .05278632;
        return n;
    }
    //Chinese Yuan
    public double USDtoCyuan(double d){
        double n;
        n = d * 6.70795;
        return n;
    }
    public double CyuantoUSD(double d){
        double n;
        n = d * .1490768417;
        return n;
    }
    public double USDtoBit(double d){
        double n;
        n = d * .001616893;
        return n;
    }
    public double BittoUSD(double b){
        double n;
        n = b * 618.470115214;
        return n;
    }
}
