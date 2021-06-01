# flyway-boot
using Flyway with SpringBoot 

![image](https://user-images.githubusercontent.com/17804600/120299995-d30e2000-c2cb-11eb-9c30-c7d5e3f079bb.png)

Add Flyway Maven Plugin

Flyway maven plugin version has been defined in the POM pararent, i.e. Spring boot dependency management section.  

````
            <plugin>
                <groupId>org.flywaydb</groupId>
                <artifactId>flyway-maven-plugin</artifactId>
                <configuration>
                    <url>jdbc:postgresql://localhost:5435/flywayboot</url>
                    <user>postgres</user>
                    <password>test</password>
                    <schemas>
                        <schema>public</schema>
                    </schemas>
                </configuration>
            </plugin>
````

**Create migration script**

at the classpath:db/migration

Flyway adheres to the following naming convention for migration scripts:

<Prefix><Version>__<Description>.sql

Where:

\<Prefix\>:  *Default prefix is **V***, which may be configured in the flyway configuration file using the flyway.sqlMigrationPrefix property.
            
\<Version\>:  Migration version number. Major and minor versions may be separated by an underscore. *The migration version should always start with 1*.
            
\<Description\>:  *Textual description of the migration*. The description needs to be separated from the version numbers with *a double underscore*.
            
Example: V1_1_0__my_first_migration.sql

After running application, a flyway migration history table is created
            
![image](https://user-images.githubusercontent.com/17804600/120349148-25683480-c2fe-11eb-9412-00b9d5e8f524.png)
            
**First migration**

run flyway maven plugin : flyway:migrate
            
![image](https://user-images.githubusercontent.com/17804600/120356095-45025b80-c304-11eb-9e3f-792735312913.png)
            
database mirgration table updated, and new table created
            
![image](https://user-images.githubusercontent.com/17804600/120356298-79761780-c304-11eb-843b-e51ecf1a5f6c.png)
            
            
            
            
            
            
            
