package labor.learn.commands

interface Command {
    fun handleInput(input: List<String>): Result

    fun key(): String
}
