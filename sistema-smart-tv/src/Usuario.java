public class Usuario {
    public static void main(String[] args) throws Exception {
       SmartTv smartTv = new SmartTv();

       System.out.println("Tv está ligadas?" + smartTv.ligada);
       System.out.println("Canal atual?" + smartTv.canal);
       System.out.println("Volume atual?" + smartTv.volume);
    }
}
