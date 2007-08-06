package org.cishell.testing.convertertester.core.tester2.reportgen.results;

import org.cishell.testing.convertertester.core.tester2.filepassresults.FilePassResult;

public abstract class ConvFilePass {
	
	private FilePassResult fpr;
	
	public ConvFilePass(FilePassResult fpr) {
		this.fpr = fpr;
	}
	
	public FilePassResult getFilePassResult() {
		return fpr;
	}
}
