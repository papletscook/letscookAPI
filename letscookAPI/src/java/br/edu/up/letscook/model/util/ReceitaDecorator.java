/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.model.util;

import br.edu.up.letscook.model.entity.CategoriaReceita;
import br.edu.up.letscook.model.entity.Etapa;
import br.edu.up.letscook.model.entity.IngredienteReceita;
import br.edu.up.letscook.model.entity.PassoEtapa;
import br.edu.up.letscook.model.entity.Receita;
import br.edu.up.letscook.model.entity.Usuario;
import br.edu.up.letscook.model.enums.NacionalidadeEnum;

/**
 *
 * @author G0042204
 */
public class ReceitaDecorator {

    public static Receita criarBolo() {
        Receita r = new Receita();

        IngredienteReceita ir = new IngredienteReceita();
        ir.setNome("Maracujá");
        r.adicionarIngrediente(ir);

        CategoriaReceita cat = new CategoriaReceita();
        cat.setId(1l);
        r.setCategoria(cat);

        Usuario u = new Usuario();
        u.setId(1l);
        r.setCriador(u);
        r.setNasc(NacionalidadeEnum.BRASIL);

        r.setNome("TORTA DE MARACUJÁ");
        r.setMinsPreparo(45);

        Etapa e = new Etapa();
        e.setNome("BASE");
        e.adicionarPasso(new PassoEtapa("Em um processar ou liquidificador, bata os biscoitos (com recheio mesmo) até obter uma farinha grossa."));
        e.adicionarPasso(new PassoEtapa("Derreta a manteiga no micro-ondas por 30 segundos e misture com o biscoito triturado"));
        e.adicionarPasso(new PassoEtapa("Misture até obter uma mistura homogênea"));
        e.adicionarPasso(new PassoEtapa("Cubra a base e as bordas da forma com o biscoito e amasse bem com uma colher"));
        e.adicionarPasso(new PassoEtapa("Leve ao freezer por 30 minutos enquanto prepara o mouse"));

        r.adicionarEtapa(e);

        Etapa e1 = new Etapa();
        e1.setNome("RECHEIOS");
        e1.adicionarPasso(new PassoEtapa("Bata no liquidificador, o leite condensado, o creme de leite e o suco de maracujá concentrado"));
        e1.adicionarPasso(new PassoEtapa("À parte, dissolva a 1 pacote de gelatina incolor como descrito pelo fabricante (retire uma colher de sopa do pacote e use para a cobertura)"));
        e1.adicionarPasso(new PassoEtapa("Em seguida, misture a gelatina com os outro ingredientes"));
        e1.adicionarPasso(new PassoEtapa("Junte a gelatina dissolvida e bata no liquidificador por, cerca de, 3 minutos"));
        e1.adicionarPasso(new PassoEtapa("Tire a forma do freezer e despeje o mouse"));
        e1.adicionarPasso(new PassoEtapa("Deixe no freezer por mais 30 minutos enquanto prepara o chantili"));
        e1.adicionarPasso(new PassoEtapa("Prepare o chantili vegetal conforme as instruções da caixinha"));
        e1.adicionarPasso(new PassoEtapa("O chantili vegetal é o que tem a consistência mais firme para esse tipo de torta"));
        e1.adicionarPasso(new PassoEtapa("Normalmente tem que deixar a caixa do chantili no freezer ou geladeira antes de bater"));
        e1.adicionarPasso(new PassoEtapa("Bata na batedeira até obter consistência firme, vire a forma e o chantili não deve cair, esse é o ponto"));
        e1.adicionarPasso(new PassoEtapa("Retire a forma do freezer e coloque o chantili batido por cima"));
        e1.adicionarPasso(new PassoEtapa("Volte ao freezer enquanto prepara a calda"));

        r.adicionarEtapa(e1);

        Etapa e2 = new Etapa();
        e2.setNome("CALDA");
        e2.adicionarPasso(new PassoEtapa("Coloque a polpa de um maracujá grande com meia xícara de açúcar em uma panela e deixe ferver mexendo sempre"));
        e2.adicionarPasso(new PassoEtapa("Deixe esfriar e coloque 1 colher de sopa de gelatina sem sabor dissolvida"));
        e2.adicionarPasso(new PassoEtapa("Despeje por cima do chantili e espalhe suavemente com uma espátula para não misturar no chantili"));
        e2.adicionarPasso(new PassoEtapa("Pode deixar na geladeira a partir dessa etapa e espere a gelatina endurecer para servir (umas 2 horas)"));

        r.adicionarEtapa(e2);

        return r;
    }

    public static Receita criarPudim() {
        Receita r = new Receita();

        IngredienteReceita ir = new IngredienteReceita();
        ir.setNome("Maracujá");
        r.adicionarIngrediente(ir);

        r.setNome("TORTA DE MARACUJÁ");
        r.setMinsPreparo(45);

        Etapa e = new Etapa();
        e.setNome("BASE");
        e.adicionarPasso(new PassoEtapa("Em um processar ou liquidificador, bata os biscoitos (com recheio mesmo) até obter uma farinha grossa."));
        e.adicionarPasso(new PassoEtapa("Derreta a manteiga no micro-ondas por 30 segundos e misture com o biscoito triturado"));
        e.adicionarPasso(new PassoEtapa("Misture até obter uma mistura homogênea"));
        e.adicionarPasso(new PassoEtapa("Cubra a base e as bordas da forma com o biscoito e amasse bem com uma colher"));
        e.adicionarPasso(new PassoEtapa("Leve ao freezer por 30 minutos enquanto prepara o mouse"));

        r.adicionarEtapa(e);

        Etapa e1 = new Etapa();
        e1.setNome("RECHEIOS");
        e1.adicionarPasso(new PassoEtapa("Bata no liquidificador, o leite condensado, o creme de leite e o suco de maracujá concentrado"));
        e1.adicionarPasso(new PassoEtapa("À parte, dissolva a 1 pacote de gelatina incolor como descrito pelo fabricante (retire uma colher de sopa do pacote e use para a cobertura)"));
        e1.adicionarPasso(new PassoEtapa("Em seguida, misture a gelatina com os outro ingredientes"));
        e1.adicionarPasso(new PassoEtapa("Junte a gelatina dissolvida e bata no liquidificador por, cerca de, 3 minutos"));
        e1.adicionarPasso(new PassoEtapa("Tire a forma do freezer e despeje o mouse"));
        e1.adicionarPasso(new PassoEtapa("Deixe no freezer por mais 30 minutos enquanto prepara o chantili"));
        e1.adicionarPasso(new PassoEtapa("Prepare o chantili vegetal conforme as instruções da caixinha"));
        e1.adicionarPasso(new PassoEtapa("O chantili vegetal é o que tem a consistência mais firme para esse tipo de torta"));
        e1.adicionarPasso(new PassoEtapa("Normalmente tem que deixar a caixa do chantili no freezer ou geladeira antes de bater"));
        e1.adicionarPasso(new PassoEtapa("Bata na batedeira até obter consistência firme, vire a forma e o chantili não deve cair, esse é o ponto"));
        e1.adicionarPasso(new PassoEtapa("Retire a forma do freezer e coloque o chantili batido por cima"));
        e1.adicionarPasso(new PassoEtapa("Volte ao freezer enquanto prepara a calda"));

        r.adicionarEtapa(e1);

        Etapa e2 = new Etapa();
        e2.setNome("CALDA");
        e2.adicionarPasso(new PassoEtapa("Coloque a polpa de um maracujá grande com meia xícara de açúcar em uma panela e deixe ferver mexendo sempre"));
        e2.adicionarPasso(new PassoEtapa("Deixe esfriar e coloque 1 colher de sopa de gelatina sem sabor dissolvida"));
        e2.adicionarPasso(new PassoEtapa("Despeje por cima do chantili e espalhe suavemente com uma espátula para não misturar no chantili"));
        e2.adicionarPasso(new PassoEtapa("Pode deixar na geladeira a partir dessa etapa e espere a gelatina endurecer para servir (umas 2 horas)"));

        r.adicionarEtapa(e2);

        return r;
    }

}
