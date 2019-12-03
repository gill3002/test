# Spring Boot Deploy Options
 
This example app shows how to deploy a Spring Boot application to Azure, AWS, and self-hosted WAR file.

Please read [Deploy Your Spring Boot The Right Way][blog-post] to see how this app was created.

**Prerequisites:** [Java 11](https://sdkman.io/sdks#java). 

> [Okta](https://developer.okta.com/) has Authentication and User Management APIs that reduce development time with instant-on, scalable user infrastructure. Okta's intuitive API and expert support make it easy for developers to authenticate, manage and secure users and roles in any application.

* [Getting Started](#getting-started)
* [Links](#links)
* [Help](#help)
* [License](#license)

## Getting Started

To install this example application, run the following commands:

```bash
git clone https://github.com/oktadeveloper/okta-spring-boot-deploy.git
cd okta-spring-boot-deploy
```

This will get a copy of the project installed locally. To install all of its dependencies and start each app, follow the instructions below.

To run the server:
 
```bash
./mvnw spring-boot:run
```

### Create an Application in Okta

Log in to your Okta Developer account (or [sign up](https://developer.okta.com/signup/) if you don’t have an account).

1. From the **Applications** page, choose **Add Application**.
2. On the Create New Application page, select **Web**.
3. Give your app a memorable name, add `http://localhost:8080/login/oauth2/code/okta` as a Login redirect URI, then click **Done**.

Copy your issuer (found under **API** > **Authorization Servers**), client ID, and client secret into `src/main/resources/application.properties` as follows:

```properties
okta.oauth2.issuer: https://{yourOktaDomain}/oauth2/default
okta.oauth2.client-id: {yourClientID}
okta.oauth2.client-secret: {yourClientSecret}
```

**NOTE:** The value of `{yourOktaDomain}` should be something like `dev-123456.okta.com`. Make sure you don't include `-admin` in the value!

After modifying this file, start the example with `./mvnw spring-boot:run`. You should be able to authenticate with Okta at `http://localhost:8080`.


## Links

This example uses the following open source libraries from Okta:

* [Okta Spring Boot Starter](https://github.com/okta/okta-spring-boot#readme)

## Help

Please post any questions as commnets on the [blog post][blog-post] or ask them on the [Okta Developer Forums](https://devforum.okta.com/). Our whole team monitors this channel and will see your questions. You can also enter them as issues on this project or ask them on Stack Overflow and add the `okta` tag.

## License

Apache 2.0, see [LICENSE](LICENSE).

[blog-post]: https://developer.okta.com/blog/2019/12/03/spring-boot-deploy-options
