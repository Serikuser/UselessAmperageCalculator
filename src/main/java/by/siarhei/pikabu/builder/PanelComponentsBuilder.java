package by.siarhei.pikabu.builder;

import javax.swing.*;
import java.awt.*;

public class PanelComponentsBuilder {
    private static final String DIAMETER_LABEL = "Diameter (mm): ";
    private static final String LENGTH_LABEL = "Length (мм): ";
    private static final String CALCULATE_LABEL = "Calculate";
    private static final String DEFAULT_FONT_LABEL = "SanSerif";
    private Font font;

    public PanelComponentsBuilder() {
        new PanelComponentsBuilder(new Font(DEFAULT_FONT_LABEL, Font.BOLD, 20));
    }

    public PanelComponentsBuilder(Font font) {
        this.font = font;
    }

    public void buildCalculateButton(JButton calculateButton) {
        calculateButton.setText(CALCULATE_LABEL);
        calculateButton.setBounds(115, 117, 420, 30);
        calculateButton.setFont(font);
    }

    public void buildInputLengthField(JTextField inputLengthField) {
        inputLengthField.setBounds(110, 10, 430, 40);
        inputLengthField.setFont(font);
    }

    public void buildInputDiameterField(JTextField inputDiameterField) {
        inputDiameterField.setBounds(110, 55, 430, 40);
        inputDiameterField.setFont(font);
    }

    public void buildOutputResultField(JTextField outputResultField) {
        outputResultField.setVisible(false);
        outputResultField.setEditable(false);
        outputResultField.setBounds(110, 165, 430, 40);
        outputResultField.setFont(font);
    }

    public void buildDiameterLabel(JLabel diameterLabel) {
        diameterLabel.setVisible(true);
        diameterLabel.setText(DIAMETER_LABEL);
        diameterLabel.setBounds(10, 55, 100, 40);
    }

    public void buildLengthLabel(JLabel lengthLabel) {
        lengthLabel.setVisible(true);
        lengthLabel.setText(LENGTH_LABEL);
        lengthLabel.setBounds(10, 10, 100, 40);
    }

    public void buildResultHolderTextArea(JTextArea resultHolderFiled) {
        resultHolderFiled.setVisible(true);
        resultHolderFiled.setEditable(false);
        resultHolderFiled.setBounds(110, 210, 430, 200);
        resultHolderFiled.setFont(font);
    }

    public void buildResultHolderScrollBar(JScrollPane scroll) {
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setBounds(110, 210, 430, 200);
    }
}
