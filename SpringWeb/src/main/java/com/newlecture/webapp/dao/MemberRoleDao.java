package com.newlecture.webapp.dao;


public interface MemberRoleDao {

	String getDefaultRole(String memberId);

	boolean hasRole(String memberId, String string);

}
