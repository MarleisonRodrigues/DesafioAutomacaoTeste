package tests;


import entities.BaseTest;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.DesafioCadastroPage;

//@Listeners(TM4JTestNGListener.class)
public class DesafioAutomacaoTest extends BaseTest {

    String nome ="Marleison";
    String sobrenome = "Rodrigues";
    String sugestoes = "Teste de software aprovado! Pode colocar no git. kkkk";


    @Test
    public void deveCadastrarPessoaExemplo(){
        DesafioCadastroPage cp = new DesafioCadastroPage(getDriver());

        cp.preencherNome(nome)
                .preencherSobrenome(sobrenome)
                .marcarSexo()
                .mostrarSugestoes(sugestoes)
                .clicarComidaCarne()
                .clicarComidaFrango()
                .clicarComidaPizza()
                //.clicarComidaVegetariano()
                .selecionarEscolaridade()
                .selecionarEsporteKarate()
                .clicarCadastrar();


        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"descNome\"]/span")).getText(), nome);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"descSobrenome\"]/span")).getText(), sobrenome);
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"descSexo\"]/span")).getText(), "Masculino");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"descComida\"]/span")).getText(), "Carne Frango Pizza");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"descEscolaridade\"]/span")).getText(), "superior");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"descEsportes\"]/span")).getText(), "Karate");
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"descSugestoes\"]/span")).getText(), sugestoes);


    }





}
