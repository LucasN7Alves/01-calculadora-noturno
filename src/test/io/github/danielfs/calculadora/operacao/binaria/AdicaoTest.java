package io.github.danielfs.calculadora.operacao.binaria;

import org.junit.Test;
import org.junit.Before;
import static.org.junit.Asser.*;

public class AdicaoTest {
  private Adicao adicao;
  
  @Before
  public void inicializar(){
    adicao = new Adicao();
  }
  
  
  @Test
  public void deveriaRetornar5QuandoPssar2e3(){
  double valorEsperado = 5;
  double valorRetornado = adicao.calcular(2,3);
  
  assertEquals(valorEsperado, valorRetornado, 0);
  }
}
