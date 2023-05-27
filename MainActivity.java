package com.example.trabalhoavaliativo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener, View.OnClickListener{

    private TextView placar, placar1, placar2, pergunta, materia;
    private ProgressBar barra;
    private RadioGroup rg1;
    private RadioButton rb1, rb2, rb3, rb4, rb5;
    private Button b1;
    private int indicelista;
    private String textoRadioTocado;
    private int indiceRadioTocado, corretas=0, incorretas=0, total=0;
    private ArrayList<Questao> lista;
    private boolean flag;
    private ImageView imagem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        placar = (TextView) findViewById(R.id.textView3);
        placar1 = (TextView) findViewById(R.id.textView4);
        placar2 = (TextView) findViewById(R.id.textView5);
        materia = (TextView) findViewById(R.id.textView);
        barra = (ProgressBar) findViewById(R.id.progressBar);
        rg1 = (RadioGroup) findViewById(R.id.radioGroup);
        rb1 = (RadioButton) findViewById(R.id.radioButton);
        rb2 = (RadioButton) findViewById(R.id.radioButton1);
        rb3 = (RadioButton) findViewById(R.id.radioButton2);
        rb4 = (RadioButton) findViewById(R.id.radioButton3);
        rb5 = (RadioButton) findViewById(R.id.radioButton4);
        pergunta = (TextView) findViewById(R.id.textView2);
        imagem = (ImageView) findViewById(R.id.imageView);

        rg1.setOnCheckedChangeListener(this);

        b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(this);
        b1.setEnabled(false);
        lista = new ArrayList<Questao>();
        indicelista=0;
        flag = false;
        carregaLista();
    }

    public void carregaLista() {
        Questao a = new Questao();
        a.setMateria("BIOLOGIA \uD83E\uDDEC \n");
        a.setPergunta("(Enem/2018) Corredores ecológicos visam mitigar os efeitos da fragmentação dos ecossistemas promovendo a ligação entre diferentes áreas, com o objetivo " +
                "de proporcionar o deslocamento de animais, a dispersão de sementes e o aumento da cobertura vegetal. São instituídos com base em informações como estudos sobre o" +
                " deslocamento de espécies, sua área de vida (área necessária para o suprimento de suas necessidades vitais e reprodutivas) e a distribuição de suas populações.\n" +
                "Nessa estratégia, a recuperação da biodiversidade é efetiva porque:");
        a.setOp1("propicia o fluxo gênico.");
        a.setOp2("intensifica o manejo de espécies.");
        a.setOp3("amplia o processo de ocupação humana.");
        a.setOp4("favorece a formação de ilhas de proteção integral.");
        a.setOp5("aumenta o número de indivíduos nas populações.");
        a.setOpCerto("propicia o fluxo gênico.");
        lista.add(a);

        Questao b = new Questao();
        b.setMateria("BIOLOGIA \uD83E\uDDEC ");
        b.setPergunta("(Enem/2018) Insetos podem apresentar três tipos de desenvolvimento. Um deles, a holometabolia (desenvolvimento completo), " +
                "é constituído pelas fases de ovo, larva, pupa e adulto sexualmente maduro, que ocupam diversos hábitats. Os insetos com holometabolia pertencem " +
                "às ordens mais numerosas em termos de espécies conhecidas. Esse tipo de desenvolvimento está relacionado a um maior número de espécies em razão da:");
        b.setOp1("proteção na fase de pupa, favorecendo a sobrevivência de adultos férteis.");
        b.setOp2("produção de muitos ovos, larvas e pupas, aumentando o número de adultos.");
        b.setOp3("exploração de diferentes nichos, evitando a competição entre as fases da vida.");
        b.setOp4("ingestão de alimentos em todas as fases de vida, garantindo o surgimentos do adulto.");
        b.setOp5("utilização do mesmo alimento em todas as fases, otimizando a nutrição do organismo.");
        b.setOpCerto("exploração de diferentes nichos, evitando a competição entre as fases da vida.");
        lista.add(b);

        Questao c = new Questao();
        c.setMateria("BIOLOGIA \uD83E\uDDEC ");
        c.setPergunta("(Enem/2018) A polinização, que viabiliza o transporte do grão de pólen de uma planta até o estigma de outra, pode ser" +
                "realizada biótica ou abioticamente. Nos processos abióticos, as plantas dependem de fatores como o vento e a água.\n" +
                "A estratégia evolutiva que resulta em polinização mais eficiente quando esta depende do vento é o(a):");
        c.setOp1("proteção na fase de pupa, favorecendo a sobrevivência de adultos férteis.");
        c.setOp2("produção de muitos ovos, larvas e pupas, aumentando o número de adultos.");
        c.setOp3("exploração de diferentes nichos, evitando a competição entre as fases da vida.");
        c.setOp4("ingestão de alimentos em todas as fases de vida, garantindo o surgimentos do adulto.");
        c.setOp5("utilização do mesmo alimento em todas as fases, otimizando a nutrição do organismo.");
        c.setOpCerto("exploração de diferentes nichos, evitando a competição entre as fases da vida.");
        lista.add(c);

        Questao d = new Questao();
        d.setMateria("BIOLOGIA \uD83E\uDDEC ");
        d.setPergunta("(Enem/2018) O deserto é um bioma que se localiza em regiões de pouca umidade. A fauna é, predominantemente, composta por animais roedores, " +
                "aves, répteis e artrópodes.\n" +
                "Uma adaptação, associada a esse bioma, presente nos seres vivos dos grupos citados é o(a):");
        d.setOp1("existência de numerosas glândulas sudoríparas na epiderme.");
        d.setOp2("eliminação de excretas nitrogenadas de forma concentrada.");
        d.setOp3("capacidade de controlar a temperatura corporal.");
        d.setOp4("desenvolvimento do embrião no interior de ovo com casca.");
        d.setOp5("respiração realizada por pulmões foliáceos.");
        d.setOpCerto("eliminação de excretas nitrogenadas de forma concentrada.");
        lista.add(d);

        Questao e = new Questao();
        e.setMateria("BIOLOGIA \uD83E\uDDEC ");
        e.setPergunta("(Enem/2015) Observando a figura abaixo e considerando cada letra uma espécie, marque a opção que nomeia corretamente este processo.");
        e.setIdImagem(R.drawable.biologia);
        e.setOp1("Dispersão mutacional.");
        e.setOp2("Convergência adaptativa.");
        e.setOp3("Analogia.");
        e.setOp4("Irradiação adaptativa.");
        e.setOp5("Homologia.");
        e.setOpCerto("Irradiação adaptativa.");
        lista.add(e);

        Questao f = new Questao();
        f.setMateria("PORTUGUÊS \uD83D\uDCDA ");
        f.setPergunta("(Enem/2015) O Surrealismo configurou-se como uma das vanguardas artísticas europeias do início do século XX. René Magritte, pintor belga, " +
                        "apresenta elementos dessa vanguarda em suas produções. Um traço do Surrealismo presente nessa pintura é o(a):");
        f.setIdImagem(R.drawable.artesadaptado);
        f.setOp1("justaposição de elementos díspares, observada na imagem do homem no espelho.");
        f.setOp2("crítica ao passadismo, exposta na dupla imagem do homem olhando sempre para frente.");
        f.setOp3("construção de perspectiva, apresentada na sobreposição de planos visuais.");
        f.setOp4("procedimento de colagem, identificado no reflexo do livro no espelho.");
        f.setOp5("processo de automatismo, indicado na repetição da imagem do homem.");
        f.setOpCerto("justaposição de elementos díspares, observada na imagem do homem no espelho.");
        lista.add(f);

        Questao g = new Questao();
        g.setMateria("PORTUGUÊS \uD83D\uDCDA ");
        g.setPergunta("(Enem/2013) O cartum faz uma crítica social. A figura destacada está em oposição às outras e representa a:");
        g.setIdImagem(R.drawable.portugues);
        g.setOp1("a opressão das minorias sociais.");
        g.setOp2("carência de recursos tecnológicos.");
        g.setOp3("reação ao controle do pensamento coletivo.");
        g.setOp4("defesa da qualificação profissional.");
        g.setOp5("falta de liberdade de expressão.");
        g.setOpCerto("reação ao controle do pensamento coletivo.");
        lista.add(g);

        Questao h = new Questao();
        h.setMateria("PORTUGUÊS \uD83D\uDCDA ");
        h.setPergunta("(Enem/2018) Certa vez minha mãe surrou-me com uma corda nodosa que me pintou as costas de manchas sangrentas. Moído, virando a cabeça com dificuldade," +
                " eu distinguia nas costelas grandes lanhos vermelhos. Deitaram-me, enrolaram-me em panos molhados com água de sal – e houve uma discussão na " +
                "família. Minha avó, que nos visitava, condenou o procedimento da filha e esta afligiu-se. Irritada, ferira-me à toa, sem querer. Não guardei " +
                "ódio a minha mãe: o culpado era o nó.\n" +
                "Num texto narrativo, a sequência dos fatos contribui para a progressão temática. No fragmento, esse processo é indicado pela:");
        h.setOp1("alternância das pessoas do discurso que determinam o foco narrativo.");
        h.setOp2("utilização de formas verbais que marcam tempos narrativos variados.");
        h.setOp3("indeterminação dos sujeitos de ações que caracterizam os eventos narrados.");
        h.setOp4("justaposição de frases que relacionam semanticamente os acontecimentos narrados.");
        h.setOp5("recorrência de expressões adverbiais que organizam temporalmente a narrativa.");
        h.setOpCerto("utilização de formas verbais que marcam tempos narrativos variados.");
        lista.add(h);

        Questao i = new Questao();
        i.setMateria("PORTUGUÊS \uD83D\uDCDA ");
        i.setPergunta("(Enem/2018)\n" +
                "\n"+
                "Mais big do que bang\n" +
                "A comunidade científica mundial recebeu, na semana passada, a confirmação oficial de uma descoberta sobre a qual se falava com enorme expectativa" +
                " há alguns meses. Pesquisadores do Centro de Astrofísica Harvard-Smithsonian revelaram ter obtido a mais forte evidência até agora de que o " +
                "universo em que vivemos começou mesmo pelo Big Bang, mas este não foi explosão, e sim uma súbita expansão de matéria e energia infinitas" +
                " concentradas em um ponto microscópico que, sem muitas opções semânticas, os cientistas chamam de “singularidade”. Essa semente cósmica permanecia" +
                " em estado latente e, sem que exista ainda uma explicação definitiva, começou a inchar rapidamente [...]. No intervalo de um piscar de olhos," +
                " por exemplo, seria possível, portanto, que ocorressem mais de 10 trilhões de Big Bangs.\n" +
                "\n"+
                "No título proposto para esse texto de divulgação científica, ao dissociar os elementos da expressão Big Bang, a autora revela a intenção de");
        i.setOp1("destacar a experiência que confirma uma investigação anterior sobre a teoria de matéria e energia.");
        i.setOp2("evidenciar a descoberta recente que comprova a explosão de matéria e energia.");
        i.setOp3("resumir os resultados de uma pesquisa que trouxe evidências para a teoria do Big Bang.");
        i.setOp4("sintetizar a ideia de que a teoria da expansão de matéria e energia substitui a teoria da explosão.");
        i.setOp5("condensar a conclusão de que a explosão de matéria e energia ocorre em um ponto microscópico.");
        i.setOpCerto("sintetizar a ideia de que a teoria da expansão de matéria e energia substitui a teoria da explosão.");
        lista.add(i);

        Questao j = new Questao();
        j.setMateria("PORTUGUÊS \uD83D\uDCDA ");
        j.setPergunta("(Enem/2013) O jogo é uma atividade ou ocupação voluntária, exercida dentro de certos e determinados limites de tempo e de espaço, segundo regras livremente consentidas, mas absolutamente obrigatórias, dotado de um fim em si mesmo, acompanhado de um sentimento de tensão e de alegria e de uma consciência de ser diferente da “vida quotidiana”.  " +
                "Segundo o texto, o jogo comporta a possibilidade de fruição. \n" +
                "Do ponto de vista das práticas corporais, essa fruição se estabelece por meio do(a):");
        j.setOp1("caráter lúdico, que permite experiências inusitadas.");
        j.setOp2("fixação de táticas, que define a padronização para maior alcance popular.");
        j.setOp3("competitividade, que impulsiona o interesse pelo sucesso.");
        j.setOp4("refinamento técnico, que gera resultados satisfatórios.");
        j.setOp5("uso tecnológico, que amplia as opções de lazer.");
        j.setOpCerto("caráter lúdico, que permite experiências inusitadas.");
        lista.add(j);

        Questao k = new Questao();
        k.setMateria("INGLÊS \uD83C\uDDFA\uD83C\uDDF8 ");
        k.setPergunta("(Enem/2018) No cartum, a crítica está no fato de a sociedade exigir do adolescente que");
        k.setIdImagem(R.drawable.cartumingles);
        k.setOp1("se aposente prematuramente.");
        k.setOp2("estude aplicadamente.");
        k.setOp3("se forme rapidamente.");
        k.setOp4("refinamento técnico, que gera resultados satisfatórios.");
        k.setOp5("ouça atentamente");
        k.setOpCerto("amadureça precocemente.");
        lista.add(k);

        Questao l = new Questao();
        l.setMateria("INGLÊS \uD83C\uDDFA\uD83C\uDDF8 ");
        l.setPergunta("(Enem/2018) \n" +
                "\n"+
                "Don't write in English, they said,\n" +
                "English is not your mother tongue…\n" +
                "...The language I speak\n" +
                "Becomes mine, its distortions, its queerness\n" +
                "All mine, mine alone, it is half English, half\n" +
                "Indian, funny perhaps, but it is honest,\n" +
                "It is as human as I am human…\n" +
                "...It voices my joys, my longings my\n" +
                "Hopes...\n"+
                "\n"+
                "A poetisa Kamala Das, como muitos escritores indianos, escreve suas obras em inglês, apesar de essa não ser sua primeira língua. " +
                "Nesses versos, ela");
        l.setOp1("usa a língua inglesa como efeito humorístico.");
        l.setOp2("recorre a vozes de vários escritores ingleses.");
        l.setOp3("demonstra consciência de sua identidade linguística.");
        l.setOp4("adverte sobre o uso distorcido da língua inglesa.");
        l.setOp5("reconhece a incompreensão na sua maneira de falar inglês.");
        l.setOpCerto("demonstra consciência de sua identidade linguística.");
        lista.add(l);

        Questao m = new Questao();
        m.setMateria("INGLÊS \uD83C\uDDFA\uD83C\uDDF8 ");
        m.setPergunta("(Enem/2017)\n" +
                "\n" +
                "Israel Travel Guide\n" +
                "\n" +
                "Israel has always been a standout destination. From the days of prophets to the modern day nomad this tiny slice of land on the eastern " +
                "Mediteranean has long attracted visitors. While some arrive in the ‘Holy Land’ on a spiritual quest, many others are on cultural tours, " +
                "beach holidays and eco-tourism trips. Weeding through Israel’s convoluted history is both exhilarating and exhausting. There are crumbling" +
                " temples, ruined cities, abandoned forts and hundreds of places associated with the Bible. And while a sense of adventure is required, " +
                "most sites are safe and easily accessible. Most of all, Israel is about its incredibly diverse population. Jews come from all over the world" +
                " to live here, while about 20% of the population is Muslim. Politics are hard to get away from in Israel as everyone has an opinion on how " +
                "to move the country forward — with a ready ear you’re sure to hear opinions from every side of the political spectrum.\n" +
                "\n" +
                "Antes de viajar, turistas geralmente buscam informações sobre o local para onde pretendem ir. O trecho do guia de viagens de Israel\n");
        m.setOp1("descreve a história desse local para que turistas valorizem seus costumes milenares.");
        m.setOp2("informa hábitos religiosos para auxiliar turistas a entenderem as diferenças culturais.");
        m.setOp3("divulga os principais pontos turísticos para ajudar turistas a planejarem sua viagem.");
        m.setOp4("recomenda medidas de segurança para alertar turistas sobre possíveis riscos locais.");
        m.setOp5("apresenta aspectos gerais da cultura do país para continuar a atrair turistas estrangeiros.");
        m.setOpCerto("apresenta aspectos gerais da cultura do país para continuar a atrair turistas estrangeiros.");
        lista.add(m);

        Questao n = new Questao();
        n.setMateria("INGLÊS \uD83C\uDDFA\uD83C\uDDF8 ");
        n.setPergunta("(Enem/2017) Nesse texto publicitário são utilizados recursos verbais e não verbais para transmitir a mensagem. Ao associar os termos anyplace " +
                "e regret à imagem do texto, constata-se que o tema da propaganda é a importância da");
        n.setIdImagem(R.drawable.ingles);
        n.setOp1("preservação do meio ambiente.");
        n.setOp2("manutenção do motor.");
        n.setOp3("escolha da empresa certa.");
        n.setOp4("consistência do produto.");
        n.setOp5("conservação do carro.");
        n.setOpCerto("escolha da empresa certa.");
        lista.add(n);

        Questao o = new Questao();
        o.setMateria("FÍSICA \uD83C\uDF0C ");
        o.setPergunta("(Enem/2017) Em uma colisão frontal entre dois automóveis, a força que o cinto de segurança exerce sobre o tórax e abdômen do motorista pode causar" +
                " lesões graves nos órgãos internos. Pensando na segurança do seu produto, um fabricante de automóveis realizou testes em cinco modelos diferentes" +
                " de cinto. Os testes simularam uma colisão de 0,30 segundo de duração, e os bonecos que representavam os ocupantes foram equipados com acelerômetros." +
                " Esse equipamento registra o módulo da desaceleração do boneco em função do tempo. Os parâmetros como massa dos bonecos, dimensões dos cintos e velocidade " +
                "imediatamente antes e após o impacto foram os mesmos para todos os testes. O resultado final obtido está no gráfico de aceleração por tempo.\n" +
                "\n" +
                "Qual modelo de cinto oferece menor risco de lesão ao motorista?");
        o.setIdImagem(R.drawable.fisica1);
        o.setOp1("1");
        o.setOp2("2");
        o.setOp3("3");
        o.setOp4("4");
        o.setOp5("5");
        o.setOpCerto("2");
        lista.add(o);

        Questao p = new Questao();
        p.setMateria("FÍSICA \uD83C\uDF0C ");
        p.setPergunta("(Enem/2018) Muitos smartphones e tablets não precisam mais de teclas, uma vez que todos os comandos podem ser dados ao se pressionar a própria tela." +
                " Inicialmente essa tecnologia foi proporcionada por meio das telas resistivas, formadas basicamente por duas camadas de material condutor " +
                "transparente que não se encostam até que alguém as pressione, modificando a resistência total do circuito de acordo com o ponto onde ocorre " +
                "o toque. A imagem é uma simplificação do circuito formado pelas placas, em que A e B representam pontos onde o circuito pode ser fechado por" +
                " meio do toque.\n" +
                "\n" +
                "Qual é a resistência equivalente no circuito provocada por um toque que fecha o circuito no ponto A?");
        p.setIdImagem(R.drawable.fisica2);
        p.setOp1("1,3 kΩ");
        p.setOp2("4,0 kΩ");
        p.setOp3("6,0 kΩ");
        p.setOp4("6,7 kΩ");
        p.setOp5("12,0 kΩ");
        p.setOpCerto("6,0 kΩ");
        lista.add(p);

        Questao q = new Questao();
        q.setMateria("FÍSICA \uD83C\uDF0C ");
        q.setPergunta("Enem/2018) O sonorizador é um dispositivo físico implantado sobre a superfície de uma rodovia de modo que provoque uma trepidação e ruído quando da passagem de um veículo sobre ele, alertando para a situação atípica à frente, como obras, pedágios ou travessia de pedestres. Ao passar sobre os sonorizadores, a suspensão do veículo sofre vibrações que produzem ondas sonoras, resultando em um barulho peculiar. Considere um veículo que passe com velocidade constante igual a 108 km/h sobre um sonorizador cujas faixas são separadas por uma distância de 8 cm.\n" +
                "\n" +
                "A frequência da vibração do automóvel percebida pelo condutor durante a passagem nesse sonorizador é mais próxima de:");
        q.setOp1("8,6 hertz.");
        q.setOp2("13,5 hertz.");
        q.setOp3("1350 hertz.");
        q.setOp4("375 hertz.");
        q.setOp5("4860 hertz.");
        q.setOpCerto("375 hertz.");
        lista.add(q);

        Questao r = new Questao();
        r.setMateria("FÍSICA \uD83C\uDF0C ");
        r.setPergunta("(Enem/2016) O motor de combustão interna, utilizado no transporte de pessoas e cargas, é uma máquina " +
                "térmica cujo ciclo consiste em quatro etapas: admissão, compressão, explosão/expansão e escape. Essas etapas estão representadas no diagrama " +
                "da pressão em função do volume. Nos motores a gasolina, a mistura ar/combustível entra em combustão por uma centelha elétrica.\n"+
                "Para o motor descrito, em qual ponto do ciclo é produzida a centelha elétrica?");
        r.setIdImagem(R.drawable.fisica3);
        r.setOp1("A");
        r.setOp2("C");
        r.setOp3("B");
        r.setOp4("E");
        r.setOp5("D");
        r.setOpCerto("C");
        lista.add(r);

        Questao s = new Questao();
        s.setMateria("FÍSICA \uD83C\uDF0C ");
        s.setPergunta("(Enem/2018) Muitos primatas, incluindo nós humanos, possuem visão tricromática: três pigmentos visuais na retina sensíveis à luz de uma " +
                "determinada faixa de comprimentos de onda. Informalmente, embora os pigmentos em si não possuem cor, estes são conhecidos como pigmentos" +
                " azul, verde e vermelho e estão associados à cor que causa grande excitação (ativação). A sensação que temos ao observar um objeto colorido " +
                "decorre da ativação relativa dos três pigmentos. Ou seja, se estimulássemos a retina com uma luz na faixa de 530 nm (retângulo I no gráfico), " +
                "não excitaríamos o pigmento \"azul\", o pigmento “verde” seria ativado ao máximo e o “vermelho” seria ativado em aproximadamente 75%, e isso" +
                " nos daria a sensação de ver uma cor amarelada. Já uma luz na faixa de comprimento de onda de 600 nm (retângulo II) estimularia o pigmento “verde”" +
                " um pouco e o “vermelho” em cerca de 75%, e isso nos daria a sensação de ver laranja-avermelhado. No entanto, há características genéticas " +
                "presentes em alguns indivíduos, conhecidas coletivamente como Daltonismo, em que um ou mais pigmentos não funcionam perfeitamente.\n" +
                "\n" +
                "Caso estimulássemos a retina de um indivíduo com essa característica, que não possuísse o pigmento conhecido como “verde”, com as luzes de 530 nm" +
                " e 600 nm na mesma intensidade luminosa, esse indivíduo seria incapaz de");
        s.setIdImagem(R.drawable.fisica4);
        s.setOp1("identificar o comprimento de onda do amarelo, uma vez que não possui o pigmento \"verde\".");
        s.setOp2("ver o estímulo de comprimento de onda laranja, pois não haveria estimulação de um pigmento visual.");
        s.setOp3("detectar ambos os comprimentos de onda, uma vez que a estimulação dos pigmentos estaria prejudicada.");
        s.setOp4("visualizar o estímulo do comprimento de onda roxo, já que este se encontra na outra ponta do espectro.");
        s.setOp5("distinguir os dois comprimentos de onda, pois ambos estimulam o pigmento “vermelho” na mesma intensidade.");
        s.setOpCerto("distinguir os dois comprimentos de onda, pois ambos estimulam o pigmento “vermelho” na mesma intensidade.");
        lista.add(s);

        Questao t = new Questao();
        t.setMateria("INGLÊS \uD83C\uDDFA\uD83C\uDDF8 ");
        t.setPergunta("(Enem 2017)\n" +
                "\n" +
                "One of the things that made an incredible impression on me in the film was Frida’s comfort in and celebration of her own unique beauty. " +
                "She didn’t try to fit into conventional ideas or images about womanhood or what makes someone or something beautiful. Instead, she fully inhabited her own unique gifts, not particularly caring what other people thought. She was magnetic and beautiful in her own right. She painted for years, not to be a commercial success or to be discovered, but to express her own inner pain, joy, family, love and culture. She absolutely and resolutely was who she was. The trueness of her own unique vision and her ability to stand firmly in her own truth was what made her successful in the end.\n" +
                "\n" +
                "A autora desse comentário sobre o filme Frida mostra-se impressionada com o fato de a pintora\n");
        t.setOp1("ter uma aparência exótica.");
        t.setOp2("vender bem a sua imagem.");
        t.setOp3("ter grande poder de sedução.");
        t.setOp4("assumir sua beleza singular.");
        t.setOp5("recriar-se por meio da pintura.");
        t.setOpCerto("assumir sua beleza singular.");
        lista.add(t);

        Collections.shuffle(lista);
        imagem.setImageResource(lista.get(indicelista).getIdImagem());
        materia.setText(lista.get(indicelista).getMateria());
        pergunta.setText(lista.get(indicelista).getPergunta());
        rb1.setText(lista.get(indicelista).getOp1());
        rb2.setText(lista.get(indicelista).getOp2());
        rb3.setText(lista.get(indicelista).getOp3());
        rb4.setText(lista.get(indicelista).getOp4());
        rb5.setText(lista.get(indicelista).getOp5());
        placar.setText("CORRETAS: " + corretas + "/" + lista.size());
        placar1.setText("INCORRETAS: " + incorretas + "/" + lista.size());
        placar2.setText("TOTAL: " + total + "/" + lista.size());
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        b1.setEnabled(true);
        if(radioGroup== rg1){

            if(rb1.getId()==i){
                textoRadioTocado= rb1.getText().toString();
                indiceRadioTocado=1;
            }
            if(rb2.getId()==i){
                textoRadioTocado= rb2.getText().toString();
                indiceRadioTocado=2;
            }
            if(rb3.getId()==i){
                textoRadioTocado= rb3.getText().toString();
                indiceRadioTocado=3;
            }
            if(rb4.getId()==i){
                textoRadioTocado= rb4.getText().toString();
                indiceRadioTocado=4;
            }
            if(rb5.getId()==i){
                textoRadioTocado= rb5.getText().toString();
                indiceRadioTocado=5;
            }
        }
    }

    @Override
    public void onClick(View view) {
        if(view==b1) {
            if (flag == false) {
                verificaResultado();
                travarRadios();
                flag = true;
                b1.setText("Proximo");
            }else{
                flag = false;
                b1.setText("Verificar");
                destravarRadios();
                proximaQuestao();
            }
            if (indicelista==lista.size()){

            }
        }

    }

    public void travarRadios(){
        rb1.setEnabled(false);
        rb2.setEnabled(false);
        rb3.setEnabled(false);
        rb4.setEnabled(false);
        rb5.setEnabled(false);
    }

    public void destravarRadios(){
        rb1.setEnabled(true);
        rb2.setEnabled(true);
        rb3.setEnabled(true);
        rb4.setEnabled(true);
        rb5.setEnabled(true);
        rb1.setBackgroundColor(Color.WHITE);
        rb1.setSelected(false);
        rb2.setBackgroundColor(Color.WHITE);
        rb2.setSelected(false);
        rb3.setBackgroundColor(Color.WHITE);
        rb3.setSelected(false);
        rb4.setBackgroundColor(Color.WHITE);
        rb4.setSelected(false);
        rb5.setBackgroundColor(Color.WHITE);
        rb5.setSelected(false);

        rb1.setChecked(false);
        rb2.setChecked(false);
        rb3.setChecked(false);
        rb4.setChecked(false);
        rb5.setChecked(false);
    }

    public void proximaQuestao(){
        indicelista++;
        if(indicelista==lista.size()){


            Intent i = new Intent(this, PagFinal.class);
            Bundle b = new Bundle();
            b.putString("dado", String.valueOf(corretas));
            b.putString("dado1", String.valueOf(incorretas));
            i.putExtras(b);
            startActivity(i);

            indicelista=0;
            barra.setProgress(0);
            corretas=0;
            incorretas=0;
            total=0;
        }else{
            imagem.setImageResource(lista.get(indicelista).getIdImagem());
            materia.setText(lista.get(indicelista).getMateria());
            pergunta.setText(lista.get(indicelista).getPergunta());
            rb1.setText(lista.get(indicelista).getOp1());
            rb2.setText(lista.get(indicelista).getOp2());
            rb3.setText(lista.get(indicelista).getOp3());
            rb4.setText(lista.get(indicelista).getOp4());
            rb5.setText(lista.get(indicelista).getOp5());
            placar.setText("CORRETAS: " + corretas + "/" + lista.size());
            placar1.setText("INCORRETAS: " + incorretas + "/" + lista.size());
            placar2.setText("TOTAL: " + total + "/" + lista.size());
        }

    }

    public void verificaResultado(){
        if(textoRadioTocado.compareToIgnoreCase(lista.get(indicelista).getOpCerto())==0){
            if(indiceRadioTocado==1){
                rb1.setBackgroundColor(Color.GREEN);
            }
            if(indiceRadioTocado==2){
                rb2.setBackgroundColor(Color.GREEN);
            }
            if(indiceRadioTocado==3){
                rb3.setBackgroundColor(Color.GREEN);
            }
            if(indiceRadioTocado==4){
                rb4.setBackgroundColor(Color.GREEN);
            }
            if(indiceRadioTocado==5){
                rb5.setBackgroundColor(Color.GREEN);
            }
            corretas++;
            total++;

        } else{
            if(indiceRadioTocado==1){
                rb1.setBackgroundColor(Color.RED);
            }
            if(indiceRadioTocado==2){
                rb2.setBackgroundColor(Color.RED);
            }
            if(indiceRadioTocado==3){
                rb3.setBackgroundColor(Color.RED);
            }
            if(indiceRadioTocado==4){
                rb4.setBackgroundColor(Color.RED);
            }
            if(indiceRadioTocado==5){
                rb5.setBackgroundColor(Color.RED);
            }
            incorretas++;
            total++;
        }
        barra.incrementProgressBy(100 / lista.size());
    }
}