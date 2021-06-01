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
