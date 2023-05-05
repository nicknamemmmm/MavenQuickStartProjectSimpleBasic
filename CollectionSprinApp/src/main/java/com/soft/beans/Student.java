package com.soft.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", visitplace=" + visitplace + ", cource=" + cource
				+ ", parents=" + parents + ", emails=" + emails + "]";
	}
	private int id;
	private String name;
	private List<String> visitplace;
	private Set<String> cource;
	private Map<String, String> parents;
	private Properties emails;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getVisitplace() {
		return visitplace;
	}
	public void setVisitplace(List<String> visitplace) {
		this.visitplace = visitplace;
	}
	public Set<String> getCource() {
		return cource;
	}
	public void setCource(Set<String> cource) {
		this.cource = cource;
	}
	public Map<String, String> getParents() {
		return parents;
	}
	public void setParents(Map<String, String> parents) {
		this.parents = parents;
	}
	public Properties getEmails() {
		return emails;
	}
	public void setEmails(Properties emails) {
		this.emails = emails;
	}
}
