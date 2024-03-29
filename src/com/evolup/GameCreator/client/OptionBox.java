package com.evolup.GameCreator.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.MultiWordSuggestOracle;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.SuggestBox;

public class OptionBox extends Composite {
	private Button button;
	SuggestBox typeBox;// = new SuggestBox();
	SuggestBox valueBox = new SuggestBox();

	public OptionBox() {
		
		DecoratorPanel decoratorPanel = new DecoratorPanel();
		initWidget(decoratorPanel);
		decoratorPanel.setSize("413px", "104px");
		
		AbsolutePanel absolutePanel = new AbsolutePanel();
		decoratorPanel.setWidget(absolutePanel);
		absolutePanel.setSize("360px", "100px");
		
		VerticalPanel verticalPanel = new VerticalPanel();
		absolutePanel.add(verticalPanel, 10, 10);
		verticalPanel.setSize("300px", "80px");
		
		HorizontalPanel horizontalPanel = new HorizontalPanel();
		verticalPanel.add(horizontalPanel);
		horizontalPanel.setSize("100%", "100%");
		
		Label label = new Label("Type");
		horizontalPanel.add(label);
		label.setWidth("50px");
		
		MultiWordSuggestOracle oracle = new MultiWordSuggestOracle();  
		oracle.add("Game Type");
		oracle.add("Character");
		oracle.add("Map");
		oracle.add("Theme");

		SuggestBox typeBox = new SuggestBox(oracle);
		horizontalPanel.add(typeBox);
		typeBox.setWidth("200px");

		HorizontalPanel horizontalPanel_1 = new HorizontalPanel();
		verticalPanel.add(horizontalPanel_1);
		horizontalPanel_1.setSize("100%", "100%");
		
		Label label_1 = new Label("Value");
		horizontalPanel_1.add(label_1);
		label_1.setWidth("50px");
		
		
		horizontalPanel_1.add(valueBox);
		valueBox.setWidth("200px");
		
		button = new Button("X");
		button.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				PressX();
			}
		});
		absolutePanel.add(button, 325, 37);
		button.setSize("25px", "29px");
	}

	protected void PressX() {
		this.removeFromParent();
		
	}
	
	public void AddType(String type) {
		typeBox.getSuggestOracle();
		
	}
}
