package com.example.riddl.test;

import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBAttribute;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBHashKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBRangeKey;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBTable;

/* Dynammoテーブル名*/
@DynamoDBTable(tableName = "Books")
public class Books {

    private String author;
    private String title;
    private int price;
    private String releasedate;

/* パーティションキーで指定した属性名 */
    @DynamoDBHashKey(attributeName = "Author")
    public String getAuthor() {return author; }
    public void setAuthor(String author) { this.author = author; }

/* ソートキーで指定した属性名 */
    @DynamoDBRangeKey(attributeName = "Title")
    public String getTitle() {return title; }
    public void setTitle(String title) { this.title = title; }

/* 任意の属性名 AWSコンソールで事前定義不要*/
    @DynamoDBAttribute(attributeName = "Price")
    public int getPrice() {return price; }
    public void setPrice(Integer price) { this.price = price; }

/* 任意の属性名 AWSコンソールで事前定義不要*/
    @DynamoDBAttribute(attributeName = "Releasedate")
    public String getReleasedate() {return releasedate; }
    public void setReleasedate(String releasedate) { this.releasedate = releasedate; }

}