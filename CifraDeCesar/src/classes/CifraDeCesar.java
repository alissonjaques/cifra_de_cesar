package classes;

/**
 *
 * @author Alisson
 */
public class CifraDeCesar {
    public String texto;
    
    public CifraDeCesar(String texto){
        this.texto = texto;
    }
    
    public CifraDeCesar(){
    
    }
    
   public static String criptografa(String s, int cifra) {
      int i, n = s.length();
      String saux = "";

      for (i=0; i<n; i++) {
        saux = saux + (char)(s.charAt(i) + cifra);
      }

      return(saux);
    }

    public static String descriptografa(String s, int cifra) {
      int i, n = s.length();
      String saux = "";

      for (i=0; i<n; i++) {
        saux = saux + (char)(s.charAt(i) - cifra);
      }

      return(saux);
    }
}
