# Rafael Forum API

This is a Rest API for online forum control with endpoints for listing, inserting, updating, with security and authentication control.

**Stacks**: *SpringBoot, Spring Devtools, Spring Data e Bean Validation, Spring Cache, Spring Security e JWT, Spring Boot Actuator, Spring Fox e Swagger, h2 Database.

* To run the application it is necessary to run the simple **command**: 
  ```sh
  docker-compose up -d --build
  ```


**Application:**

The docker will build the application and run it with the parameters configured in env_file.env.

To acess the application:
  ```sh
  http://localhost:8080/
  ```

To check out the complete API documentation go to swagger [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html#/).

**Monitoring:**

To monitor the application we have support for [Spring Boot Admin](https://github.com/codecentric/spring-boot-admin), we only need to set the **FORUM_MONITOR_ADMIN_URL** parameter in the env_file.env file.

To upload the Spring Boot Admin it is necessary to download the image available in the repository [spring-boot-monitor-admin](https://github.com/rafaelwagner/spring-boot-monitor-admin)

<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some Amazing Feature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

<!-- CONTACT -->
## Contact

Rafael Loureiro Wagner - [@rafael.wagner9](https://www.linkedin.com/in/rafael-loureiro-wagner/) - rafaelwagner09@hotmail.com

Project Link: [https://github.com/rafaelwagner/go-rafaelstore](https://github.com/rafaelwagner/go-rafaelstore)
