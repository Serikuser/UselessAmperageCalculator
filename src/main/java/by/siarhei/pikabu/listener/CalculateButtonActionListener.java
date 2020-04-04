package by.siarhei.pikabu.listener;

import by.siarhei.pikabu.math.AmperageCalculator;
import by.siarhei.pikabu.math.BaseCalculator;
import by.siarhei.pikabu.validator.InputDataValidator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CalculateButtonActionListener implements ActionListener {
    private static final String DOUBLE_OUTPUT_FORMAT = "#0.00";
    private static final String ERROR_TEXT = "Entered invalid data";
    private static final String AMPERAGE_LABEL = " A";
    private static final String RESULT_TEXT = "Diameter (mm): %s; Length (mm): %s; Power / square (A): %s; Amperage: %s A; %n";
    private static final String DEFAULT_AMPER_VALUE = "50";

    private InputDataValidator validator;
    private BaseCalculator calculator;
    private JTextField inputLengthField;
    private JTextField inputDiameterField;
    private JTextField inputAmperField;
    private JTextField outputResultField;
    private JTextArea resultHolderFiled;
    private List<String> resultsList;
    private StringBuilder builder;


    public CalculateButtonActionListener(JTextField inputLengthField, JTextField inputDiameterField, JTextField outputResultField, JTextArea resultHolderFiled, JTextField inputAmperField) {
        this.inputDiameterField = inputDiameterField;
        this.inputLengthField = inputLengthField;
        this.outputResultField = outputResultField;
        this.resultHolderFiled = resultHolderFiled;
        this.inputAmperField = inputAmperField;
        calculator = new AmperageCalculator();
        validator = new InputDataValidator();
        resultsList = new ArrayList<>();
        builder = new StringBuilder();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String inputDiameter = inputDiameterField.getText();
        String inputLength = inputLengthField.getText();
        String inputAmper = inputAmperField.getText();
        outputResultField.setVisible(true);
        if (validator.validate(inputDiameter, inputLength, inputAmper)) {
            double diameter = Double.parseDouble(inputDiameter);
            double length = Double.parseDouble(inputLength);
            int amper = Integer.parseInt(inputAmper);
            if (amper < 50 || amper > 60) {
                setDefaultAmberValue();
                amper = 50;
            }
            setOutputDataToFrames(diameter, length, amper);
        } else {
            outputResultField.setText(ERROR_TEXT);
        }
    }

    private void setOutputDataToFrames(double diameter, double length, int amper) {
        String result = new DecimalFormat(DOUBLE_OUTPUT_FORMAT).format(calculator.calculate(diameter, length, amper));
        outputResultField.setText(result + AMPERAGE_LABEL);
        resultsList.add(String.format(RESULT_TEXT, diameter, length, amper, result));
        if (!resultsList.isEmpty()) {
            for (String value : resultsList) {
                builder.append(value);
            }
            resultHolderFiled.setText(builder.toString());
            builder.setLength(0);
        }
    }

    private void setDefaultAmberValue() {
        inputAmperField.setText(DEFAULT_AMPER_VALUE);
    }
}

