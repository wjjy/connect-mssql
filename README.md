# MSSQL Java Client using Windows Authentication
This is a sample java client that connects to an MSSQL database using Windows Authentication, and runs a sample sql query. It uses the jTDS JDBC Driver.  

## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites
- Install Maven (needed to compile code / dependencies)

### Installing
- clone the repository
- edit /src/main/java/com/mycompany/app/App.java and edit the jdbc connection string with your values. You will want to fill in [SQL_SERVER_HOSTNAME], [DATABASE_NAME], [DOMAIN NAME], [USERNAME], and [PASSWORD].
- change the sample sql query to something reasonable. 
- cd connect-mssql
- mvn clean package

### Running
- cd connect-mssql/target
- java -jar ConnectMSSQL-1.0-SNAPSHOT-jar-with-dependencies.jar
- this should print the results of your sql query, or any errors that occurred while connecting.

## License
This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
