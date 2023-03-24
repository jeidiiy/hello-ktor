package jeidiiy.io.plugins

import io.ktor.server.application.*
import io.ktor.server.routing.*
import jeidiiy.io.routes.customerRouting
import jeidiiy.io.routes.getOrderRoute
import jeidiiy.io.routes.listOrderRoute
import jeidiiy.io.routes.totalizeOrderRoute

fun Application.configureRouting() {
    routing {
        customerRouting()
        listOrderRoute()
        getOrderRoute()
        totalizeOrderRoute()
    }
}
