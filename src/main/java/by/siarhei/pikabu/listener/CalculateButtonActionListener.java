package by.siarhei.pikabu.listener;

import by.siarhei.pikabu.math.AmperageCalculator;
import by.siarhei.pikabu.math.BaseCalculator;
import by.siarhei.pikabu.validator.InputDataValidator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class CalculateButtonActionListener implements ActionListener {
    private static final String DOUBLE_OUTPUT_FORMAT = "#0.00";
    private static final String ERROR_TEXT = "Entered invalid data";
    private static final String AMPERAGE_LABEL = " A";
    private InputDataValidator validator;
    private BaseCalculator calculator;
    private JTextField inputLengthField;
    private JTextField inputDiameterField;
    private JTextField outputResultField;


    public CalculateButtonActionListener(JTextField inputLengthField, JTextField inputDiameterField, JTextField outputResultField) {
        this.inputDiameterField = inputDiameterField;
        this.inputLengthField = inputLengthField;
        this.outputResultField = outputResultField;
        calculator = new AmperageCalculator();
        validator = new InputDataValidator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String inputDiameter = inputDiameterField.getText();
        String inputLength = inputLengthField.getText();
        outputResultField.setVisible(true);
        if (validator.validate(inputDiameter, inputLength)) {
            double diameter = Double.parseDouble(inputDiameter);
            double length = Double.parseDouble(inputLength);
            String result = new DecimalFormat(DOUBLE_OUTPUT_FORMAT).format(calculator.calculate(diameter, length));
            outputResultField.setText(result + AMPERAGE_LABEL);
        } else {
            outputResultField.setText(ERROR_TEXT);
        }
    }
}

