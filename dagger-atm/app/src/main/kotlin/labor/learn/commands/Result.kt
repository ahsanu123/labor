package labor.learn.commands

import java.util.Optional

interface Command {
    fun handleInput(input: List<String>): Result
}

enum class Status {
    INVALID,
    HANDLED,
    INPUT_COMPLETED,
}

class Result(
    val status: Status,
    val nestedCommandRouter: Optional<CommandRouter>,
) {
    fun status() = status
    fun nestedCommandRouter() = nestedCommandRouter

    companion object {
        fun invalid(): Result = Result(Status.INVALID, Optional.empty())

        fun handled(): Result = Result(Status.HANDLED, Optional.empty())

        fun inputCompleted(): Result = Result(Status.INPUT_COMPLETED, Optional.empty())

        fun enterNestedCommand(nestedCommandRouter: CommandRouter): Result =
            Result(Status.HANDLED, Optional.of(nestedCommandRouter))
    }
}
