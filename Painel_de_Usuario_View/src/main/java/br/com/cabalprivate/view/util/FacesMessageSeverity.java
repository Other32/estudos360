package br.com.cabalprivate.view.util;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;

public enum FacesMessageSeverity {

	INFO(FacesMessage.SEVERITY_INFO), //
	WARN(FacesMessage.SEVERITY_WARN), //
	ERROR(FacesMessage.SEVERITY_ERROR), //
	FATAL(FacesMessage.SEVERITY_FATAL);

	private Severity severity;

	private FacesMessageSeverity(Severity severity) {
		this.severity = severity;
	}

	public Severity getSeverity() {
		return severity;
	}

}
