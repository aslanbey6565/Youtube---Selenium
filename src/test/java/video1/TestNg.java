package video1;

import org.testng.annotations.*;

public class TestNg {

//Junit’in gelismis versiyonudur.
//İsmi Next Generation Test kelimelerinden türetilmiş ,

    //Testlerinizi, istediginiz cesitli planlamalarla calistirma
    // (tum method’lar, farkli siralamalarla istenen method’lar, class’lar, spesifik amaclarla olusturulmus test.xml gruplari vb...)


    //AVANTAGES
    //1) Daha fazla before ve after
//    @BeforeSuite
//    @AfterSuite
//    @BeforeTest
//    @AfterTest
//    @BeforeGroups
//    @AfterGroups
//    @BeforeClass
//    @AfterClass

//    2) Class ta bulunan test.xml medhodlarin hangi sira ile calisacahini belirleyebiliriz. // Natural Order degistirebiliriz

            // kucuk olan once calisir
            // esit priority numarasina esit olanlar isim siralamasina gore calisiri
            // Priority yazilmazsa testNG proiority= 0 olarak kabul eder ve buna gore siralamaya koyar
    //3) dependsOnMethod
            // siralamadan bagimsiz olarak bir Test Methodunun calismasini diger methodun passed olmasina baglar

    //4) xml dosya kullanimi ile testleri toplu calistirma imkani saglar
}
