package labor.learn.commands

import labor.learn.commands.Command
import labor.learn.commands.Result.Companion
import labor.learn.commands.Result.Companion.invalid
import java.util.Arrays

class CommandRouter(
    val commands: Map<String, Command>,
    val outputer: Outputer,
) {
    private fun invalidCommand(input: String): Result {
        outputer.output(String.format("couldn't understand \"%s\". please try again.", input))
        return invalid()
    }

    fun route(input: String): Result {
        val splitInput = split(input)

        if (splitInput.isEmpty()) {
            return invalidCommand(input)
        }

        val commandKey = splitInput[0]
        val command: Command = commands[commandKey] ?: return invalidCommand(input)

        val args = splitInput.subList(1, splitInput.size)
        val result = command.handleInput(args)

        if (result.status == Status.INVALID) return invalidCommand(input)

        return result
    }

    companion object {
        fun split(input: String): List<String> = input.trim().split(("\\s+"))
    }
}
