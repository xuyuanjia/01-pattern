package com.xuyuanjia.pattern.prototype.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class CccUploadImage_HI_RO implements Serializable {
	private String uploadCode;
	private String storeNo;
	private Long uploadPersonId;
	private Date uploadTime;
	private Long fileId;
	private String filePath;
	private Long businessId;
	private String functionId;
	private String guideName;
	private String shopName;
	private BigDecimal fileSize;
	private String fileType;
	private String phyFileName;

	public String getUploadCode() {
		return uploadCode;
	}

	public void setUploadCode(String uploadCode) {
		this.uploadCode = uploadCode;
	}

	public String getStoreNo() {
		return storeNo;
	}

	public void setStoreNo(String storeNo) {
		this.storeNo = storeNo;
	}

	public Long getUploadPersonId() {
		return uploadPersonId;
	}

	public void setUploadPersonId(Long uploadPersonId) {
		this.uploadPersonId = uploadPersonId;
	}

	public Date getUploadTime() {
		return uploadTime;
	}

	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}

	public Long getFileId() {
		return fileId;
	}

	public void setFileId(Long fileId) {
		this.fileId = fileId;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public Long getBusinessId() {
		return businessId;
	}

	public void setBusinessId(Long businessId) {
		this.businessId = businessId;
	}

	public String getFunctionId() {
		return functionId;
	}

	public void setFunctionId(String functionId) {
		this.functionId = functionId;
	}

	public String getGuideName() {
		return guideName;
	}

	public void setGuideName(String guideName) {
		this.guideName = guideName;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public BigDecimal getFileSize() {
		return fileSize;
	}

	public void setFileSize(BigDecimal fileSize) {
		this.fileSize = fileSize;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getPhyFileName() {
		return phyFileName;
	}

	public void setPhyFileName(String phyFileName) {
		this.phyFileName = phyFileName;
	}
}
