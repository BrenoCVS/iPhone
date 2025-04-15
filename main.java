import java.util.Scanner;

public class main {
    public void SetMusica(String musica){
        this.musica = musica;
    }

    public String getMusica(){
        return musica;
    }


    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        System.out.println("iPhone");
        System.out.println("Esolha uma opção:");
        System.out.println("1 - Player de Música");
        System.out.println("2 - Aparelho Telefônico");
        System.out.println("3 - Navegador de Internet");
        System.out.println("0 - Sair");
        int num = new Scanner(System.in).nextInt();
        switch (num) {
            case 1:
                player();
                break;
            case 2:
                telefone();
                break;
            case 3:
                navegador();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida!");
                menu();
                break;
        }
    }

    public static void player(){
        System.out.println("Player de Música");
        System.out.println("Esolha uma musica:");
        System.out.println("1 - Musica 1");
        System.out.println("2 - Musica 2");
        System.out.println("3 - Musica 3");
        System.out.println("0 - Voltar");
        int opcao = new Scanner(System.in).nextInt();
        switch (opcao) {
            case 1:
                setMusica("Musica 1");
                break;
            case 2:
                setMusica("Musica 2");
                break;
            case 3:
                setMusica("Musica 3");
                break;
            case 0:
                menu();
                break;
            default:
                System.out.println("Opção inválida!");
                player();
                break;
        }

        tocar();
    }

    public static void tocar(){

        String musica = getMusica();

        System.out.println("1 - Tocar: " + musica);
        System.out.println("2 - voltar para a seleção de musica");
        int opcao2 = new Scanner(System.in).nextInt();
        switch (opcao2) {
            case 1:
                pausar();
                break;
            case 2:
                player();
                break;
            default:
                System.out.println("Opção inválida!");
                player();
                break;
        }
    }

    public static void pausar(){
        Srtring musica = getMusica();
        System.out.println("Música pausada:");
        System.out.println("1 - Tocar: " + musica);
        System.out.println("2 - Voltar para a seleção de musica");
        int opcao2 = new Scanner(System.in).nextInt();
        switch (opcao2) {
            case 1:
                tocar(musica);
                break;
            case 2:
                player();
                break;
            default:
        }
    }

    public static void telefone(){}
    public static void navegador(){}
}

