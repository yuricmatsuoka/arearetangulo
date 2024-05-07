import javafx.event.Event;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RetanguloController
{
    RetanguloView retanguloView;
    Stage stage;
    RetanguloModel retanguloModel;
    public TextField textFieldAltura;
    public TextField textFieldBase;
    public Label labelResultado;
    
    /**
     * Construtor para objetos da classe RetanguloController
     */
    public RetanguloController()
    {
        this.stage = new Stage();
        this.retanguloModel = new RetanguloModel();
        this.retanguloView = new RetanguloView();
        this.retanguloView.setController(this);
    }
    
    public void iniciar() throws Exception {
        this.retanguloView.start(this.stage);
        this.stage.show();
    }
    
    public void botaoCalcularClicado(Event e) {
        try {
            double altura = Double.parseDouble(textFieldAltura.getText());
            double base = Double.parseDouble(textFieldBase.getText());
            double area = altura * base;
            this.labelResultado.setText("Área do retângulo: " + area);
        } catch (NumberFormatException exception) {
            labelResultado.setText("Dados de entrada incompletos ou inválidos");
        }
    }
    
    public void botaoLimparClicado(Event e) {
        textFieldAltura.setText("");
        textFieldBase.setText("");
        labelResultado.setText("");
    }    
}