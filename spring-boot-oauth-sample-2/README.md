# Spring Boot with OAuth 2

A basic spring boot example using OAuth condifuration

---

To generate the certificate :

`keytool -genkeypair -alias jwt -keyalg RSA -dname "CN=jwt, L=Lugano, S=Lugano, C=CH" -keypass mySecretKey -keystore jwt.jks -storepass mySecretKey`
