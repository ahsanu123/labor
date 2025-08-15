package labor.learn.commands

import labor.learn.commands.Result
import java.util.ArrayDeque
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CommandProcessor
@Inject
constructor(
    firstCommandRouter: CommandRouter,
) {
    private val commandRouterStack = ArrayDeque<CommandRouter>()

    init {
        commandRouterStack.push(firstCommandRouter)
    }

    fun process(input: String) {
        check(!commandRouterStack.isEmpty()) { "no command router is available" }

        val result = commandRouterStack.peek().route(input)

        when (result.status) {
            Status.INPUT_COMPLETED -> commandRouterStack.pop()

            Status.HANDLED -> result.nestedCommandRouter().ifPresent { commandRouterStack::push }

            Status.INVALID -> result.status()
        }

        throw AssertionError(result.status)
    }
}
