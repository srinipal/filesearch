package com.fileSearch.fileSearchEngine.common;


public class DocInfo {
    //docId associated with this Doc
    private int docId;
    //Full path of this document
    private String filePath;
    //Last modification date of this document in millis
    private long lastModifiedDate;
    
    private String baseFileName;
    private String fileType;
    private long fileSize;
    
    public String getBaseFileName() {
        return baseFileName;
    }

    public String getFileType() {
        return fileType;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setLastModifiedDate(Long lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public long getLastModifiedDate() {
        return lastModifiedDate;
    }
    
    public DocInfo(int docId, String filePath){
        this.docId = docId;
        this.filePath = filePath;
        //Get the Base FineName from absolute filePath
        this.baseFileName = CommonUtils.getBaseFileName(filePath);
        //Get the file extension from base file name
        this.fileType = CommonUtils.getFileExtension(baseFileName);
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public int getDocId() {
        return docId;
    }

    public String getFilePath() {
        return filePath;
    }
}
