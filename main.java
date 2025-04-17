import javax.swing.JOptionPane;

public class Main {
    private static String musica;
    private static String [3][6] paginas;
    
    public stativ void setMatriz(int linha, int coluna, String valor){
        paginas[linha][coluna] = valor;
    } 

    public static String getMatriz (int linha, int coluna){
        return paginas[linha][coluna];
    }

    public static void setMusica(String musica){
        Main.musica = musica;
    }

    public static String getMusica(){
        return musica;
    }

    public static void main(String[] args) {
         for (int i = 0; i <= 6 ; i++){
            setMtriz(1, i, "Adicionar pagina " + i);
        }

        menu();
    }

    public static void menu(){
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Bem-vindo ao iPhone!"+
        "\nEscolha uma opção:"+
        "\n 1 - Player de Música"+
        "\n 2 - Aparelho Telefônico"+
        "\n 3 - Navegador de Internet"+
        "\n 0 - Sair"));
        switch (num) {
            case 1: player(); break;
            case 2: telefone(); break;
            case 3: navegador(); break;
            case 0: System.exit(0); break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                menu();
                break;
        }
    }

    public static void player(){
    int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "PLayer de Música:"+
        "\nEscolha uma musica:"+
        "\n1 - Musica 1"+
        "\n2 - Musica 2"+
        "\n3 - Musica 3"+
        "\n0 - Voltar"));

        switch (opcao) {
            case 1: setMusica("Musica 1"); break;
            case 2: setMusica("Musica 2"); break;
            case 3: setMusica("Musica 3"); break;
            case 0: menu(); return;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                player();
                return;
        }
        tocar();
    }

    public static void tocar(){
    
        String musica = getMusica();
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Tocando: " + musica +
        "\n1 - Pausar musica"+
        "\n2 - Voltar para a seleção de musica"));
        
        switch (opcao) {
            case 1: pausar(); break;
            case 2: player(); break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                player();
                break;
        }
    }

    public static void pausar(){
        String musica = getMusica();

        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Musica pausada"+
        "\n1 - Tocar: " + musica + 
        "\n2 - Voltar para a seleção de musica"));
    
        switch (opcao) {
            case 1: tocar(); break;
            case 2: player(); break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                player();
                break;
        }
    }

    public static void telefone(){
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Aparelho Telefônico:"+
        "\n1 - Realizar ligação"+
        "\n2 - Verificar correio de voz"+
        "\n0 - Voltar"));

        switch (opcao) {
            case 1: ligacao(); break;
            case 2: correio(); break;
            case 0: menu(); return;

            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                telefone();
                return;
        }
    }

    public static void ligacao(){
        double numero = Double. parseDouble (JOptionPane.showInputDialog(null, "Digite o número da ligação: "));
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Ligando para: " + numero +
        "\n1 - Desligar ligação"));

        if(opcao == 1){
        telefone();
        } else {
            JOptionPane.showMessageDialog(null, "Opção inválida!");
        }
    } 

    public static void correio(){
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Correio de voz:"+
        "\n1 - Ouvir mensagem 1"+
        "\n2 - Ouvir mensagem 2"+
        "\n3 - Ouvir mensagem 3"+
        "\n0 - Voltar"));
        
        switch (opcao) {
            case 1: JOptionPane.showMessageDialog(null, "Mensagem 1"); break;
            case 2: JOptionPane.showMessageDialog(null, "Mensagem 2"); break;
            case 3: JOptionPane.showMessageDialog(null, "Mensagem 3"); break;
            case 0: telefone(); return;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                correio();
                return;
        }
        correio();
    }

    
    public static void navegador(){
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Navegador de Internet:"+
        "\n1 - Visualizar páginas"+
        "\n2 - Ver os favoritos"+
        "\n0 - Voltar"));
    
        switch (opcao) {
            case 1: visualizarPaginas(); break;
            case 2: verFavoritos(); break;
            case 0: menu(); return;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                navegador();
                return;
        }
    }

    public static void visuallizarPaginas(){
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Viauslizar Páginas:"+
        for(int i = 0; i <=6 ; i++){
            String pag = getMatriz(1, i);
            return "\n" + i+ " " + pag + ;
        }
        "\n0 - Voltar"));

        switch (opcao) {
            case 1: visualizador("pagina1"); break;
            case 2: visualizador("pagina2"); break;
            case 3: visualizador("pagina3"); break;
            case 0: navegador(); return;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                navegador();
                return;
        }
    }

    public static void visualizador(){}
}
