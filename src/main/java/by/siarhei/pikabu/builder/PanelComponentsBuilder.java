package by.siarhei.pikabu.builder;

import javax.swing.*;
import java.awt.*;

public class PanelComponentsBuilder {
    private static final String DIAMETER_LABEL = "Diameter (mm): ";
    private static final String LENGTH_LABEL = "Length (мм): ";
    private static final String CALCULATE_LABEL = "Calculate";
    private static final String DEFAULT_FONT_LABEL = "SanSerif";
    private static final String AMPER_LABEL = "Power/square (A): ";
    private static final String DEFAULT_AMPER_VALUE = "50";

    private Font font;

    public PanelComponentsBuilder() {
        new PanelComponentsBuilder(new Font(DEFAULT_FONT_LABEL, Font.BOLD, 20));
    }

    public PanelComponentsBuilder(Font font) {
        this.font = font;
    }

    public void buildCalculateButton(JButton calculateButton) {
        calculateButton.setText(CALCULATE_LABEL);
        calculateButton.setBounds(165, 147, 420, 25);
        calculateButton.setFont(font);
    }

    public void buildInputLengthField(JTextField inputLengthField) {
        inputLengthField.setBounds(160, 10, 430, 35);
        inputLengthField.setFont(font);
    }

    public void buildInputDiameterField(JTextField inputDiameterField) {
        inputDiameterField.setBounds(160, 55, 430, 35);
        inputDiameterField.setFont(font);
    }

    public void buildOutputResultField(JTextField outputResultField) {
        outputResultField.setVisible(false);
        outputResultField.setEditable(false);
        outputResultField.setBounds(160, 175, 430, 30);
        outputResultField.setFont(font);
    }

    public void buildDiameterLabel(JLabel diameterLabel) {
        diameterLabel.setVisible(true);
        diameterLabel.setText(DIAMETER_LABEL);
        diameterLabel.setBounds(5, 55, 130, 35);
    }

    public void buildLengthLabel(JLabel lengthLabel) {
        lengthLabel.setVisible(true);
        lengthLabel.setText(LENGTH_LABEL);
        lengthLabel.setBounds(5, 10, 130, 35);
    }

    public void buildResultHolderTextArea(JTextArea resultHolderFiled) {
        resultHolderFiled.setVisible(true);
        resultHolderFiled.setEditable(false);
        resultHolderFiled.setBounds(160, 210, 615, 225);
        resultHolderFiled.setFont(font);
    }

    public void buildResultHolderScrollBar(JScrollPane scroll) {
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setBounds(5, 210, 615, 225);
    }

    public void buildInputAmperField(JTextField inputAmperField) {
        inputAmperField.setText(DEFAULT_AMPER_VALUE);
        inputAmperField.setBounds(160, 100, 430, 35);
        inputAmperField.setFont(font);
    }

    public void buildAmperLabel(JLabel lengthLabel) {
        lengthLabel.setVisible(true);
        lengthLabel.setText(AMPER_LABEL);
        lengthLabel.setBounds(5, 100, 130, 35);
    }
}
