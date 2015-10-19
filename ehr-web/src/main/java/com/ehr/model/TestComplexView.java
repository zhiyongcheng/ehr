package com.ehr.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class TestComplexView {
	@Getter
	@Setter
	private CrashTraceV2DO crashTrace;
	@Getter
	@Setter
	private List<String> list;
	@Getter
	@Setter
	private String param1;
	@Getter
	@Setter
	private String param2;
}
