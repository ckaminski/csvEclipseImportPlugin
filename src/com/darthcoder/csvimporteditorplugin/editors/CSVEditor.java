package com.darthcoder.csvimporteditorplugin.editors;

import org.eclipse.ui.editors.text.TextEditor;

public class CSVEditor extends TextEditor {

	private ColorManager colorManager;

	public CSVEditor() {
		super();
		colorManager = new ColorManager();
		setSourceViewerConfiguration(new XMLConfiguration(colorManager));
		setDocumentProvider(new XMLDocumentProvider());
	}
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}

}
