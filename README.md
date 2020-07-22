# Some of the banner properties not populated when running with unpacked jar and custom banner

# Description

When running spring boot application with custom banner and unpacked jar as documented in [1],
the following banner properties that described in [2] are not printed

*   application.version
*   application.formatted-version
*   application.title

[1] [Deploying to Containers](https://docs.spring.io/spring-boot/docs/current/reference/html/deployment.html#containers-deployment)

[2] [Customizing the Banner](https://docs.spring.io/spring-boot/docs/2.2.8.RELEASE/reference/html/spring-boot-features.html#boot-features-banner)
# re-create

*   When running with jar:

```sh
mvn clean install
cd target
java -jar demo-banner-0.0.1-SNAPSHOT.jar
```

output:

```
DEMO BANNER START

application version           = 0.0.1-SNAPSHOT
application formatted version =  (v0.0.1-SNAPSHOT)
spring-boot version           = 2.2.8.RELEASE
spring-boot formatted version =  (v2.2.8.RELEASE)
application title             = demo-banner

DEMO BANNER END

```

*   When running with unpacked jar:
```sh
mvn clean install
cd target
jar -xf demo-banner-0.0.1-SNAPSHOT.jar
java -cp BOOT-INF/classes:BOOT-INF/lib/* com.example.demobanner.DemoBannerApplication
```


output:

```
DEMO BANNER START

application version           =
application formatted version =
spring-boot version           = 2.2.8.RELEASE
spring-boot formatted version =  (v2.2.8.RELEASE)
application title             =

DEMO BANNER END

```