package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DesafioCadastroPage extends BasePage {


    public DesafioCadastroPage(WebDriver driver) {
        super(driver);
    }

    //mostrar
    @FindBy(id = "elementosForm:nome")
    private WebElement nomeTextField;
    @FindBy(id = "elementosForm:sobrenome")
    private WebElement sobrenomeTextField;
    @FindBy(xpath = "//*[@id=\"elementosForm:sexo:0\"]")
    private WebElement sexoRadioButton;

    @FindBy(linkText = "voltar")
    private WebElement voltar;

    @FindBy(id = "elementosForm:comidaFavorita:0")
    private WebElement comidaFavoritaCarneCB;
    @FindBy(id = "elementosForm:comidaFavorita:1")
    private WebElement comidaFavoritaFrangoCB;
    @FindBy(id = "elementosForm:comidaFavorita:2")
    private WebElement comidaFavoritaPizzaCB;
    @FindBy(id = "elementosForm:comidaFavorita:3")
    private WebElement comidaFavoritaVegetarianoCB;

    @FindBy(xpath = "//*[@id=\"elementosForm:escolaridade\"]/option[5]")
    private WebElement escolaridadeSuperior;

    @FindBy(xpath = "//*[@id=\"elementosForm:esportes\"]/option[1]")
    private WebElement esporteNatacaoSelectOption;
    @FindBy(xpath = "//*[@id=\"elementosForm:esportes\"]/option[2]")
    private WebElement esporteFutebolSelectOption;
    @FindBy(xpath = "//*[@id=\"elementosForm:esportes\"]/option[3]")
    private WebElement esporteCorridaSelectOption;
    @FindBy(xpath = "//*[@id=\"elementosForm:esportes\"]/option[4]")
    private WebElement esporteKarateSelectOption;
    @FindBy(xpath = "//*[@id=\"elementosForm:esportes\"]/option[5]")
    private WebElement esporteOqueeesporteSelectOption;


    @FindBy(id = "elementosForm:cadastrar")
    private WebElement cadastrarButton;

    @FindBy(name = "elementosForm:sugestoes")
    private WebElement sugestaoText;


    public DesafioCadastroPage preencherNome(String nome) {
        nomeTextField.sendKeys(nome);
        return this;
    }
    public DesafioCadastroPage preencherSobrenome(String sobrenome) {
        sobrenomeTextField.sendKeys(sobrenome);
        return this;
    }
    public DesafioCadastroPage marcarSexo() {
        sexoRadioButton.click();
        return this;
    }



    //COMIDAS FAVORITAS
    public DesafioCadastroPage clicarComidaCarne() {
        comidaFavoritaCarneCB.click();
        return this;
    }
    public DesafioCadastroPage clicarComidaFrango() {
        comidaFavoritaFrangoCB.click();
        return this;
    }
    public DesafioCadastroPage clicarComidaPizza() {
        comidaFavoritaPizzaCB.click();
        return this;
    }
    public DesafioCadastroPage clicarComidaVegetariano() {
        comidaFavoritaVegetarianoCB.click();
        return this;
    }


    public DesafioCadastroPage selecionarEscolaridade(){
        escolaridadeSuperior.click();
        return this;
    }


    public DesafioCadastroPage selecionarEsporteNatacao(){
        esporteNatacaoSelectOption.click();
        return this;
    }
    public DesafioCadastroPage selecionarEsporteFutebol(){
        esporteFutebolSelectOption.click();
        return this;
    }
    public DesafioCadastroPage selecionarEsporteCorrida(){
        esporteCorridaSelectOption.click();
        return this;
    }
    public DesafioCadastroPage selecionarEsporteKarate(){
        esporteKarateSelectOption.click();
        return this;
    }


    public DesafioCadastroPage mostrarSugestoes(String sugestao){
        sugestaoText.sendKeys(sugestao);
        return this;
    }


    public DesafioCadastroPage clicarCadastrar() {
        cadastrarButton.click();
        return this;
    }


}
