
package sistemasnumericos;

public class Sistema {
    private final char [] simb;
    private final int noSimb;
    
    public Sistema (char simb[]) throws ExInvalidArraySize {
        if (simb.length<=1){
            throw new ExInvalidArraySize();
        }
        this.noSimb=simb.length;
        this.simb=simb;
    }
    
    public String DecASimb(int no){
        double dec;
        String nuevo="";
        if (no==0) return simb[0]+"";
        while (no>=1){
            dec=((double)no/noSimb)-(no/noSimb);
            dec=Math.round(dec*noSimb);
            nuevo=simb[(int)dec]+nuevo;
            no=no/noSimb;
        }
        return nuevo;
    }
    
    public int SimbADec(String simb) throws ExSysmbolDoesNotExist{
        int nuevo=0;
        int potencia=0;
        int valor;
        for (int i=simb.length()-1;i>=0;i--){
            valor=valorSimbolo(simb.charAt(i));
            if (valor==-1){
                throw new ExSysmbolDoesNotExist();
            }
            nuevo=nuevo+(((int)Math.pow((double)noSimb, (double)potencia))*valor);
            potencia++;
        }
        return nuevo;
    }
    
    public int valorSimbolo(char c){
        for (int i=0;i<simb.length;i++){
            if (simb[i]==c) 
            return i;
        }
        return -1;
    }
}
