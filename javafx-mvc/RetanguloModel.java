
public class RetanguloModel
{
    double area;
    double base;
    double altura;
    
    public RetanguloModel() {
        this.area = 0;
        this.base = 0;
        this.altura = 0;
    }
    
    public RetanguloModel(double area, double base, double altura)
    {
        this.area = area;
        this.base = base; 
        this.altura = altura;
    }

    public double calcular()
    {
        this.area = ( this.base  * this.altura);
        return area;
    }
    
    public String interpretar()
    {
        String resultado = "";
        double areaRetangulo = this.calcular();
        if(area > 0){
            System.out.println("A área do retangulo é: " + area);;
        } else {
            System.out.println("A área do retangulo é: " + resultado);
        }
        
        return resultado;
    }
}
