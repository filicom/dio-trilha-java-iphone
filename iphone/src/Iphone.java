
public class Iphone {
    // Atributos privados que referenciam as outras classes
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    // Construtor que inicializa as classes associadas
    public Iphone() {
        this.reprodutorMusical = new ReprodutorMusical();
        this.aparelhoTelefonico = new AparelhoTelefonico();
        this.navegadorInternet = new NavegadorInternet();
    }

    public void usarReprodutorMusical() {
        reprodutorMusical.selecionarMusica("Shape of You");
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
    }

    public void usarAparelhoTelefonico() {
        aparelhoTelefonico.ligar("123-456-7890");
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();
    }

    public void usarNavegadorInternet() {
        navegadorInternet.exibirPagina("https://www.example.com");
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();
    }

    // Método main corretamente definido
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Usando o reprodutor musical
        meuIphone.usarReprodutorMusical();

        // Usando o aparelho telefônico
        meuIphone.usarAparelhoTelefonico();

        // Usando o navegador de internet
        meuIphone.usarNavegadorInternet();
    }
}
