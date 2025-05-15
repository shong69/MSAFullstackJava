## mysql docker container 

### create container
```
docker run -it -d ^
--network net01 ^
--name mysql8 ^
-p 33306:3306 ^
-v D:\MSAFullstackJava\webWorkspace\data:/var/lib/mysql ^
-v D:\MSAFullstackJava\webWorkspace\sts01\sql:/sql ^
-e MYSQL_ROOT_PASSWORD=mysql ^
-e MYSQL_DATABASE=xe ^
-e MYSQL_USER=scott ^
-e MYSQL_PASSWORD=tiger ^
mysql:lts
```

### Restoring data (window ¾ÈµÊ)
```
docker exec -i mysql8 ^
sh -c 'exec mysql -u scott -ptiger' < D:\webWorkspace\web24\sql\dept.sql
```

### Restoring data (window)
```
docker exec -it mysql8 bash
bash-5.1# mysql -u scott -ptiger < /sql/dept.sql
```


### distroy 1
```
docker run -it -d --name step01 -p 8080:8080 --network net01 -v D:\MSAFullstackJava\webWorkspace\sts01\target:/usr/local/tomcat/webapps tomcat:9.0
```

### distroy 2
```
docker run -it -d --name step01 -p 8080:8080 --network net02 -v D:\MSAFullstackJava\webWorkspace\sts01:/sts01 tomcat:9.0
```



