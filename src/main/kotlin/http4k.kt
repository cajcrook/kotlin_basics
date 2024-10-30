
import org.http4k.core.Request
import org.http4k.core.Response
import org.http4k.core.Status
import org.http4k.server.Undertow
import org.http4k.server.asServer

fun main() {
    val app = { request: Request -> // lambda expression start // val = value declaration
        Response(Status.OK)
            .body("Hello, ${request.query("name")}!") // lambda expression ends
    }

    app.asServer(Undertow(9000)).start()

}

// Lambda Expressions
    // Are always surrounded by { }
    // They are functions without a name
    //A lambda expression is always surrounded by curly braces,
        // argument declarations go inside curly braces and
        // have optional type annotations,
        // the code_body goes after an arrow -> sign.
        // If the inferred return type of the lambda is not Unit,
        // then the last expression inside the lambda body is treated as return value.
        // eg val sum = {a: Int , b: Int -> a + b}

//Constructing a class
    // Noo explicit class constructor defined in the code,
    // you are calling the constructors of external classes
    // Response, Status.OK and Undertow can be considered classes

//What is the type of app?
    // (Request) -> Response
    // Represents a function that takes a single parameter (Request) and returns a -> Response

// How does the app value have a .asServer method?
    // asServer is an extension function provided by the external library Http4k.
    // It makes it possible to use the app as a server handler
    // by adding server capabilities to and Request -> Response function.
