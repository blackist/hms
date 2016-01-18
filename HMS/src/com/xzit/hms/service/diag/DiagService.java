package com.xzit.hms.service.diag;

import com.xzit.hms.bean.patient.DiagnosticInfo;

public interface DiagService {
	public void save();
	public DiagnosticInfo getDiagnosticInfo(DiagnosticInfo diagnosticInfo);

}
