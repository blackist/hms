package com.xzit.hms.action.inhospitalcost;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.xzit.hms.action.BaseAction;
import com.xzit.hms.bean.inhospital.InhospitalCost;

@Namespace("/inhospitalcost")
public class InHospitalCost extends BaseAction<InhospitalCost>{
	
	private InhospitalCost inHospCost = new InhospitalCost();
	
	@Action(value="getinhosCost",results={@Result(name="success",location="/WEB-INF/jsp/inhospital/inhospitalcost.jsp")})
	public String getInHosCost(){
		return "success";
	}

	public InhospitalCost getModel() {
		// TODO Auto-generated method stub
		return inHospCost;
	}
}
