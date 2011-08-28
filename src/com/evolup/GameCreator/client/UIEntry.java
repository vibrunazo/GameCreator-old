package com.evolup.GameCreator.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Button;

public class UIEntry implements EntryPoint {

	public void onModuleLoad() {
		RootPanel rootPanel = RootPanel.get();
		OptionBox oBox = new OptionBox();
		
		Label lblHelloWorld = new Label("hello world");
		rootPanel.add(lblHelloWorld, 10, 10);
		rootPanel.add(oBox, 10, 87);
		
		Button btnNew = new Button("new");
		rootPanel.add(btnNew, 10, 33);
		btnNew.setSize("41px", "29px");
	}
}
