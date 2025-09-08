package labor.learn

import labor.learn.commands.Command
import labor.learn.commands.Result

abstract class SingleArgCommand : Command {
    final override fun handleInput(input: List<String>): Result {
        val inputEqualTo1 = input.size == 1

        if (inputEqualTo1) {
            return handleArg(input[0])
        }

        return Result.invalid()
    }

    protected abstract fun handleArg(arg: String): Result
}
