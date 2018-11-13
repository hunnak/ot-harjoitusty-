/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author joelhunn
 */
public class KorttiTest {
    
    public KorttiTest() {
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
     public void hello() {}
     
     @Test
     public void konstruktoriAsettaaSaldonOikein(){
         Maksukortti kortti= new Maksukortti(10);
         
         String vastaus=kortti.toString();
         
         assertEquals("Kortilla on rahaa 10.0 euroa", vastaus);
     }
     
     @Test
    public void syoEdullisestiVahentaaSaldoaOikein() {
    Maksukortti kortti = new Maksukortti(10);
    
    kortti.syoEdullisesti();
    
    assertEquals("Kortilla on rahaa 7.5 euroa", kortti.toString());
}
    @Test
public void syoMaukkaastiVahentaaSaldoaOikein() {
    Maksukortti kortti = new Maksukortti(10);

    kortti.syoMaukkaasti();

    assertEquals("Kortilla on rahaa 6.0 euroa", kortti.toString());
}

@Test
public void syoEdullisestiEiVieSaldoaNegatiiviseksi() {
    Maksukortti kortti = new Maksukortti(10);

    kortti.syoMaukkaasti();
    kortti.syoMaukkaasti();
    // nyt kortin saldo on 2
    kortti.syoEdullisesti();

    assertEquals("Kortilla on rahaa 2.0 euroa", kortti.toString());
}  
}
