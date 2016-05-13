package com.ehr.model;

import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
public class TestComplexView {
 
	private CrashTraceV2DO crashTrace;
 
	private List<String> list;
 
	private String param1;
 
	private String param2;

}
