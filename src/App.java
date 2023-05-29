public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá professor Gilson seja bem vindo a resuloções de suas Questões");

        Escolhas esc = new Escolhas();

        boolean val = false;

        while(val == false) {
            int opc = esc.menu();
            val = esc.escolher(opc);
        }  
        

    }
}
