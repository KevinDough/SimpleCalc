public class Calculator2
{
    public static void main(String[] args){

        // Creates a model of the system logic.
        CalculatorModel model = new CalculatorModel();

        // Creaties a view for the system logic.
        CalculatorView2 view = new CalculatorView2();

        // Creates a controller that links the two.
        CalculatorController2 controller = new CalculatorController2(model, view);
    }
}