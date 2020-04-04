package by.siarhei.pikabu.frame;

import by.siarhei.pikabu.builder.PanelComponentsBuilder;
import by.siarhei.pikabu.listener.CalculateButtonActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainFramePanel extends JPanel {
    private PanelComponentsBuilder builder;
    private ActionListener calculateButtonActionListener;
    private JButton calculateButton;
    private JTextField inputLengthField;
    private JTextField inputDiameterField;
    private JTextField outputResultField;
    private JTextField inputAmperField;
    private JTextArea resultHolderFiled;
    private JLabel diameterLabel;
    private JLabel lengthLabel;
    private JLabel amperLabel;
    private JScrollPane scroll;

    public MainFramePanel() {
        setLayout(null);
        init();
        buildComponents();
        layoutBuild(calculateButton, inputDiameterField, inputLengthField, outputResultField, diameterLabel, lengthLabel, inputAmperField, amperLabel, scroll);
    }

    private void layoutBuild(Component... components) {
        for (Component component : components) {
            add(component);
        }
    }

    private void init() {
        builder = new PanelComponentsBuilder();
        calculateButton = new JButton();
        inputLengthField = new JTextField();
        inputDiameterField = new JTextField();
        inputAmperField = new JTextField();
        outputResultField = new JTextField();
        diameterLabel = new JLabel();
        lengthLabel = new JLabel();
        amperLabel = new JLabel();
        resultHolderFiled = new JTextArea();
        calculateButtonActionListener = new CalculateButtonActionListener(inputLengthField, inputDiameterField, outputResultField, resultHolderFiled, inputAmperField);
        scroll = new JScrollPane(resultHolderFiled);
    }

    private void buildComponents() {
        builder.buildCalculateButton(calculateButton);
        calculateButton.addActionListener(calculateButtonActionListener);
        builder.buildInputLengthField(inputLengthField);
        builder.buildInputDiameterField(inputDiameterField);
        builder.buildOutputResultField(outputResultField);
        builder.buildDiameterLabel(diameterLabel);
        builder.buildLengthLabel(lengthLabel);
        builder.buildResultHolderTextArea(resultHolderFiled);
        builder.buildResultHolderScrollBar(scroll);
        builder.buildInputAmperField(inputAmperField);
        builder.buildAmperLabel(amperLabel);
    }
}
