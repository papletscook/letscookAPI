/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.test.receita;

import br.edu.up.letscook.model.entity.Etapa;
import br.edu.up.letscook.model.entity.Ingrediente;
import br.edu.up.letscook.model.entity.IngredienteReceita;
import br.edu.up.letscook.model.entity.PassoEtapa;
import br.edu.up.letscook.model.enums.NacionalidadeEnum;
import br.edu.up.letscook.model.entity.Receita;
import br.edu.up.letscook.model.entity.Usuario;
import br.edu.up.letscook.model.service.FactoryService;
import br.edu.up.letscook.model.service.InterfaceService;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author G0042204
 */
public class CadastrarReceitaJUnitTest {

    private final InterfaceService<Receita> serv = FactoryService.createReceitaService();

    public CadastrarReceitaJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void cadastrar() {

        try {

            Usuario u = new Usuario();
            u.setId(1l);

            IngredienteReceita ir = new IngredienteReceita();

            Ingrediente in = new Ingrediente();
            in.setNome("Carne");
            ir.setI(in);
            
            Receita r = new Receita();
            r.setNome("Nome da Receita");
            r.setFoto("foto");
            r.setNasc(NacionalidadeEnum.AFGHAN);
            r.setCriador(u);
            r.adicionarIngrediente(ir);

            Etapa e = new Etapa();
            e.adicionarPasso(new PassoEtapa("Passo 1"));

            r.adicionarEtapa(e);

            serv.cadastrar(r);

            assertTrue(r.getId() != null);

        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }

    }
}
