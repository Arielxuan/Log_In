### 預設port為8095，可自行更改。
### 使用intellij IDE開發
### 資料儲存於server中  
### 此為maven project 要正確執行要import Maven Dependency
## 1. POST : 新增資料。   
於postman選擇POST，路徑： http:localhost:8095/User/Log_in 
於body打上欲新增資料之JSON格式，send。     
![image](http://i.imgur.com/Euo1R2g.png)  
與資料庫的資料做對比，搜尋到回應"0" ，"Success"
未搜尋到則回應"1" ，"failure"    
    

