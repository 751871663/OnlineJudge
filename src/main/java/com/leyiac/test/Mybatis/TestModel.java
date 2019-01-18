package com.leyiac.test.Mybatis;

public class TestModel {
	
	private String uuid;
	private String sourceId;
	private String title;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "TestModel [uuid=" + uuid + ", sourceId=" + sourceId + ", title=" + title + "]";
	}

}
