classDiagram
    class ReprodutorMusical {
        +tocar()
        +pausar()
        +selecionarMusica(String Musica)
    }

    class AparelhoTelefonico {
        +ligar(String Numero)
        +atender()
        +iniciarCorreioVoz()
    }

    class NavegadorInternet {
        +exibirPagina(String Url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
