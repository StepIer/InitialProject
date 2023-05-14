package com.stepler.initialproject.navigation

object NavigationRoute {
    const val ROUTE_MAIN = "route_main"
}

object NavigationArguments {

}

fun destinationString(route: String, vararg arguments: String): String {
    var dest = route
    var isFirstArg = true
    arguments.forEach {
        if (!isFirstArg) {
            dest += ","
        } else {
            isFirstArg = !isFirstArg
        }
        dest += "?$it={$it}"
    }
    return dest
}

fun navigateString(route: String, vararg arguments: Pair<String, Any>): String {
    var dest = route
    var isFirstArg = true
    arguments.forEach {
        if (!isFirstArg) {
            dest += ","
        } else {
            isFirstArg = !isFirstArg
        }
        dest += "?${it.first}=${it.second}"
    }
    return dest
}