package ems.member.configration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ems.member.DataBaseConnectionInfo;
import ems.member.dao.StudentDao;
import ems.member.service.EMSInformationService;
import ems.member.service.StudentAllSelectService;
import ems.member.service.StudentDeleteService;
import ems.member.service.StudentModifyService;
import ems.member.service.StudentRegisterService;
import ems.member.service.StudentSelectService;

@Configuration
public class MemberConfigration {

	@Bean
	public StudentDao studentDao() {
		return new StudentDao();
	}
	@Bean
	public StudentRegisterService registerService() {
		return new StudentRegisterService(studentDao());
	}
	@Bean
	public StudentModifyService modifyService() {
		return new StudentModifyService(studentDao());
	}
	@Bean
	public StudentDeleteService deleteService() {
		return new StudentDeleteService(studentDao());
	}
	@Bean
	public StudentAllSelectService allSelectService() {
		return new StudentAllSelectService(studentDao());
	}
	@Bean
	public StudentSelectService selectService() {
		return new StudentSelectService(studentDao());
	}
	
	/*<bean id="dataBaseConnectionInfoDev" class="ems.member.DataBaseConnectionInfo">
		<property name="jdbcUrl" value="jdbc:oracle:thin:@localhost:1521:xe" />
		<property name="userId" value="scott" />
		<property name="userPw" value="tiger" />
	</bean>
	
	<bean id="dataBaseConnectionInfoReal" class="ems.member.DataBaseConnectionInfo">
		<property name="jdbcUrl" value="jdbc:oracle:thin:@192.168.0.1:1521:xe" />
		<property name="userId" value="masterid" />
		<property name="userPw" value="masterpw" />
	</bean>*/
	@Bean
	public DataBaseConnectionInfo dataBaseConnectionInfoDev() {
		DataBaseConnectionInfo InfoDev = new DataBaseConnectionInfo();
		InfoDev.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		InfoDev.setUserId("scott");
		InfoDev.setUserPw("tiger");
		
		return InfoDev;
	}
	
	@Bean
	public DataBaseConnectionInfo dataBaseConnectionInfoReal() {
		DataBaseConnectionInfo InfoReal = new DataBaseConnectionInfo();
		InfoReal.setJdbcUrl("jdbc:oracle:thin:@192.168.0.1:1521:xe");
		InfoReal.setUserId("masterid");
		InfoReal.setUserPw("masterpw");
		
		return InfoReal;
	}
	
	@Bean
	public EMSInformationService informationService() {
		EMSInformationService Info = new EMSInformationService();
		Info.setInfo("Education Management System program was developed in 2015.");
		Info.setCopyRight("COPYRIGHT(C) 2015 EMS CO., LTD. ALL RIGHT RESERVED. CONTACT MASTER FOR MORE INFORMATION.");
		Info.setVer("The version is 1.0");
		Info.setsYear(2015);
		Info.setsMonth(1);
		Info.setsDay(1);
		Info.seteYear(2015);
		Info.seteMonth(2);
		Info.seteDay(28);
		
		ArrayList<String> developers = new ArrayList<String>();
		developers.add("Cheney");
		developers.add("Eloy");
		developers.add("Jasper");
		developers.add("Dillon");
		developers.add("Kian");
		Info.setDevelopers(developers);
		
		Map<String, String> administrators = new HashMap<String, String>();
		administrators.put("Cheney", "cheney@springPjt.org");
		administrators.put("Jasper", "jasper@springPjt.org");
		Info.setAdministrators(administrators);
		
		
		Map<String, DataBaseConnectionInfo> dbInfos = new HashMap<String, DataBaseConnectionInfo>();
		dbInfos.put("dev", dataBaseConnectionInfoDev());
		dbInfos.put("real", dataBaseConnectionInfoReal());
		Info.setDbInfos(dbInfos);
		return Info;
	}
}
