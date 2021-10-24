# Database MYSQL Notes

Few notes to be added later. Let's see how we can connect our java application 
to Database.

## JDBC connection to MYSQL with JAVA
JDBC Stands for 'Java Database Connectivity'. Our java program can be connected
to database in ? steps. 

1. **Import Package** : We have to use package called 'java.sql.*;'

2. **Load Driver** : We need the driver class specific to our database. For mysql it is **com.mysql.jdbc.Driver**. This driver can be downloaded from mysql website and loaded into project as jar files or can be directly added to our project using build tools like *Maven* or *Gradle*. After that, we need to register the driver as well. This can be done by 'forName("com.mysql.jdbc.Driver");'

3. ****:  