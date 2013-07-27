import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorController2 implements  ActionListener
{
    CalculatorModel model;
    CalculatorView2  view;

    public CalculatorController2(CalculatorModel model, CalculatorView2 view)
    {
        this.model = model;
        this.view = view;

        // Give the model a start situation as per what the GUI will show.
        model.setAnswer(0.0);
        model.setInitialNumber(0.0);

        // Add the action listener from this class on to the buttons of the view.
        view.buttonActionListeners(this);
    }

    // This deals with the interactions performed on the View.
    // It covers addition, subtraction, division and multiplication.
    public void actionPerformed(ActionEvent ae)
    {
        String action_com = ae.getActionCommand();

        if(action_com.equals("+"))
        {
            model.setInitialNumber(view.getFieldText());
            view.setInputText(view.getFieldText() + " + ");
        }
        else if (action_com.equals("-"))
        {
            model.setInitialNumber(view.getFieldText());
            view.setInputText(view.getFieldText() + " - ");
        }
        else if (action_com.equals("*"))
        {
            model.setInitialNumber(view.getFieldText());
            view.setInputText(view.getFieldText() + " * ");
        }
        else if (action_com.equals("/"))
        {
            model.setInitialNumber(view.getFieldText());
            view.setInputText(view.getFieldText() + " / ");
        }
        else if(action_com.equals("="))
        {
        	
        	if(view.getFieldText2()[1].equals("+"))
            {
            	model.setAnswer(Double.parseDouble(view.getFieldText2()[0]));
        		model.doAddition(Double.parseDouble(view.getFieldText2()[2]));
            }
            else if (view.getFieldText2()[1].equals("-"))
            {
            	model.setAnswer(Double.parseDouble(view.getFieldText2()[0]));
            	model.doSubtraction(Double.parseDouble(view.getFieldText2()[2]));
            }
            else if (view.getFieldText2()[1].equals("*"))
            {
            	model.setAnswer(Double.parseDouble(view.getFieldText2()[0]));
            	model.doMultiply(Double.parseDouble(view.getFieldText2()[2]));
            }
            else if (view.getFieldText2()[1].equals("/"))
            {
            	model.setAnswer(Double.parseDouble(view.getFieldText2()[0]));
            	model.doDivision(Double.parseDouble(view.getFieldText2()[2]));
            }
        	view.setFieldText(""+model.getAnswer());
        }
    }
}