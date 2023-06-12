public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá professor Gilson seja bem vindo a resuloções de suas Questões");
        System.out.println("-----------------------------------------------------");
        System.out.println("--(Aluno: Kauã Carlos Aciole da Silva)---------------");
        System.out.println("--(RA: 1352314172)-----------------------------------");
        System.out.println("--(Curso: Analise e Desenvolvimento de Sistemas)-----");
        System.out.println("");
        System.out.println("");

        Escolhas esc = new Escolhas();

        boolean vlr = false;

        while(vlr == false) {
            int opc = esc.menu();
            vlr = esc.escolher(opc);
        } 
    }
}
