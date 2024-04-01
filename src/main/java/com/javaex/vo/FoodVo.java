package com.javaex.vo;

public class FoodVo {

	private int fNo;
	private String fName;
	private int fPrice;
	private String filePath;
	private String orgName;
	private String saveName;
	private long fileSize;
	private int fPoint;
	private String fRemarks;

	public FoodVo() {
		super();
	}

	
	public FoodVo(String filePath, String orgName, String saveName, long fileSize) {
		super();
		this.filePath = filePath;
		this.orgName = orgName;
		this.saveName = saveName;
		this.fileSize = fileSize;
	}


	public FoodVo(int fNo, String fName, int fPrice, String filePath, String orgName, String saveName, long fileSize,
			int fPoint, String fRemarks) {
		super();
		this.fNo = fNo;
		this.fName = fName;
		this.fPrice = fPrice;
		this.filePath = filePath;
		this.orgName = orgName;
		this.saveName = saveName;
		this.fileSize = fileSize;
		this.fPoint = fPoint;
		this.fRemarks = fRemarks;
	}

	public int getfNo() {
		return fNo;
	}

	public void setfNo(int fNo) {
		this.fNo = fNo;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public int getfPrice() {
		return fPrice;
	}

	public void setfPrice(int fPrice) {
		this.fPrice = fPrice;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getSaveName() {
		return saveName;
	}

	public void setSaveName(String saveName) {
		this.saveName = saveName;
	}

	public long getFileSize() {
		return fileSize;
	}

	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}

	public int getfPoint() {
		return fPoint;
	}

	public void setfPoint(int fPoint) {
		this.fPoint = fPoint;
	}

	public String getfRemarks() {
		return fRemarks;
	}

	public void setfRemarks(String fRemarks) {
		this.fRemarks = fRemarks;
	}

	@Override
	public String toString() {
		return "FoodVo [fNo=" + fNo + ", fName=" + fName + ", fPrice=" + fPrice + ", filePath=" + filePath
				+ ", orgName=" + orgName + ", saveName=" + saveName + ", fileSize=" + fileSize + ", fPoint=" + fPoint
				+ ", fRemarks=" + fRemarks + "]";
	}

}
