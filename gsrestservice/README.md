# spring.io-guides

Please refer to URL- https://spring.io/guides/gs/rest-service/

#Building a RESTful Web Service

This guide walks you through the process of creating a "hello world" RESTful web service with Spring.

#What you’ll build
You’ll build a service that will accept **HTTP GET** requests at:

_http://localhost:8080/greeting_

and respond with a **JSON** representation of a greeting:

_{"id":1,"content":"Hello, World!"}_

You can customize the greeting with an optional **name** parameter in the query string:

_http://localhost:8080/greeting?name=User_

The name parameter value overrides the default value of "World" and is reflected in the response:

_{"id":1,"content":"Hello, User!"}_

