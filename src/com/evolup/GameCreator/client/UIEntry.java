package com.evolup.GameCreator.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.VerticalPanel;

public class UIEntry implements EntryPoint {
	RootPanel rootPanel = RootPanel.get();
	VerticalPanel verticalPanel = new VerticalPanel();
	
	public void onModuleLoad() {
		
		Label lblHelloWorld = new Label("hello world");
		rootPanel.add(lblHelloWorld, 10, 10);
		
		Button btnNew = new Button("new");
		btnNew.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				AddOption();
			}
		});
		rootPanel.add(btnNew, 10, 33);
		btnNew.setSize("41px", "29px");
		
		
		rootPanel.add(verticalPanel, 10, 77);
		verticalPanel.setSize("100px", "100px");
		
		OptionBox optionBox = new OptionBox();
		verticalPanel.add(optionBox);
	}

	protected void AddOption() {
		OptionBox oBox = new OptionBox();
		verticalPanel.add(oBox);
	}
}
