package by.siarhei.pikabu.frame;

import by.siarhei.pikabu.builder.PanelComponentsBuilder;
import by.siarhei.pikabu.listener.CalculateButtonActionListener;
import by.siarhei.pikabu.math.AmperageCalculator;
import by.siarhei.pikabu.math.BaseCalculator;
import by.siarhei.pikabu.validator.InputDataValidator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainFramePanel extends JPanel {
    private PanelComponentsBuilder builder;
    private InputDataValidator validator;
    private BaseCalculator calculator;
    private ActionListener calculateButtonActionListener;
    private JButton calculateButton;
    private JTextField inputLengthField;
    private JTextField inputDiameterField;
    private JTextField outputResultField;
    private JLabel diameterLabel;
    private JLabel lengthLabel;

    public MainFramePanel() {
        setLayout(null);
        init();
        buildComponents();
        layoutBuild(calculateButton, inputDiameterField, inputLengthField, outputResultField, diameterLabel, lengthLabel);
    }

    private void layoutBuild(Component... components) {
        for (Component component : components) {
            add(component);
        }
    }

    private void init() {
        validator = new InputDataValidator();
        calculator = new AmperageCalculator();
        builder = new PanelComponentsBuilder();
        calculateButton = new JButton();
        inputLengthField = new JTextField();
        inputDiameterField = new JTextField();
        outputResultField = new JTextField();
        diameterLabel = new JLabel();
        lengthLabel = new JLabel();
        calculateButtonActionListener = new CalculateButtonActionListener(inputLengthField, inputDiameterField, outputResultField);
    }

    private void buildComponents() {
        builder.buildCalculateButton(calculateButton);
        calculateButton.addActionListener(calculateButtonActionListener);
        builder.buildInputLengthField(inputLengthField);
        builder.buildInputDiameterField(inputDiameterField);
        builder.buildOutputResultField(outputResultField);
        builder.buildDiameterLabel(diameterLabel);
        builder.buildLengthLabel(lengthLabel);
    }
}
