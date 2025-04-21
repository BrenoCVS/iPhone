import javax.swing.JOptionPane;

public class Main {
    private static String musica;
    private static String[][] paginas = new String[3][6];
    
    public static void setMatriz(int linha, int coluna, String valor){
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
        preencherMatriz();

        menu();
    }

    public static void preencherMatriz(){
         for (int i = 0; i <= 5 ; i++){
            setMatriz(0, i, "Adicionar pagina");
            setMatriz(1, i, "Pagina vazia");
            setMatriz(2, i, "Normal");
        }
        
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

    public static String listaPaginas() {
        String lista = "";
        for(int i = 0; i <= 5; i++) {
            String pag = getMatriz(0, i);
            lista += "\n" + (i +1) + " - " + pag;
        }
        return lista;
    }


    public static void visualizarPaginas(){
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Visualizar Páginas:"+ listaPaginas() + "\n0 - Voltar"));

        switch (opcao) {
            case 1: visualizador(0); break;
            case 2: visualizador(1); break;
            case 3: visualizador(2); break;
            case 4: visualizador(3); break;
            case 5: visualizador(4); break;
            case 6: visualizador(5); break;
            case 0: navegador(); return;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                navegador();
                return;
        }
    }

    public static void visualizador(int pag){

        if("Adicionar pagina".equals(paginas[0][pag])) {
            String pagina = JOptionPane.showInputDialog(null, "Digite o nome da pagina: ");
            setMatriz(0, pag, pagina);
            String conteudo = JOptionPane.showInputDialog(null, "Digite o conteudo da pagina: ");
            setMatriz(1, pag, conteudo);

            visualizador(pag);
        } else {
            int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, paginas[0][pag] +
            "\n" +
            "\n" + paginas[1][pag]+
            "\n" +
            "\n1 - Atualizar pagina"+
            "\n2 - Adicionar aos favoritos"+
            "\n0 - Voltar"));

            switch (opcao) {
                case 1: atualizar(pag); break;
                case 2: favoritar(pag); break;
                case 0: visualizarPaginas(); return;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    visualizador(pag);
                    return;
            }
        }

    }

    public static void atualizar(int pag){
        String pagina = JOptionPane.showInputDialog(null, "Digite o novo nome da pagina: ");
        setMatriz(0, pag, pagina);
        String conteudo = JOptionPane.showInputDialog(null, "Digite o novo conteudo da pagina: ");
        setMatriz(1, pag, conteudo);

        visualizador(pag);
    }

    public static void  favoritar(int pag){
        setMatriz(2, pag, "Favorito");

        navegador();
    }

    public static void verFavoritos(){
        String lista = "";
        for (int i = 0; i <= 5; i++) {
            String pag = getMatriz(0, i);
            if("Favorito".equals(getMatriz(2, i))) { 
                lista += "\n" + (i +1) + " - " + pag;
            }
        }

        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Favoritos:"+
        "\n" + lista +
        "\n0 - Voltar"));

        switch (opcao) {
            case 1: visualizador(0); break;
            case 2: visualizador(1); break;
            case 3: visualizador(2); break;
            case 4: visualizador(3); break;
            case 5: visualizador(4); break;
            case 6: visualizador(5); break;
            case 0: navegador(); return;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                navegador();
                return;
        }
    }
}
