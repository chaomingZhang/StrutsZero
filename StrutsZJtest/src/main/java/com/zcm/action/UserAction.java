package com.zcm.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;
@ParentPackage(value="struts-default")
@Action
@Results({
	@Result(name="add" ,location="/add.jsp" ),
	@Result(name="del",location="/del.jsp")
	
})
public class UserAction {
	public String add() throws Exception {
		// TODO Auto-generated method stub
		return "add";
	}
	public String del() throws Exception {
		// TODO Auto-generated method stub
		return "del";
	}
}
