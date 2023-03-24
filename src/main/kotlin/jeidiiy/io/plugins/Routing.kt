package jeidiiy.io.plugins

import io.ktor.server.application.*
import io.ktor.server.routing.*
import jeidiiy.io.routes.customerRouting

fun Application.configureRouting() {
    routing {
        customerRouting()
    }
}
