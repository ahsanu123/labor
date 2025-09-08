package labor.learn

import labor.learn.commands.Command
import labor.learn.commands.Outputer
import labor.learn.commands.Result
import javax.inject.Inject

class HelloWorldCommand
    @Inject
    constructor(
        val outputer: Outputer,
    ) : Command {
        override fun handleInput(input: List<String>): Result {
            if (!input.isEmpty()) return Result.invalid()

            outputer.output("Howdy!!!")

            return Result.handled()
        }

        override fun key(): String = "HelloWorldCommand"
    }
