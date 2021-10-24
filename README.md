# Database MYSQL Notes

Few notes to be added later. Let's see how we can connect our java application 
to Database.

## JDBC connection to MYSQL with JAVA
JDBC Stands for 'Java Database Connectivity'. Our java program can be connected
to database in 7 steps. 

1. **Import Package** : We have to import package called `java.sql.*;`

2. **Load Driver** : We need the driver class specific to our database. For mysql it is **com.mysql.jdbc.Driver**. This driver can be downloaded from mysql website and loaded into project as jar files or can be directly added to our project using build tools like *Maven* or *Gradle*. After that, we need to register the driver as well. This can be done by method call `Class.forName("com.mysql.jdbc.Driver");`

3. **Establish the Connection**: We have to create an instance of the Connection interface.

4. **Create the Statement**.
5. **Execute the Query**: Then we can execute the SQL query from here. We can  get response in table structure or number of rows affected by our DML query.
6. **Process Result**: We can make necessary use of the obtained query result.
7. **Close the Connection**.